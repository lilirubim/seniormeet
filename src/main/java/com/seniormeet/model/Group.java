package com.seniormeet.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
//se agrego metodos
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "sm_group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    private String rules;
    private String photoUrl;

    //private User user;

    @ManyToMany(mappedBy = "groupList")
    private List<User> users = new ArrayList<>();
}