package com.seniormeet.repository;

import com.seniormeet.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}