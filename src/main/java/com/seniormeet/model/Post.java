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
@Table(name = "sm_post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content; //Length = 5000 integrar un editor

    private  String photoUrl;

    private String videoUrl; //video de youtube

    //@OneToOne
    //private Group group;

    // si se pone lazy entonces hay que hacer un JPQL
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("posts")
    //@JsonManagedReference
    private User user;

    // terminadas en many ya son lazy por defecto no hace falta ponerlo
//    @ManyToMany()
//    @JoinTable(name = "sm_post_interactions",
//            joinColumns = @JoinColumn(name = "post_id"),
//            inverseJoinColumns = @JoinColumn(name = "interaction_id")
//    )


//    @JsonIgnoreProperties("posts")
//    @ToString.Exclude
//    List<Interaction> interactions = new ArrayList<>();

    //@OneToMany
    //List<Comment> comments;

}