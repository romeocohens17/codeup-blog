package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping(path ="/add/{number}/and/{numero}")
    @ResponseBody
    public String add(@PathVariable int number, @PathVariable int numero) {
        Integer sum = number + numero;
        return String.format("<h1>Your numbers are: %d , %d</h1>\n<h2>%d + %d = %d</h2>",number, numero, number, numero, sum);
    }

    @GetMapping(path ="/subtract/{number}/and/{numero}")
    @ResponseBody
    public String subtract(@PathVariable int number, @PathVariable int numero) {
        Integer difference = number - numero;
        return String.format("<h1>Your numbers are: %d , %d</h1>\n<h2>%d - %d = %d</h2>",number, numero, number, numero, difference);
    }

    @GetMapping(path ="/multiply/{number}/and/{numero}")
    @ResponseBody
    public String multiply(@PathVariable int number, @PathVariable int numero) {
        Integer product = number * numero;
        return String.format("<h1>Your numbers are: %d , %d</h1>\n<h2>%d x %d = %d</h2>",number, numero, number, numero, product);
    }

    @GetMapping(path ="/divide/{number}/and/{numero}")
    @ResponseBody
    public String divide(@PathVariable int number, @PathVariable int numero) {
        Integer quotient = number/numero;
        return String.format("<h1>Your numbers are: %d , %d</h1>\n<h2>%d / %d = %d</h2>",number, numero, number, numero, quotient);
    }

}
