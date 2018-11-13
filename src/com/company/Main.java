package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код

        for (int j = array.length-1; j > 0; j--) {
            for (int i = 1; i < array.length; i++) {
                int tmp;
                if (array[i] > array[i - 1]) {
                    tmp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tmp;
                }
            }
        }


       /* Integer[]rev = new Integer[array.length];
        for(int i =0; i<array.length;i++){
            rev[i]=array[i];
        }
        Arrays.sort(rev,Collections.reverseOrder());
        for(int i=0;i<array.length;i++){
            array[i]=rev[i];
        }*/


    }
}
































































