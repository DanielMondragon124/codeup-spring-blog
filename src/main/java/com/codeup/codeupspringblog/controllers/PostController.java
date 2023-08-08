package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {
    @GetMapping("/all")
    public String allPosts(Model model) {
        // Create two sample posts and add them to the list
        List<Post> posts = new ArrayList<>();
        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("This is the content of post 1.");
        posts.add(post1);

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("This is the content of post 2.");
        posts.add(post2);

        // Pass the list of posts to the view
        model.addAttribute("posts", posts);

        return "index";
    }

    @GetMapping("/{id}")
    public String viewPost(@PathVariable int id, Model model) {
        // Create a sample post for demonstration
        Post post = new Post();
        post.setTitle("Sample Post");
        post.setBody("This is the content of the sample post.");

        // Pass the post object to the view
        model.addAttribute("post", post);

        return "show";
    }

    @GetMapping("/create")
    public String createPostsForm() {
        return "view the form for creating a post";
    }

    @PostMapping("/create")
    public String createPost() {
        return "create a new post";
    }
}
