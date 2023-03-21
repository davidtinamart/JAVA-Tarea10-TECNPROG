package org.example.Ejercicio2;

    public class Operacion {

            //SUMAR-----------------------------------------------------

        public static int sumar(int a, int b) throws DesbordaCapacidadExcepcion {
            long resultadoLargo = (long) a + (long) b;
            if (resultadoLargo < Integer.MIN_VALUE || resultadoLargo > Integer.MAX_VALUE) {
                throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora.");
            }
            return (int) resultadoLargo;

            //RESTAR-----------------------------------------------------
        }
        public static int restar(int a, int b) throws DesbordaCapacidadExcepcion {
            long resultadoLargo = (long) a - (long) b;
            if (resultadoLargo < Integer.MIN_VALUE || resultadoLargo > Integer.MAX_VALUE) {
                throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora.");
            }
            return (int) resultadoLargo;
        }

        //MULTIPLICAR----------------------------------------------------

        public static int multiplicar(int a, int b) throws DesbordaCapacidadExcepcion {
            long resultadoLargo = (long) a * (long) b;
            if (resultadoLargo < Integer.MIN_VALUE || resultadoLargo > Integer.MAX_VALUE) {
                throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora.");
            }
            return (int) resultadoLargo;
        }

    }
