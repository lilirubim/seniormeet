package com.seniormeet.controller;

import com.seniormeet.model.*;
import com.seniormeet.service.CommentService;
import com.seniormeet.service.InteractionService;
import com.seniormeet.service.PostService;
import com.seniormeet.service.UserService;
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
    private final UserService userService;

    public PostController(PostService postService, InteractionService interactionService, CommentService commentService, UserService userService) {
               this.postService = postService;
               this.interactionService = interactionService;
               this.commentService = commentService;
               this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<Set<Post>> findAll() {
        Set<Post> posts = postService.findPosts();
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

    @PostMapping("{postId}/add-interaction/{interactionId}")
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

    @PostMapping("{postId}/add-like/{userId}")
    public ResponseEntity<Boolean> addLikeToPost(@PathVariable Long postId, @PathVariable Long userId){
        Post post = postService.findById(postId);
        User user = userService.findById(userId);
        Interaction interaction = new Interaction();
        interaction.setPost(post);
        interaction.setType(InteractionType.LIKE);
        interaction.setUser(user);
       // interactionsUser = user.getInteractions();
        //Debermos averiguar si las interacciones de un usuario con un post está incluida una de tipo LIKE
        //Si no está la grabamos
        // Si está la borramos
        for(Interaction i: post.getInteractions())
        {
            if (i.getUser().getId()==userId && i.getType()==InteractionType.LIKE){
                interactionService.deleteById(i.getId());
                return ResponseEntity.notFound().build();
            }
        }
        interactionService.save(interaction);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("{postId}/add-save/{userId}")
    public ResponseEntity<Boolean> addSaveToPost(@PathVariable Long postId, @PathVariable Long userId){
        Post post = postService.findById(postId);
        User user = userService.findById(userId);
        Interaction interaction = new Interaction();
        interaction.setPost(post);
        interaction.setType(InteractionType.SAVE);
        interaction.setUser(user);
        // interactionsUser = user.getInteractions();
        //Debermos averiguar si las interacciones de un usuario con un post está incluida una de tipo SAVE
        //Si no está la grabamos
        // Si está la borramos
        for(Interaction i: post.getInteractions())
        {
            if (i.getUser().getId()==userId && i.getType()==InteractionType.SAVE){
                interactionService.deleteById(i.getId());
                return ResponseEntity.notFound().build();
            }
        }
        interactionService.save(interaction);
        return ResponseEntity.noContent().build();
    }

}
