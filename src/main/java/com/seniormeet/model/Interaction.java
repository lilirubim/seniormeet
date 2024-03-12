package com.seniormeet.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "sm_interaction")
public class Interaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Enumerated(EnumType.STRING)
    private InteractionType type;

    private LocalDateTime date;

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "post_id")
    private Post post;

//    @ManyToMany(mappedBy = "interactions")
//    @JsonIgnoreProperties("interactions")
//    @ToString.Exclude
//    /*@JoinTable(
//            name = "sm_post_interactions",
//            joinColumns = @JoinColumn(name = "interaction_id"),
//            inverseJoinColumns = @JoinColumn(name = "post_id")
//    )
//
//     */
//    private List<Post> posts = new ArrayList<>();

}
