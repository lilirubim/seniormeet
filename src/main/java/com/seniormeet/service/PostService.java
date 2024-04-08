package com.seniormeet.service;

import com.seniormeet.model.Comment;
import com.seniormeet.model.Interaction;
import com.seniormeet.model.Post;

import java.util.List;
import java.util.Set;

public interface PostService {

    Set<Post> findPosts();

    Post findById(Long id);

    Post createPost(Post post);

    Post updatePost(Long id, Post post);

    boolean deletePost(Long id);

    Set<Interaction> getPostInteractions(Long postId);

    Set<Comment> getPostComments(Long postId);

   Boolean addInteractionToPost(Post post, Interaction interaction);

   Boolean addCommentToPost(Post post, Comment comment);
}
