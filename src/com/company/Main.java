package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(reader.readLine());
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(dateFormat1.format(date).toUpperCase());



        }

}






































































