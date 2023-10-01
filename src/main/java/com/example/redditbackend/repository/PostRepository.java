package com.example.redditbackend.repository;

import com.example.redditbackend.model.Post;
import com.example.redditbackend.model.Subreddit;
import com.example.redditbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
