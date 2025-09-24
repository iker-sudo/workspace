package org.iesvdm.Stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculadoraFuncional {

    private static Map<String, Operacion> mapOperaciones = new HashMap<>();

    public static void main(String[] args) {

        Operacion suma = (x, y) -> x + y;

        mapOperaciones.put("+", suma);
        mapOperaciones.put("add", suma);

        mapOperaciones.put("-", (x, y) -> x - y);
        mapOperaciones.put("sub", (x, y) -> x - y);

        mapOperaciones.put("*", (x, y) -> x * y);
        mapOperaciones.put("mul", (x, y) -> x * y);

        mapOperaciones.put("/", (x, y) -> x / y);
        mapOperaciones.put("div", (x, y) -> x / y);

        String input = "";
        Scanner sc = new Scanner(System.in);
        while (!"exit".equalsIgnoreCase(input) || !"salir".equalsIgnoreCase(input)) {
            System.out.print("Introduce una operación (o 'exit' para salir): ");
            input = sc.nextLine();
            String[] instruccionAr = input.trim().split(" ");

            if (instruccionAr.length != 3) {
                System.out.println("Formato incorrecto " + input);

            } else {
                // 3 elementos en instuccion
                // ["+", "23", "45"]

                if (mapOperaciones.keySet().contains(instruccionAr[0])) {

                    Double oper1 = parseo(instruccionAr[1]);
                    Double oper2 = parseo(instruccionAr[2]);

                    if (oper1 != null && oper2 != null) {
                        Operacion op = mapOperaciones.get(instruccionAr[0]);
                        double resultado = op.oper(oper1, oper2);
                        System.out.println("Resultado: " + resultado);
                    }

                } else {
                    System.out.println("Operación no contemplada: " + instruccionAr[0]);

                }
            }
        }
    }

    public static double parseo(String str) throws NumberFormatException {

    Double oper1 = null;

    try
    {
       oper1 = Double.parseDouble(str);

    }catch(
    NumberFormatException nfe)
    {

        System.out.println("Formato de primer parámetro incorrecto: " + str);
    }

    return oper1;
    }
}