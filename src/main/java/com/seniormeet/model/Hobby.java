package com.seniormeet.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sm_hobby")
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    // añadir foto
    @Column(name = "photo_url")
    private String photoUrl;

    @ManyToMany(mappedBy = "hobbies", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("hobbies")
    @ToString.Exclude
    private List<User> users = new ArrayList<>();
}
