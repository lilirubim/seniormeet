package com.seniormeet.service;

import com.seniormeet.model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findComments();

    Comment findById(Long id);

    Comment createComment(Comment comment);

    Comment updateComment(Long id,Comment comment);

    boolean deleteComment(Long id);
}
