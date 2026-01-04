package com.socialmediaapp.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
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

    @GetMapping("/post/new")
    public String createPost() {
        return "pages/create-post";
    }

    @GetMapping("/profile")
    public String profile() {
        return "pages/profile";
    }
}
