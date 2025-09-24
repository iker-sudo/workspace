package org.iesvdm;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class LecturaInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("/home/iker/workspace/lambdas-streams/input.txt");

            BufferedInputStream input = new BufferedInputStream(file);
            // lees el primer byte
            int i = input.read();
            while (i != -1) {

                System.out.print((char) i);
                // lees el siguiente byte
                i = input.read();
            }
            input.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
