package ejerciciosRepaso;

import java.util.Scanner;

public class EjercicioF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicita al usuario la columna (a-h)
        System.out.print("Introduce la columna (a-h): ");
        char columna = sc.next().toLowerCase().charAt(0);
        // Solicita al usuario la fila (1-8)
        System.out.print("Introduce la fila (1-8): ");
        int fila = sc.nextInt();

        // Verifica si la posición es válida en el tablero de ajedrez
        if (columna < 'a' || columna > 'h' || fila < 1 || fila > 8) {
            System.out.println("Posición inválida.");
            return;
        }

        // Muestra las casillas a las que puede saltar el alfil desde la posición dada
        System.out.println("Casillas a las que puede saltar el alfil:");
        // Direcciones de movimiento diagonal 
        int[] dirColumna = { 1, 1, -1, -1 };
        int[] dirFila = { 1, -1, 1, -1 };

        // Recorre las 4 diagonales posibles
        for (int d = 0; d < 4; d++) {
            int c = columna;
            int f = fila;
            // Mientras la nueva posición esté dentro del tablero
            while (true) {
                c += dirColumna[d];
                f += dirFila[d];
                if (c < 'a' || c > 'h' || f < 1 || f > 8)
                    break;
                // Muestra la casilla alcanzada
                System.out.println((char) c + "" + f);
            }
        }
    }
}