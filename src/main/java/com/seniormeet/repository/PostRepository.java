package com.seniormeet.repository;

import com.seniormeet.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByUser_Id(Long userId);

    List<Post> findByGroup_Id(Long groupId);

    List<Post> findByGroup_IdNotNull();

    List<Post> findByGroup_IdNull();


}
