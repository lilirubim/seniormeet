package com.seniormeet.service;

import com.seniormeet.model.Post;

import java.util.List;

public interface PostService {

    List<Post> findPosts();

    Post findById(Long id);

    Post createPost(Post post);

    Post updatePost(Long id, Post post);

    boolean deletePost(Long id);
}
