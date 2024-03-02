package com.seniormeet.repository;

import com.seniormeet.model.Comment;
import com.seniormeet.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
