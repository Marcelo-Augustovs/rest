package io.marceloaugustodev.rest.domain.entities;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Calculater {

    public double soma(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public double subtracao(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    public double multiplic(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    public double media(double numberOne, double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public double raiz(double number) {
        return Math.sqrt(number);
    }

    public double divid(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }
}
