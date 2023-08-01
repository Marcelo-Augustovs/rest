package io.marceloaugustodev.rest.rest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculater")
public class CalculaterController {

    @GetMapping("/{number1}+{number2}")
    public double soma(@PathVariable(value = "number1") double number1,
                       @PathVariable(value = "number2") double number2){

        return number1 + number2;
    }

    @GetMapping("/{number1}-{number2}")
    public double subtracao(@PathVariable(value = "number1") double number1,
                            @PathVariable(value = "number2") double number2){

        return number1 - number2;
    }
}
