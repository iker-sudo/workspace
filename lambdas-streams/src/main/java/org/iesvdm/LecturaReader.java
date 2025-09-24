package org.iesvdm;

import java.io.BufferedReader;
import java.io.FileReader;

public class LecturaReader {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("/home/iker/workspace/lambdas-streams/input.txt");

            BufferedReader input = new BufferedReader(file);
            // lees el primer carácter
            int i = input.read();
            while (i != -1) {

                System.out.print((char) i);
                // lees el siguiente carácter
                i = input.read();
            }
            input.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
