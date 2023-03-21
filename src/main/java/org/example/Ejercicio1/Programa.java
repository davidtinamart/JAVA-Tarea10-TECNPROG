package org.example.Ejercicio1;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introducir un valor: ");
        double num = teclado.nextDouble();
        teclado.close();
        try {
            double raiz = raizCuadrada(num);
            System.out.printf("√%.2f = %.2f", num, raiz);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double raizCuadrada(double num) throws Exception {
        if (num < 0) {
            throw new Exception("La raíz cuadrada no está definida para un número negativo.");
        }
        return Math.sqrt(num);
    }
}