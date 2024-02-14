package com.seniormeet.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sm_group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    private String rules;
    private String photoUrl;

}