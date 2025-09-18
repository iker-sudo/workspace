package ejerciciosRepaso;

import java.util.Scanner;

public class EjercicioE {
    public static void main(String[] args) {
        // Mensaje pidiendo la altura de la pirámide
        System.out.println("Introduce una altura para la pirámide maya: ");
        // Creamos Scanner para leer datos por teclado
        Scanner scanner = new Scanner(System.in);
        // Guardamos el número introducido por el usuario en la variable altura
        int altura = scanner.nextInt();

        // Bucle para cada fila de la pirámide
        for (int i = 0; i < altura; i++) {
            // Bucle para imprimir los espacios antes de los asteriscos
            for (int j = 0; j < altura - 1 - i; j++) {
                System.out.print(" ");
            }
            // Bucle para imprimir los asteriscos del lado izquierdo
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            // Si la fila es par, imprimimos cuatro asteriscos en el centro
            if (i % 2 == 0) {
                System.out.print("****");
            } else {
                // Si la fila es impar, imprimimos cuatro espacios en el centro
                System.out.print("    ");
            }
            // Bucle para imprimir los asteriscos del lado derecho
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            // Saltamos a la siguiente línea para la siguiente fila
            System.out.println();
        }
    }
}
