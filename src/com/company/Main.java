package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] w = s.split(" +");// razdeljaem stroku na slova, uchitivaem chto mozhet bit probelov >1
        for (int i = 0; i < w.length; i++) {
            if (w[i].length() != 0) {//check is first string is " "
                String a = w[i].substring(0, 1).toUpperCase() + w[i].substring(1);
                //menjaem 1 bukvu na zaglavnuju

                System.out.print(a + " ");
            }

        }
    }
}
































































