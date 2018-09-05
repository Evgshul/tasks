package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        binsearch();
        System.out.println(binsearch());
    }

    public static int binsearch() {
        int mas[] = {1, 2, 3, 5, 6, 7};
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();

        int left = 0;
        int right = mas.length;
        while (left < right) {
            int m = (left + right) / 2;
            if (mas[m] == j) {
                return mas[m];
            }
            if (mas[m] > j) {
                right = m;
            } else if (mas[m] < j) {
                left = m + 1;
            }
        }
        return -1;
    }
}
