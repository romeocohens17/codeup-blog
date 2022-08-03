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
        int random = (int)(Math.random() * 6) + 1;
        if(number == random) {
            return String.format("CONGRATS, YOU WIN!!!\nYour number was: %s\nThe random number was: %s", number, random);
        } else {
            return String.format("SORRY, YOU LOSE\nYour number was: %s\nThe random number was: %s", number, random);
        }
    }
}
