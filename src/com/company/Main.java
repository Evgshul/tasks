package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s.trim();
        String[] a = s.split("[ ._,?!']+");

        if (s == ""||s.equals("")||s.trim().equals("")) System.out.println(0);
        if (a.length > 400000) return;
        else if (!s.trim().equals("")) System.out.println(a.length);

        for (String r : a) System.out.println(r);
        scan.close();

    }

}

































































