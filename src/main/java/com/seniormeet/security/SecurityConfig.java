package com.seniormeet.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    private final RequestJWTFilter jwtFilter;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    public SecurityConfig(RequestJWTFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }

    /*
    Personalizar el objeto HttpSecurity de Spring para utilizar nuestro filtro JWT
    y proteger controladores
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // Sin estados, sin sesiones Http ya q usamos token jwt
        // Jwt es sin estados y no depende de sesiones o cookies
        http.csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        // proteger rutas
        http.authorizeHttpRequests()
                .requestMatchers("user/login").permitAll()
                .requestMatchers("user/register").permitAll()
                .requestMatchers("**").permitAll()
                //.requestMatchers(HttpMethod.POST, "user/**").hasAuthority(UserRole.ADMIN.name())
                .anyRequest().authenticated();

        // asignar nuestro filtro personalizado de Jwt
        http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);


        return http.build();
    }
}
