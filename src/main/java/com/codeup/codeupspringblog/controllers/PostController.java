package com.codeup.codeupspringblog.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    @GetMapping("/posts")
    public String posts() {
        return "posts index page";
    }
    @GetMapping("/posts/{id}")
    public String viewPosts(@PathVariable int id) {
        return "view an individual posts";
    }
    @GetMapping("/posts/create")
    public String createPostsForm() {
        return "view the form for creating a post";
    }
    @PostMapping("/posts/create")
    public String createPost() {
        return "create a new post";
    }
}
