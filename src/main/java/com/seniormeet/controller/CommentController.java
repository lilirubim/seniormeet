package com.seniormeet.controller;

import com.seniormeet.model.Comment;
import com.seniormeet.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    private final CommentService commentService;


    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping()
    public ResponseEntity<List<Comment>> findAll(){
        List<Comment> comments = commentService.findComments();
        return ResponseEntity.ok(comments);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Comment> findById(@PathVariable Long id){
        Comment comment = commentService.findById(id);
        if (comment!=null)
            return ResponseEntity.ok(comment);
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment){
        Comment createdComment = commentService.createComment(comment);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdComment);
    }

    @PutMapping("{id}")
    public ResponseEntity<Comment> updateComment(@PathVariable Long id, @RequestBody Comment comment){
        Comment updatedComment = commentService.updateComment(id,comment);
        if (updatedComment!=null)
            return ResponseEntity.ok(updatedComment);
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long id){
        boolean deletedComment = commentService.deleteComment(id);
        if (deletedComment)
            return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }

}
