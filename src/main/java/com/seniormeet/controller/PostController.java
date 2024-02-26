package com.seniormeet.controller;

import com.seniormeet.model.Post;
import com.seniormeet.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
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
}
