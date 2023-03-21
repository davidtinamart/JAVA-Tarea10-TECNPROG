package org.example.Ejercicio2;

public class DesbordaCapacidadExcepcion extends Exception {

    public DesbordaCapacidadExcepcion(String s) {
        super("El resultado desborda la capacidad de esta calculadora");
    }
}