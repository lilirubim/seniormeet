package com.seniormeet.model;

import java.time.LocalDateTime;

public class UserFollow {

    private Long id;

    private User followed;

    private User follower;

    private LocalDateTime date;
}