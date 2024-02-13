package com.seniormeet.Entidades;

import java.time.LocalDateTime;

// entidad intermedia entre User y Post
public class Interaction {

    private Long id;

    private Boolean liked;
    private LocalDateTime likedDate;

    private Boolean shared;
    private LocalDateTime sharedDate;

    private Boolean saved;
    private LocalDateTime savedDate;

    private String comment;
    private LocalDateTime commetDate;

    private User user;
    private Post post;
}
