package com.seniormeet.controller;

import com.seniormeet.dto.Login;
import com.seniormeet.dto.Register;
import com.seniormeet.dto.Token;
import com.seniormeet.exception.NotModifiedException;
import com.seniormeet.model.Group;
import com.seniormeet.model.Hobby;
import com.seniormeet.model.User;
import com.seniormeet.model.UserRole;
import com.seniormeet.repository.UserRepository;
import com.seniormeet.security.SecurityUtils;
import com.seniormeet.service.FileService;
import com.seniormeet.service.GroupService;
import com.seniormeet.service.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final GroupService groupService;
    private final UserRepository userRepo;
    private final FileService fileService;
    private final PasswordEncoder passwordEncoder;

    public UserController(UserService userService, GroupService groupService, UserRepository userRepo, FileService fileService,
            PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.groupService = groupService;
        this.userRepo = userRepo;
        this.fileService = fileService;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        SecurityUtils.getCurrentUser().ifPresent(System.out::println);
        List<User> users = userService.findUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = userService.findById(id);
        if (user!=null)
            return ResponseEntity.ok(user);
        return ResponseEntity.notFound().build();
    }

    @GetMapping("groups2/current-user")
    public ResponseEntity<List<Group>> getUserGroups2() {
        Long userId = SecurityUtils.getCurrentUser().orElseThrow().getId();
        List<Group> groups = userService.getUserGroups(userId);
        return ResponseEntity.ok(groups);
    }
    @GetMapping("/{userId}/groups")
    public ResponseEntity<List<Group>> getUserGroups(@PathVariable Long userId) {
        List<Group> groups = userService.getUserGroups(userId);
        return ResponseEntity.ok(groups);
    }

    @GetMapping("/{userId}/hobbies")
    public ResponseEntity<List<Hobby>> getUserHobbies(@PathVariable Long userId) {
        List<Hobby> hobbies = userService.getUserHobbies(userId);
        return ResponseEntity.ok(hobbies);
    }

    @PostMapping("/{userId}/groups/{groupId}")
    public ResponseEntity<Boolean> addUserToGroup(@PathVariable Long userId, @PathVariable Long groupId) {
        userService.addUserToGroup(userId, groupId);
        return ResponseEntity.ok(true);
    }

    @PostMapping("/{userId}/hobbies/{hobbyId}")
    public ResponseEntity<String> addHobbyToUser(@PathVariable Long userId, @PathVariable Long hobbyId) {
        userService.addHobbyToUser(userId, hobbyId);
        return ResponseEntity.ok("Hobby added to user successfully");
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user, @RequestParam("photo") MultipartFile file) throws IOException {
        User createdUser = userService.createUser(user, file);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }


    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        if (updatedUser != null) {
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Post para la foto

    @PostMapping("/photo")
    public User create(
            @RequestParam(value = "photo", required = false) MultipartFile file,
            User user){

        if (this.userRepo.existsByEmail(user.getEmail())) {
            throw new BadCredentialsException("Email ocupado");
        }

        if(file != null && !file.isEmpty()) {
            String fileName = fileService.store(file);
            user.setPhotoUrl(fileName);
        } else {
            user.setPhotoUrl("avatar.png");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return this.userRepo.save(user);
    }

    // Put para la foto
    @PutMapping("/photo/{id}")
    public ResponseEntity<User> update(
            @PathVariable Long id,
            User user,
            @RequestParam(value = "photo", required = false) MultipartFile file
    ){
        if(!this.userRepo.existsById(id))
            return ResponseEntity.notFound().build();

        if(file != null && !file.isEmpty()) {
            String fileName = fileService.store(file);
            user.setPhotoUrl(fileName);
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return ResponseEntity.ok(this.userRepo.save(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        boolean deleted = userService.deleteUser(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
//esta parte la hizo ALAN no la borren.
    @GetMapping("add-group/{id}")
    public ResponseEntity<User> addGroupToUser(@PathVariable Long id) {
        // TODO recuperar el usuario de base de datos gracias a la Security (lo hará Alan en clase)
        //User user = new User();
        User user = SecurityUtils.getCurrentUser().orElseThrow();
        Group group = groupService.findById(id);
        if(!user.getGroups().contains(group)) {
            user.getGroups().add(group);
            return ResponseEntity.ok(userService.updateUser(user.getId(), user));
        }

        return ResponseEntity.notFound().build();
    }


    @PostMapping("/register")
    public void register(@RequestBody Register register) {
        if (this.userRepo.existsByEmail(register.email())) {
            throw new BadCredentialsException("Email ocupado");
        }

        //User user = new User(null, null, null, register.email(), register.password(),null, null, null, null, null, null, null, UserRole.USER, null, null);
        User user = User.builder()
                .email(register.email())
                .password(passwordEncoder.encode(register.password()))
                .role(UserRole.USER)
                .build();
        this.userRepo.save(user);
    }


    @PostMapping("/login")
    public Token login(@RequestBody Login login) {
        if (!this.userRepo.existsByEmail(login.email()))
            throw new NoSuchElementException("Usuario no encontrado!");

        User user = this.userRepo.findByEmail(login.email()).orElseThrow();

        if (!passwordEncoder.matches(login.password(), user.getPassword()))
            throw new BadCredentialsException("Las passwords no coinciden");

//        String token = Jwts.builder()
//                .signWith(Keys.hmacShaKeyFor("admin".getBytes()), SignatureAlgorithm.HS512)
//                .setHeaderParam("typ", "JWT")
//                .setSubject(String.valueOf(user.getId()))
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + (3600 * 24 * 1000)))
//                .claim("email", user.getEmail())
//                .claim("role", "admin")
//                .compact();

//        String token = Jwts.builder()
//                // id del usuario
//                .subject(String.valueOf(user.getId()))
//                // La clave secreta para firmar el token y saber que es nuestro cuando lleguen las peticiones del frontend
//                .signWith(Keys.hmacShaKeyFor("admin1234admin1234admin1234admin1234admin1234admin1234".getBytes()))
//                // Fecha emisión del token
//                .issuedAt(new Date())
//                // información personalizada: rol, username, email...
//                .claim("role", "admin")
//                // Construye el token
//                .compact();

        Date issuedDate = new Date();
        long nextWeekMillis = TimeUnit.DAYS.toMillis(7);
        Date expirationDate = new Date(issuedDate.getTime() + nextWeekMillis);
        byte[] key = Base64.getDecoder().decode("FZD5maIaX04mYCwsgckoBh1NJp6T3t62h2MVyEtdo3w=");

        String token = Jwts.builder()
                // id del usuario
                .subject(String.valueOf(user.getId()))
                // La clave secreta para firmar el token y saber que es nuestro cuando lleguen las peticiones del frontend
                .signWith(Keys.hmacShaKeyFor(key))
                // Fecha emisión del token
                .issuedAt(issuedDate)
                // Fecha de expiración del token
                .expiration(expirationDate)
                // información personalizada: rol, username, email...
                .claim("role", user.getRole())
                .claim("email", user.getEmail())
                // Construye el token
                .compact();

        return new Token(token);

    }


    @GetMapping("/account")
    public User getCurrentUser() {
        SecurityUtils.getCurrentUser().ifPresent(System.out::println);
        User user = SecurityUtils.getCurrentUser().orElseThrow();
        System.out.println(user.getGroups());
        return user;
    }


    @PutMapping("/account")
    public User update(@RequestParam(value = "photo", required = false) MultipartFile file, User user) {
        // Si está autenticado y es ADMIN o es el mismo usuario que la variable user
        // entonces actualizar, en caso contrario no actualizamos
        SecurityUtils.getCurrentUser().ifPresent(currentUser-> {
            if (currentUser.getRole() == UserRole.ADMIN || Objects.equals(currentUser.getId(), user.getId())) {

                if(file != null && !file.isEmpty()) {
                    String fileName = fileService.store(file);
                    user.setPhotoUrl(fileName);
                }
                user.setPassword(passwordEncoder.encode(user.getPassword()));
                this.userRepo.save(user);
            } else {
                throw new NotModifiedException("No puede actualizar");
            }
        });
        return user;
    }
}