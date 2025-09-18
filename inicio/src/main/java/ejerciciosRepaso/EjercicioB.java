package ejerciciosRepaso;

import java.util.Scanner;

public class EjercicioB {

    public static void main(String[] args) {
        // Creamos Scanner para leer datos desde el teclado
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que introduzca el precio con IVA
        System.out.print("Introduce el precio con IVA: ");
        double precioConIva = sc.nextDouble();

        // Pedimos al usuario que indique el tipo de IVA
        System.out.print("Tipo de IVA (general, reducido, superreducido): ");
        String tipoIva = sc.next().toLowerCase();

        double iva = 0; // Variable para guardar el porcentaje de IVA

        // Seleccionamos el porcentaje de IVA según el tipo introducido
        switch (tipoIva) {
            case "general":
                iva = 21;
                break;
            case "reducido":
                iva = 10;
                break;
            case "superreducido":
                iva = 4;
                break;
            default:
                // Si el tipo de IVA no es válido, mostramos un mensaje y terminamos el programa
                System.out.println("Tipo de IVA no válido.");
                sc.close();
                return;
        }

        // Calculamos el precio sin IVA
        double precioSinIva = precioConIva / (1 + iva / 100);

        // Mostramos el resultado con dos decimales
        System.out.printf("El precio antes de impuestos es: %.2f euros", precioSinIva);

        // Cerramos el Scanner
        sc.close();
    }
}