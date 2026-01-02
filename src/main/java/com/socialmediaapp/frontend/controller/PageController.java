package com.socialmediaapp.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/feed")
    public String feed() {
        return "feed";
    }
}
