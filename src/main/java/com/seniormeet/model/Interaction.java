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

    private Boolean liked;
    private LocalDateTime likedDate;

    private Boolean shared;
    private LocalDateTime sharedDate;

    private Boolean saved;
    private LocalDateTime savedDate;



    @ManyToMany(mappedBy = "interactions", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("interactions")
    @ToString.Exclude
    private List<Post> posts = new ArrayList<>();;

    @ManyToOne//(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("interactions")
    //@JsonManagedReference
    private User user;

    @JsonIgnoreProperties("interactions")
    @ManyToMany
    @JoinTable(
            name = "sm_post_interactions",
            joinColumns = @JoinColumn(name = "interaction_id"),
            inverseJoinColumns = @JoinColumn(name = "post_id")
    )
    private List<Post> posts;

}
