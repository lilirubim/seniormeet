package com.seniormeet.service;

import com.seniormeet.model.Comment;
import com.seniormeet.model.Interaction;
import com.seniormeet.model.InteractionType;
import com.seniormeet.model.Post;
import com.seniormeet.repository.CommentRepository;
import com.seniormeet.repository.InteractionRepository;
import com.seniormeet.repository.PostRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

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
    public List<Post> findPosts() {
        List<Post> posts = postRepository.findAll();
        posts.removeIf(post -> post.getDate() == null); // Eliminar posts con fecha nula
        Collections.sort(posts, (o1, o2) -> o2.getDate().compareTo(o1.getDate()));
        return posts;
    }

    @Override
    public List<Post> findPostsByUserId(Long userId) {
        List<Post> posts = postRepository.findByUser_Id(userId);
        return posts;
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
            existingPost.setDate(post.getDate());
            return postRepository.save(existingPost);
        }
        return null;
    }

    @Override
    public boolean deletePost(Long id) {
        Optional<Post> postOptional = postRepository.findById(id);
        if (postOptional.isPresent()){
            Set<Interaction> interactions = postOptional.get().getInteractions();
            for (Interaction i: interactions){
                interactionRepository.deleteById(i.getId());
            }
            Set<Comment> comments = postOptional.get().getComments();
            for (Comment c: comments){
                commentRepository.deleteById(c.getId());
            }
            postRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Interaction> getPostInteractions(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(() -> new EntityNotFoundException("Post not found"));
        return new ArrayList<>(post.getInteractions());
    }

    @Override
    public List<Interaction> getPostLikes(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(() -> new EntityNotFoundException("Post not found"));
        List<Interaction> interactions = new ArrayList<>(post.getInteractions());
        List<Interaction> likes = new ArrayList<>();
        for(Interaction i : interactions){
            if (i.getType()== InteractionType.LIKE)
                likes.add(i);
        }

        return likes;
    }

    @Override
    public List<Interaction> getPostSaves(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(() -> new EntityNotFoundException("Post not found"));
        List<Interaction> interactions = new ArrayList<>(post.getInteractions());
        List<Interaction> saves = new ArrayList<>();
        for(Interaction i : interactions){
            if (i.getType()== InteractionType.SAVE)
                saves.add(i);
        }

        return saves;
    }

    @Override
    public List<Comment> getPostComments(Long postId) {
        Post post = postRepository.findById(postId).orElseThrow(() -> new EntityNotFoundException("Post not found"));
        List<Comment> comments = new ArrayList<>(post.getComments());
        Collections.sort(comments, (o1, o2) -> o2.getDate().compareTo(o1.getDate()));
        return comments;
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
