package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(path = "/hello/{name}", method = RequestMethod.GET)
    public String helloToYou(@PathVariable String name, Model model) {
      model.addAttribute("name", name);
      return "hello";
    }

    String fizzBuzzEvaluation(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return String.format("%d", num);
        }
    }

    @GetMapping("/number/{num}")
    @ResponseBody
    public String reportNumber(@PathVariable int num) {
        String intro = String.format("Here are some truths of the number %d", num);
        String isEven = String.format("The number %d is even: %b", num, num % 2 == 0);
        String numSquared = String.format("The number %d squared is %d", num, (int)(Math.pow(num, 2)));
        String fizzBuzzEval = String.format("The number %d when run through FizzBuzz would print %s", num, fizzBuzzEvaluation(num));
        return String.format("<h1>%s</h1>\n<h3>%s</h3>\n<h3>%s</h3>\n<h3>%s</h3>", intro, isEven, numSquared, fizzBuzzEval);
    }
}
