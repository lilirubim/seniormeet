package com.seniormeet.controller;

import com.seniormeet.model.Comment;
import com.seniormeet.model.Interaction;
import com.seniormeet.model.Post;
import com.seniormeet.service.CommentService;
import com.seniormeet.service.InteractionService;
import com.seniormeet.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/post")
@CrossOrigin("*")
@Slf4j
public class PostController {

    private final PostService postService;
    private final InteractionService interactionService;
    private final CommentService commentService;

    public PostController(PostService postService, InteractionService interactionService, CommentService commentService) {
               this.postService = postService;
               this.interactionService = interactionService;
               this.commentService = commentService;
    }

    @GetMapping()
    public ResponseEntity<List<Post>> findAll() {
        List<Post> posts = postService.findPosts();
        return ResponseEntity.ok(posts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable Long id){
        Post post = postService.findById(id);
        if (post!=null)
            return ResponseEntity.ok(post);
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post){
        Post createdPost = postService.createPost(post);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPost);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable Long id, @RequestBody Post post){
        Post updatedPost = postService.updatePost(id,post);
        if (updatedPost!=null)
            return ResponseEntity.ok(updatedPost);
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id){
        boolean deletedPost = postService.deletePost(id);
        if (deletedPost)
            return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{postId}/interactions")
    public ResponseEntity<Set<Interaction>> getPostInteractions(@PathVariable Long postId){
        Set<Interaction> interactions = postService.getPostInteractions(postId);
        return ResponseEntity.ok(interactions);
    }

    @GetMapping("{postId}/comments")
    public ResponseEntity<Set<Comment>> getPostComments(@PathVariable Long postId){
       Set<Comment> comments = postService.getPostComments(postId);
       return ResponseEntity.ok(comments);
    }

    @PostMapping("{postId}/add-interaction/{interactionId")
    public ResponseEntity<Boolean> addInteractionToPost(@PathVariable Long postId, @PathVariable Long interactionId){
        Post post = postService.findById(postId);
        Interaction interaction = interactionService.findById(interactionId);
        if (postService.addInteractionToPost(post, interaction))
            return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();

    }

    @PostMapping("{postId}/add-comment/{commentId}")
    public ResponseEntity<Boolean> addCommentToPost(@PathVariable Long postId, @PathVariable Long commentId){
        Post post = postService.findById(postId);
        Comment comment = commentService.findById(commentId);
        if (postService.addCommentToPost(post, comment))
            return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }

}
