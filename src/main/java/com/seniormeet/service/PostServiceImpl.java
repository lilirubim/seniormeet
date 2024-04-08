package com.seniormeet.service;

import com.seniormeet.model.Comment;
import com.seniormeet.model.Interaction;
import com.seniormeet.model.Post;
import com.seniormeet.repository.CommentRepository;
import com.seniormeet.repository.InteractionRepository;
import com.seniormeet.repository.PostRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PostServiceImpl implements PostService{

    private PostRepository postRepository;
    private final InteractionRepository interactionRepository;
    private final CommentRepository commentRepository;

    public PostServiceImpl(PostRepository postRepository,
                           InteractionRepository interactionRepository,
                           CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.interactionRepository = interactionRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public Set<Post> findPosts() {

        return new HashSet<>(postRepository.findAll());
    }

    @Override
    public Post findById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post updatePost(Long id, Post post) {
        Optional<Post> postOptional = postRepository.findById(id);
        if (postOptional.isPresent()){
            Post existingPost = postOptional.get();
            existingPost.setPhotoUrl(post.getPhotoUrl());
            existingPost.setVideoUrl(post.getVideoUrl());
            existingPost.setContent(post.getContent());
            return postRepository.save(existingPost);
        }
        return null;
    }

    @Override
    public boolean deletePost(Long id) {
        Optional<Post> postOptional = postRepository.findById(id);
        if (postOptional.isPresent()){
            postRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Set<Interaction> getPostInteractions(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(() -> new EntityNotFoundException("Post not found"));
        return post.getInteractions();
    }

    @Override
    public Set<Comment> getPostComments(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(() -> new EntityNotFoundException("Post not found"));
        return post.getComments();
    }

    @Override
    public Boolean addInteractionToPost(Post post, Interaction interaction) {
         if (post!=null && interaction!=null){
            if (post.getInteractions().contains(interaction))
            {
                post.getInteractions().remove(interaction);
                postRepository.save(post);
                interactionRepository.delete(interaction);
                return false;

            } else {
                post.getInteractions().add(interaction);
                postRepository.save(post);
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean addCommentToPost(Post post, Comment comment) {
        if (post!=null && comment!=null){
            post.getComments().add(comment);
            postRepository.save(post);
            return true;
        }
        return false;
    }


}
