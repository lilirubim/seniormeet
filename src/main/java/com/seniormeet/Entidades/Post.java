package com.seniormeet.Entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String content; //Length = 5000 integrar un editor

    private  String photoUrl;

    private String videoUrl; //video de youtube
    //en modo normal el grupo es null
    //dentro de un grupo entonces tiene objeto Grupo

    private PostType postType;

    private Group group;

    private User user;

    @OneToMany
    List<Interaction> interactions = new ArrayList<>();

    @OneToMany
    List<Comment> comments = new ArrayList<>();



}
