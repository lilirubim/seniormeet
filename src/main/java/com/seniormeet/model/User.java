package com.seniormeet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "sm_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private String codigoPostal;
    private String ciudad;
    //@Enumerated(EnumType.STRING)
    private Sexo sexo;
    private LocalDate fechaNacimiento;
    @Column(name="photo_url")
    private String photoUrl;
    private Boolean available;
    @Enumerated(EnumType.STRING)
    private UserRole role;


    @ManyToMany
    @JoinTable(name = "sm_user_groups",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    //@JsonIgnoreProperties("users")
    @JsonIgnore
    @ToString.Exclude
    private List<Group> groups = new ArrayList<>();


    @ManyToMany
    @JoinTable(name = "sm_user_hobbies",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "hobby_id")
    )
    //@JsonIgnoreProperties("users")
    @JsonIgnore
    @ToString.Exclude
    private List<Hobby> hobbies = new ArrayList<>();

//    @ManyToMany(mappedBy = "users") //(mappedBy = "user",fetch = FetchType.LAZY)
//    @ToString.Exclude
//    @JsonIgnoreProperties("users")
//    private List<Interaction> interactions = new ArrayList<>();

//    @OneToMany(mappedBy = "user") //(mappedBy = "user" , fetch = FetchType.LAZY)
//    @ToString.Exclude
//    //@JsonBackReference
//    private List<Post> posts = new ArrayList<>();

}