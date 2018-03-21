package com.seymour.jsocialbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seymour.jsocialbackend.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
