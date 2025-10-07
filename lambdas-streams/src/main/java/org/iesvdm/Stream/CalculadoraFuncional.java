package org.iesvdm.Stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculadoraFuncional {

    // validar

    // operar

    public static void main(String[] args) {

        Map<String, Operacion> mapOperaciones = new HashMap<>();

        Operacion operacionSuma = (x, y) -> x + y;
        mapOperaciones.put("+", operacionSuma);
        mapOperaciones.put("add", operacionSuma);

        mapOperaciones.put("-", (x, y) -> x - y);
        mapOperaciones.put("sub", (x, y) -> x - y);

        mapOperaciones.put("*", (x, y) -> x * y);
        mapOperaciones.put("mul", (x, y) -> x * y);

        mapOperaciones.put("/", (x, y) -> x / y);
        mapOperaciones.put("div", (x, y) -> x * y);

        String input = "";
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        while (!input.equalsIgnoreCase("exit") && !input.equalsIgnoreCase("salir")) {
            // REFINAMIENTO PROGRESIVO DE LA IDEA
            // input = "+ 23 45"
            String[] instruccionArr = input.trim().split(" ");

            if (instruccionArr.length != 3) {
                System.out.println("Formato de entrada '" + input
                        + "'' incorrecto");
            } else {
                // 3 elementos en instruccion
                // [ "+", "23", "45" ]

                if (mapOperaciones.keySet().contains(instruccionArr[0])) {

                    Double oper1 = parseo(instruccionArr[1]);

                    Double oper2 = parseo(instruccionArr[2]);

                    if (oper1 != null && oper2 != null) {

                        Operacion op = mapOperaciones.get(instruccionArr[0]);
                        Double resul = op.oper(oper1, oper2);

                        System.out.println("Resultado: " + resul);
                    }

                } else {
                    System.out.println("Operación '" + instruccionArr[0]
                            + "' no contemplada");
                }
            }
            input = scanner.nextLine();
        }

    }

    public static Double parseo(String str) {

        Double oper1 = null;
        try {

            oper1 = Double.parseDouble(str);

        } catch (NumberFormatException nfe) {
            // System.err.println(nfe);
            System.out.println("Formato de parámetro '" + str
                    + "'incorrecto");

        }

        return oper1;

    }

}