package com.company;

public class StringTest {

    public static void main(String[] args) {

        String[] strings = new String[]{"asd", "qwer", "Buba"};
        String d = "";
        for (String s : strings) {
            if (s.equals("asd") || s.equals("Buba")) {
                d += s + ", ";
            }
        }
        System.out.println(d);

    }
}
