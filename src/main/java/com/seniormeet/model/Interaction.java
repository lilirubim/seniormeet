package com.seniormeet.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;




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


}
