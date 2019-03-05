package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().replaceAll("^.+[/?]","");
        reader.close();

        String[] strings = s.split("&");
        for (String str:strings) {

            System.out.print(str.replaceAll("[=].+$", "") + " ");
        }for (String str:strings)
            if (str.contains("obj")) {
                try {
                    alert(Double.parseDouble(str.replaceAll("^.+[=]","")));
                }
                catch (Exception e){
                    alert(str);
                }
            }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}










































































