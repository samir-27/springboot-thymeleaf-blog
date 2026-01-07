package com.socialmediaapp.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        // 'pages/home' ka matlab hai: templates/pages/home.html
        return "pages/home";
    }

    @GetMapping("/login")
    public String login() {
        return "pages/login";
    }

    @GetMapping("/register")
    public String register() {
        return "pages/register";
    }

    @GetMapping("/profile")
    public String profile() {
        return "pages/profile";
    }

    @GetMapping("/post/new")
    public String createPost() {
        return "pages/create-post";
    }

    @GetMapping("/post/1") // Abhi ke liye static ID 1 use kar rahe hain
    public String postDetail() {
        return "pages/single-post";
    }

    @GetMapping("/explore")
    public String explore() {
        return "pages/explore";
    }
}