package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @RequestMapping(path ="/add/{number}/and/{numero}")
    @ResponseBody
    public String add(@PathVariable int number, @PathVariable int numero) {
        Integer sum = number + numero;
        return String.format("<h1>Your numbers are: %d , %d</h1>\n<h2>%d + %d = %d</h2>",number, numero, number, numero, sum);
    }

    @RequestMapping(path ="/subtract/{number}/and/{numero}")
    @ResponseBody
    public String subtract(@PathVariable int number, @PathVariable int numero) {
        Integer difference = number - numero;
        return String.format("<h1>Your numbers are: %d , %d</h1>\n<h2>%d - %d = %d</h2>",number, numero, number, numero, difference);
    }

    @RequestMapping(path ="/multiply/{number}/and/{numero}")
    @ResponseBody
    public String multiply(@PathVariable int number, @PathVariable int numero) {
        Integer product = number * numero;
        return String.format("<h1>Your numbers are: %d , %d</h1>\n<h2>%d x %d = %d</h2>",number, numero, number, numero, product);
    }

    @RequestMapping(path ="/divide/{number}/and/{numero}")
    @ResponseBody
    public String divide(@PathVariable int number, @PathVariable int numero) {
        Integer quotient = number/numero;
        return String.format("<h1>Your numbers are: %d , %d</h1>\n<h2>%d / %d = %d</h2>",number, numero, number, numero, quotient);
    }

}
