package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DicePage {
    @GetMapping(path = "/roll-dice")
    public String welcomePage() {
        return "roll-dice";
    }
}

