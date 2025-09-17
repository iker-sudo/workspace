package ejerciciosRepaso;

import java.util.Scanner;

public class EjercicioE {
    public static void main(String[] args) {
        System.out.println("Introduce una altura para la pirámide maya: ");
        Scanner scanner = new Scanner(System.in);
        int altura = scanner.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < altura - 1 - i; j++) {
                System.out.print(" ");
                for (int k = 0; k < i + 1; k++) {
                    System.out.print("*");
                }
                if (i % 2 == 0) {
                    System.out.println("****");
                } else {
                    System.out.print("    ");
                }
            }
        }
        System.out.println();
    }
}
