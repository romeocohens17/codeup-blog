package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String newInfoForm() {
        return "roll-dice";
    }

    @PostMapping(path = "/roll-dice")
    public String diceRoll(@RequestParam(name = "number") Integer number, Model model) {
        Random random = new Random();
        Integer x = random.nextInt(7);
        if(number == x) {
            model.addAttribute("number", String.format("CONGRATS, YOU WIN!!!\nYour number was: %n\nThe random number was: %n", number, x));
        } else if (number != x) {
            model.addAttribute("number", String.format("SORRY, YOU LOSE\nYour number was: %n\nThe random number was: %n", number, x));
        }
        return "roll-dice";
    }
}
