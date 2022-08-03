package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Random;

@Controller
public class RollDiceController {

    @RequestMapping(path = "/roll-dice/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String diceRoll(@PathVariable int number) {
        int dieOne = (int)(Math.random() * 6) + 1;
        int dieTwo = (int)(Math.random() * 6) + 1;
        int dieThree = (int)(Math.random() * 6) + 1;
        if(number == dieOne || number == dieTwo || number == dieThree) {
            return String.format("<h2>CONGRATS</h2>\n<h3>Your random number was: %s</h3>\n<h3>You matched a random dice roll</h3>\n<h3>Die One: %s</h3>\n<h3>Die Two: %s</h3>\n<h3>Die Three: %s</h3>", number, dieOne,dieTwo, dieThree);
        } else {
            return String.format("<h2>SORRY, YOU LOSE</h2>\n<h3>Your number was: %s</h3>\n<h3>You didn't match any of the random dice rolls</h3>\n<h3>Die One: %s</h3>\n<h3>Die Two: %s</h3>\n<h3>Die Three: %s</h3>", number, dieOne, dieTwo, dieThree);
        }
    }
}
