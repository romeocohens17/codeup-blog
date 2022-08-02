package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    @ResponseBody
    public String posts() {
        return String.format("<h1>This is the Posts index page!</h1>");
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String postId(@PathVariable int id) {
        return String.format("<h1>View an individual post based on the post id: %d</h1>", id);
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String postCreation() {
        return String.format("<h1>This is the form for creating posts!</h1>");
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String postCreateNew() {
        return String.format("<h1>Create a new post!</h1>");
    }

}
