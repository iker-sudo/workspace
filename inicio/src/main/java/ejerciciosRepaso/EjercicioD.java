package ejerciciosRepaso;

import java.util.Scanner;

public class EjercicioD {
    public static void main(String[] args) {
        System.out.println("Introduce un número y a continuación un dígito:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int digito = scanner.nextInt();

        // Número a String para recorrer de izquierda a derecha
        String numeroStr = Integer.toString(numero);
        char digitoChar = (char) ('0' + digito);
        boolean encontrado = false;

        for (int i = 0; i < numeroStr.length(); i++) {
            if (numeroStr.charAt(i) == digitoChar) {
                System.out.println(
                        "El dígito " + digito + " está en la posición " + (i + 1) + " (de izquierda a derecha)");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El dígito " + digito + " no se encuentra en el número.");
        }

        scanner.close();
    }
}
