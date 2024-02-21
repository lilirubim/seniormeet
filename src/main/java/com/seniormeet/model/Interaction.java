package com.seniormeet.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
// entidad intermedia entre User y Post
@Table(name = "interactions")
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

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne
    @JoinColumn(name = "post_id")
    private Post post;

    // asociación interacciones de users ?
    @ManyToMany
    @ToString.Exclude
    private List<User> users = new ArrayList<>();
}