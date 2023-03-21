package org.example.Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {


    public void menuCalculadora(){
        Scanner teclado = new Scanner(System.in);
        int num1, num2, result = 0;
        char op;

        while (true) {
            try {
                System.out.print("Hola, introduce un número entero: ");
                num1 = Integer.parseInt(teclado.nextLine());

                System.out.print("Introduce un operador -> (+ - * / % o s para salir) ");
                op = teclado.nextLine().charAt(0);

                if (op == 's') {
                    break;
                }

                System.out.print("Introducir un número entero: ");
                num2 = Integer.parseInt(teclado.nextLine());

                switch (op) {
                    case '+':
                        result = Operacion.sumar(num1, num2);
                        break;
                    case '-':
                        result = Operacion.restar(num1, num2);
                        break;
                    case '*':
                        result = Operacion.multiplicar(num1, num2);
                        break;
                    case '/':
                        if (num2 == 0) {
                            throw new ArithmeticException("La división por cero no está definida");
                        }
                        result = num1 / num2;
                        break;
                    case '%':
                        if (num2 == 0) {
                            throw new ArithmeticException("La división por cero no está definida");
                        }
                        result = num1 % num2;
                        break;
                    default:
                        throw new IllegalArgumentException("Operador inválido: " + op);
                }

                System.out.println(num1 + " " + op + " " + num2 + " = " + result);

            } catch (NumberFormatException e) {
                System.out.println("Valor introducido incorrecto. Inténtelo de nuevo...");
            } catch (DesbordaCapacidadExcepcion e) {
                System.out.println(e.getMessage() + " Prueba otra vez...");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        teclado.close();
    }
}
