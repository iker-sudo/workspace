package org.iesvdm.Stream;

public class JugarConLambdas {
    public static void main(String[] args) {

        Operacion op = (x, y) -> x + y;

        System.out.println("Suma: " + op.oper(1, 2));

        op = (x, y) -> x * y;

        System.out.println("Producto: " + op.oper(1, 2));
    }
}
