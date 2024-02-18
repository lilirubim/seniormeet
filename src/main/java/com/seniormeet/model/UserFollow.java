package com.seniormeet.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "sm_user_follow")
public class UserFollow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //private User followed;

    //private User follower;
    @Column(name = "creation_date")
    private LocalDateTime creationDate;
}