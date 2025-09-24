package org.iesvdm;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class EscribirWriter {
    public static void main(String[] args) {

        String data = "Estas líneas de texto\n irán al fichero Ďœ᨟";

        try {
            // Crea el FileOutputStream
            FileOutputStream file = new FileOutputStream("/home/iker/workspace/lambdas-streams/output.txt");

            // Se envuelve (wrapea) en un stream con bufer. Tamaño búfer de 8192 bytes, por
            // defecto.
            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

            // Se escriben los datos al flujo de salida.
            output.write(array);
            // Nunca olvidar que se debe cerrar el flujo.
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }

}
