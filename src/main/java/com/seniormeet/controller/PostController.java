package com.seniormeet.controller;

import com.seniormeet.model.*;
import com.seniormeet.service.CommentService;
import com.seniormeet.service.InteractionService;
import com.seniormeet.service.PostService;
import com.seniormeet.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
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
    public ResponseEntity<List<Interaction>> getPostInteractions(@PathVariable Long postId){
        List<Interaction> interactions = postService.getPostInteractions(postId);
        return ResponseEntity.ok(interactions);
    }

    @GetMapping("{postId}/comments")
    public ResponseEntity<List<Comment>> getPostComments(@PathVariable Long postId){
       List<Comment> comments = postService.getPostComments(postId);
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
            return ResponseEntity.ok(true);
        return ResponseEntity.ok(false);
    }

    @PostMapping("{postId}/add-like/{userId}")
    public ResponseEntity<Boolean> addLikeToPost(@PathVariable Long postId, @PathVariable Long userId){
        /* TODO
        teniendo la seguridad JWT ya no hace falta pasar el userId en la url
        Extraemos el usuario de User user = SEcurityUtils.getCurrentuser()
         *
         */

        Post post = postService.findById(postId);
        User user = userService.findById(userId);
        Interaction interaction = this.interactionService.findByPost_IdAndUser_IdAndType(post.getId(), user.getId(), InteractionType.LIKE);

        if (interaction == null) {
            // EL USUARIO HA PULSADO LIKE
            interaction = new Interaction();
            interaction.setPost(post);
            interaction.setType(InteractionType.LIKE);
            interaction.setUser(user);
            interaction = this.interactionService.save(interaction);
            post.getInteractions().add(interaction);
            this.postService.updatePost(post.getId(), post);
            return ResponseEntity.ok(true);
        }

        // EL USUARIO QUIERE QUITAR EL LIKE
        Interaction finalInteraction = interaction;
        boolean removed = post.getInteractions().removeIf(currentInter -> currentInter.getId().equals(finalInteraction.getId()));
        if (removed) {
            this.postService.updatePost(post.getId(), post);
            interactionService.deleteById(interaction.getId());
            return ResponseEntity.ok(false);
        } else {
            // HAY INTERACTION PERO NO SE HA PODIDO BORRAR, HAY PROBLEMAS
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }


        /*
        Interaction interaction = new Interaction();
        interaction.setPost(post);
        interaction.setType(InteractionType.LIKE);
        interaction.setUser(user);

        //Debermos averiguar si las interacciones del post hay alguna del mismo usuario y de tipo LIKE
        //Si no está la grabamos
        // Si está la borramos
        boolean removed = post.getInteractions().removeIf(currentInter -> currentInter.getUser().getId()==userId && currentInter.getType()==InteractionType.LIKE);
        if (removed) {
            interactionService.deleteById(interaction.getId());
        }

        for(Interaction i: post.getInteractions())
        {
            if (i.getUser().getId()==userId && i.getType()==InteractionType.LIKE){
                interactionService.deleteById(i.getId());
                //postService.deleteInteractionFromPost(i);
                return ResponseEntity.notFound().build();
            }
        }
        interactionService.save(interaction);
        return ResponseEntity.noContent().build();
        */

    }

    @PostMapping("{postId}/add-save/{userId}")
    public ResponseEntity<Boolean> addSaveToPost(@PathVariable Long postId, @PathVariable Long userId){
        Post post = postService.findById(postId);
        User user = userService.findById(userId);
        Interaction interaction = this.interactionService.findByPost_IdAndUser_IdAndType(post.getId(), user.getId(), InteractionType.SAVE);

        if (interaction == null) {
            // EL USUARIO HA PULSADO SAVE
            interaction = new Interaction();
            interaction.setPost(post);
            interaction.setType(InteractionType.SAVE);
            interaction.setUser(user);
            interaction = this.interactionService.save(interaction);
            post.getInteractions().add(interaction);
            this.postService.updatePost(post.getId(), post);
            return ResponseEntity.ok(true);
        }

        // EL USUARIO QUIERE QUITAR EL SAVE
        Interaction finalInteraction = interaction;
        boolean removed = post.getInteractions().removeIf(currentInter -> currentInter.getId().equals(finalInteraction.getId()));
        if (removed) {
            this.postService.updatePost(post.getId(), post);
            interactionService.deleteById(interaction.getId());
            return ResponseEntity.ok(false);
        } else {
            // HAY INTERACTION PERO NO SE HA PODIDO BORRAR, HAY PROBLEMAS
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }

        
    }

}
