package com.seymour.jsocialbackend.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.seymour.jsocialbackend.entities.Post;
import com.seymour.jsocialbackend.entities.User;

public interface PostService {

	ResponseEntity<List<Post>> getAllPosts();

	ResponseEntity<Post> createPost(Post post);

	ResponseEntity<Post> getPostById(int postId);

	ResponseEntity<List<Post>> getPostsByUserId(int userId);

	ResponseEntity<List<Post>> getPostsOfUsersFollowed(int[] userId);

	ResponseEntity<List<Post>> findAllByUserIds(int[] userId);

}
