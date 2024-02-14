package com.seniormeet.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

// entidad intermedia entre User y Post
@Entity
@Table(name = "sm_interaction")
public class Interaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean liked;
    private LocalDateTime likedDate;

    private Boolean shared;
    private LocalDateTime sharedDate;

    private Boolean saved;
    private LocalDateTime savedDate;

    private String comment;
    private LocalDateTime commetDate;

    //private User user;
    //private Post post;

}
