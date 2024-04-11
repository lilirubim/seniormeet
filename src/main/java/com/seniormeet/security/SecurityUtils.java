package com.seniormeet.security;

import com.seniormeet.model.User;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class SecurityUtils {

    public static Optional<User> getCurrentUser() {

        Object pricipal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (pricipal instanceof User user) {
            return Optional.of(user);
        }
        return Optional.empty();
    }
}
