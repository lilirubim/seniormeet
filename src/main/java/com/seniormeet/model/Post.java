package com.seniormeet.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "sm_post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content; //Length = 5000 integrar un editor

    private  String photoUrl;

    private String videoUrl; //video de youtube

    @OneToOne
    private Group group;

    @OneToOne
    private User user;
    //en modo normal el grupo es null
    //dentro de un grupo entonces tiene objeto Grupo


    @OneToMany
    List<Interaction> interactions;

    @OneToMany
    List<Comment> comments;

}