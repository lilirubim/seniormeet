package com.seniormeet.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
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

    @Column(nullable = true)
    private byte[] photo;

    @Enumerated(EnumType.STRING)
    private UserRole role;


    @ManyToMany
    @JoinTable(name = "sm_user_groups",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    @JsonIgnoreProperties("users")
    @ToString.Exclude
    private List<Group> groups = new ArrayList<>();


    @ManyToMany
    @JoinTable(name = "sm_user_hobbies",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "hobby_id")
    )
    @JsonIgnoreProperties("users")
    @ToString.Exclude
    private List<Hobby> hobbies = new ArrayList<>();


}