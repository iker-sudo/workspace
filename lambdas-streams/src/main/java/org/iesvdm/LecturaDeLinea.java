package org.iesvdm;

public class LecturaDeLinea {
    public static void main(String[] args) throws java.io.IOException {
        int c;
        int contador = 0;

        while ((c = System.in.read()) != '\n') {
            contador++;

            System.out.print((char) c);

        }
        System.out.println("");
        System.out.println("Número de caracteres: " + contador);
    }
}
