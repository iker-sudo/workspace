package ejerciciosRepaso;

import java.util.Scanner;

public class EjercicioA {
    public static void main(String[] args) {
        // Creamos scanner para leer datos por teclado
        Scanner scanner = new Scanner(System.in);

        // Pedimos el nombre y notas de los examenes
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Introduce las nota de tu primer examen:");
        double nota1 = scanner.nextDouble();

        System.out.println("Introduce las nota de tu segundo examen:");
        double nota2 = scanner.nextDouble();

        // Calculamos la media de las dos notas
        double media = (nota1 + nota2) / 2;

        // Si la media es mayor o igual que 5, el alumno aprueba
        if (media >= 5) {
            System.out.println("¡Felicidades " + nombre + ", tu nota de programacion es: " + media);
        } else {
            // Limpiamos el buffer
            scanner.nextLine();

            // Preguntamos si la recuperación ha sido apto o no apto
            System.out.println("¿La recuperación ha sido apto o no apto?");
            String recuperacion = scanner.nextLine();

            // Si la recuperación es apto, la nota final es 5
            if (recuperacion.equalsIgnoreCase("apto")) {
                System.out.println("¡Felicidades " + nombre + ", tu nota de programacion es: 5.0");
            } else {
                // Si no es apto, se queda con la media
                System.out.println("Lo siento " + nombre + ", tu nota de programacion es: " + media);

                // Cerramos el Scanner
                scanner.close();
            }
        }
    }
}
