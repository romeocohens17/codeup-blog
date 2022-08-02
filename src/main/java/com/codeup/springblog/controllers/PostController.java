package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return String.format("<h1>This is the Posts index page!</h1>");
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postId(@PathVariable int id) {
        return String.format("<h1>View an individual post based on the post id: %d</h1>", id);
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postCreation() {
        return String.format("<h1>This is the form for creating posts!</h1>");
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String postCreateNew() {
        return String.format("<h1>Create a new post!</h1>");
    }

}
