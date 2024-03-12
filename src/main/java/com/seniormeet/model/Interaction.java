package com.seniormeet.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
// entidad intermedia entre User y Post
@Table(name = "sm_interaction")
public class Interaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    InteractionType type;

    private Boolean liked;
    private LocalDateTime likedDate;

    private Boolean shared;
    private LocalDateTime sharedDate;

    private Boolean saved;
    private LocalDateTime savedDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    private User user;


    @ManyToMany
    @JsonIgnoreProperties("interactions")
    @ToString.Exclude
    @JoinTable(
            name = "sm_post_interactions",
            joinColumns = @JoinColumn(name = "interaction_id"),
            inverseJoinColumns = @JoinColumn(name = "post_id")
    )
    private List<Post> posts;
}
