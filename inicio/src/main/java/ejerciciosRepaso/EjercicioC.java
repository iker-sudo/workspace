package ejerciciosRepaso;

import java.util.Scanner;

public class EjercicioC {
    public static void main(String[] args) {
        System.out.println("Introduce números enteros (Número negativo para terminar):");
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int sumaImpares = 0;
        int contadorImpares = 0;
        int mayorPar = Integer.MIN_VALUE;

        while (true) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            suma += numero;
            contador++;
            if (numero % 2 != 0) {
                sumaImpares += numero;
                contadorImpares++;
            } else {
                if (numero > mayorPar) {
                    mayorPar = numero;
                }
            }
        }

        if (contadorImpares > 0) {
            double mediaImpares = (double) sumaImpares / contadorImpares;
            System.out.println("La media de los impares es: " + mediaImpares);
        } else {
            System.out.println("No se introdujeron números impares.");
        }

        if (mayorPar != Integer.MIN_VALUE) {
            System.out.println("El mayor de los pares es: " + mayorPar);
        } else {
            System.out.println("No se introdujeron números pares.");
        }
        scanner.close();
    }
}
