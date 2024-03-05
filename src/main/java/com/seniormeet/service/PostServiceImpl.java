package com.seniormeet.service;

import com.seniormeet.model.Post;
import com.seniormeet.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService{

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> findPosts() {
        return postRepository.findAll();
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
}
