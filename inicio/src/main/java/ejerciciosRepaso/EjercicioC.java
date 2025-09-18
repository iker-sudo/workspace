package ejerciciosRepaso;

import java.util.Scanner;

public class EjercicioC {
    public static void main(String[] args) {
        // Pedir números enteros al usuario
        System.out.println("Introduce números enteros (Número negativo para terminar):");
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar la suma total, el contador de números,
        // la suma y el contador de impares, y el mayor número par
        int sumaImpares = 0;
        int contadorImpares = 0;
        int mayorPar = Integer.MIN_VALUE;

        // Bucle para leer números hasta que se introduzca uno negativo
        while (true) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                break; // Sale del bucle si el número es negativo
            }

            if (numero % 2 != 0) { // Si el número es impar
                sumaImpares += numero; 
                contadorImpares++; 
            } else { // Si el número es par
                if (numero > mayorPar) {
                    mayorPar = numero; 
                }
            }
        }

        // Calcula y muestra la media de los impares si se introdujeron impares
        if (contadorImpares > 0) {
            double mediaImpares = (double) sumaImpares / contadorImpares;
            System.out.println("La media de los impares es: " + mediaImpares);
        } else {
            System.out.println("No se introdujeron números impares.");
        }

        // Muestra el mayor de los pares si se introdujeron pares
        if (mayorPar != Integer.MIN_VALUE) {
            System.out.println("El mayor de los pares es: " + mayorPar);
        } else {
            System.out.println("No se introdujeron números pares.");
        }
        scanner.close(); // Cierra el scanner
    }
}
