package com.seniormeet.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.ToOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(name = "sm_post_interactions",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "interaction_id")
    )
    @JsonIgnoreProperties("posts")
    @ToString.Exclude
    Set<Interaction> interactions = new HashSet<>();

    @OneToMany
    Set<Comment> comments = new HashSet<>();

}