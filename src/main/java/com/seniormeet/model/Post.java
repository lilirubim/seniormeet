package com.seniormeet.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sm_post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content; //Length = 5000 integrar un editor

    private  String photoUrl;

    private String videoUrl; //video de youtube
    //en modo normal el grupo es null
    //dentro de un grupo entonces tiene objeto Grupo
    //private Group group;

}