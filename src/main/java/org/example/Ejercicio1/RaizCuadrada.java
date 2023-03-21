package org.example.Ejercicio1;

import java.util.Scanner;

public class RaizCuadrada {

    public void CalculadoraRaizCuadrada() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introducir un valor: ");
        double valor = teclado.nextDouble();

        try {
            double resultado = raizCuadrada(valor);
            System.out.printf("√%.2f = %.2f\n", valor, resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double raizCuadrada(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("La raíz cuadrada no está definida para un número negativo.");
        }
        return Math.sqrt(valor);
    }
}