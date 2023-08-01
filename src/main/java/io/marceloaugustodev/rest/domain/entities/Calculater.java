package io.marceloaugustodev.rest.domain.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Calculater {
    private double number1;
    private double number2;
    private double result;

    public Calculater(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
}
