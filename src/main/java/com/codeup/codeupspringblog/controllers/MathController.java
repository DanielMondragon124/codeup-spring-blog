package com.codeup.codeupspringblog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MathController {

    @GetMapping("/add/{num1}/{num2}")
    public String add(@PathVariable int num1, @PathVariable int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }
    @GetMapping("/subtract/{num1}/{num2}")
    public String subtract (@PathVariable int num1, @PathVariable int num2) {
        return num1 + " - " + num2 + " = " + (num1 + num2);
    }
    @GetMapping("/multiply/{num1}/{num2}")
    public String multiply(@PathVariable int num1, @PathVariable int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @GetMapping("/divide/{num1}/{num2}")
    public String divide(@PathVariable int num1, @PathVariable int num2) {
        if (num2 == 0) {
            return "Division by zero is undefined.";
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }

}
