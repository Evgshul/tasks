package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for (int i = 1; i < array.length; i++) {
            int a = array[i];
            int b = i - 1;
            while (b >= 0 && array[b] > a) {
                array[b + 1] = array[b];
                b--;
            }
            array[b + 1] = a;
        }
    }
}




































































