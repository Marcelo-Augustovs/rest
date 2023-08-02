package io.marceloaugustodev.rest.rest.controller;

import io.marceloaugustodev.rest.domain.entities.Calculater;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculater")
public class CalculaterController {

    private static Calculater calculater = new Calculater();

    @GetMapping("/{numberOne}+{numberTwo}")
    public double soma(@PathVariable(value = "numberOne") double numberOne,
                       @PathVariable(value = "numberTwo") double numberTwo){

        return calculater.soma(numberOne,numberTwo);
    }

    @GetMapping("/{numberOne}-{numberTwo}")
    public double subtracao(@PathVariable(value = "numberOne") double numberOne,
                            @PathVariable(value = "numberTwo") double numberTwo){

        return calculater.subtracao(numberOne,numberTwo);
    }

    @GetMapping("/{numberOne}x{numberTwo}")
    public double multiplic(@PathVariable(value = "numberOne") double numberOne,
                            @PathVariable(value = "numberTwo") double numberTwo){

        return calculater.multiplic(numberOne,numberTwo);
    }

    @GetMapping("/M({numberOne},{numberTwo})")
    public double media(@PathVariable(value = "numberOne") double numberOne,
                        @PathVariable(value = "numberTwo") double numberTwo){

        return calculater.media(numberOne,numberTwo);
    }

    @GetMapping("/V{number}")
    public double raiz(@PathVariable(value = "number") double number){
        return calculater.raiz(number);
    }

    @GetMapping("/{numberOne}/{numberTwo}")
    public double divisao(@PathVariable(value = "numberOne") double numberOne,
                          @PathVariable(value = "numberTwo") double numberTwo){

        return calculater.divid(numberOne,numberTwo);
    }
}
