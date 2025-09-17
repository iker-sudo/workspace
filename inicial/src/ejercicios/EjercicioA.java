package ejercicios;
import java.util.Scanner;

public class EjercicioA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduce las nota de tu primer examen:");
        double nota1 = scanner.nextDouble();
        System.out.println("Introduce las nota de tu segundo examen:");
        double nota2 = scanner.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 5) {
            System.out.println("¡Felicidades " + nombre + ", tu nota de programacion es: " + media);
        } else {
            scanner.nextLine();
            System.out.println("¿La recuperación ha sido apto o no apto?");
            String recuperacion = scanner.nextLine();

            if (recuperacion.equalsIgnoreCase("apto")) {
                System.out.println("¡Felicidades " + nombre + ", tu nota de programacion es: 5.0");
            } else {
                System.out.println("Lo siento " + nombre + ", tu nota de programacion es: " + media);

                scanner.close();
            }
        }
    }
}

