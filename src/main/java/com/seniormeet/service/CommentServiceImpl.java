package com.seniormeet.service;

import com.seniormeet.model.Comment;
import com.seniormeet.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CommentServiceImpl implements CommentService {

    private CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comment> findComments() {

        return new ArrayList<>(commentRepository.findAllByOrderByDateDesc());
    }

    @Override
    public Comment findById(Long id) {
        return commentRepository.findById(id).orElse(null);
    }

    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Comment updateComment(Long id,Comment comment) {
        Optional<Comment> commentOptional = commentRepository.findById(id);
        if (commentOptional.isPresent()){
            Comment existingComment = commentOptional.get();
            existingComment.setContent(comment.getContent());
            existingComment.setDate(comment.getDate());
            return commentRepository.save(existingComment);
        }
        return null;
    }

    @Override
    public boolean deleteComment(Long id) {
        Optional<Comment> commentOptional = commentRepository.findById(id);
        if (commentOptional.isPresent()){
            commentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
