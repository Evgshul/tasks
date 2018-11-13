package com.company;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Main {


    public static void main(String[] args) throws Exception {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()//metod ignora registra
                .appendPattern("MMMM d yyyy")//vtnjl ghbvtytybz gfnthyf
                .toFormatter();//
        LocalDate date1 = LocalDate.parse(date, formatter);

        if (date1.getDayOfYear() % 2 != 0) return true;
        else return false;
    }
}
























































