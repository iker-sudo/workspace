package ejerciciosRepaso;

import java.util.Scanner;

public class EjercicioB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio con IVA: ");
        double precioConIva = sc.nextDouble();
        System.out.print("Tipo de IVA (general, reducido, superreducido): ");
        String tipoIva = sc.next().toLowerCase();

        double iva = 0;
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
                System.out.println("Tipo de IVA no válido.");
                sc.close();
                return;
        }

        double precioSinIva = precioConIva / (1 + iva / 100);
        System.out.printf("El precio antes de impuestos es: %.2f euros", precioSinIva);
        sc.close();
    }
}