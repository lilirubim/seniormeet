package com.seniormeet.security;


import com.seniormeet.model.User;
import com.seniormeet.repository.UserRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Base64;
import java.util.Optional;

/*
Clase para:

1. interceptar las peticiones HTTP entrantes
2. extraer el token JWT de las cabeceras
3. verificar que el token es correcto (está firmado por nosotros)
4. extraer el usuario del token

 */
@Component
@Slf4j
public class RequestJWTFilter extends OncePerRequestFilter {

    private final UserRepository userRepository;

    public RequestJWTFilter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        log.info("Hola ejecutando filtro para JWT ");

        // 1. Extraer de la cabecera Authorization de la request.
        String bearerToken = request.getHeader("Authorization");
        String token = "";
        if (StringUtils.hasLength(bearerToken) &&  bearerToken.startsWith("Bearer")) {
            token = bearerToken.substring("Bearer ".length());
        } else {
            filterChain.doFilter(request, response);
            return;
        }
        log.info("Extraído token JWT {}", token);

        // 2. Verificar el token JWT
        byte[] key = Base64.getDecoder().decode("FZD5maIaX04mYCwsgckoBh1NJp6T3t62h2MVyEtdo3w=");
        String userId = Jwts.parser()
                .verifyWith(Keys.hmacShaKeyFor(key))
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getSubject();

        log.info("Id de usuario {} ", userId);


        // 3- Obtener user con el id del token
        Optional<User> userOptional = this.userRepository.findById(Long.valueOf(userId));
        if (userOptional.isEmpty()) {
            log.warn("Usuario no encontrado ", userId);
            // no hay usuario error 401 UNAUTHORIZED
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
            return;
        }

        // 4- Crear objeto con datos del user en el contexto de seguridad Spring Security
        // Obligatorio starter Spring Security en pom.xml
        User user = userOptional.get();
        SimpleGrantedAuthority role = new SimpleGrantedAuthority(user.getRole().name());
        Authentication auth = new UsernamePasswordAuthenticationToken(user, null, null);
        SecurityContextHolder.getContext().setAuthentication(auth);

        // Dejar pasar la peticion para q continue
        filterChain.doFilter(request, response);
    }
}
