package com.seniormeet.service;

import com.seniormeet.model.Comment;
import com.seniormeet.model.Interaction;
import com.seniormeet.model.Post;

import java.util.List;
import java.util.Set;

public interface PostService {

    List<Post> findPosts();

    List<Post> findPostsByUserId(Long userId);

    List<Post> findPostsByGroupId(Long groupId);

    Post findById(Long id);

    Post createPost(Post post);

    Post updatePost(Long id, Post post);

    boolean deletePost(Long id);

    List<Interaction> getPostInteractions(Long postId);

    List<Interaction> getPostLikes(Long postId);

    List<Interaction> getPostSaves(Long postId);

    List<Comment> getPostComments(Long postId);

   Boolean addInteractionToPost(Post post, Interaction interaction);

   Boolean addCommentToPost(Post post, Comment comment);
}
