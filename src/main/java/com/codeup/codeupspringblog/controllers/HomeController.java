package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "This is the landing page!";
    }
    @GetMapping("/home")
    public String welcome() {
        return "home";
    }
    @GetMapping("/rolldice")
    public String promptUser() {
        return "RollDice";
    }
    @GetMapping("/roll-dice/{n}")
    public String rollDice(@PathVariable int n, Model model) {
        Random rand = new Random();
        int diceRoll = 1 + rand.nextInt(6); // random number between 1 and 6
        model.addAttribute("diceRoll", diceRoll);
        model.addAttribute("userGuess", n);
        model.addAttribute("isCorrect", diceRoll == n);
        return "Diceresult";
    }

}

