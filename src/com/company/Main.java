package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {


        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 4; i++) {
            list.add(reader.readLine());
        }


        for (int j = 1; j < list.size(); j++) {
            if (list.get(j).length() != ((list.get(j - 1).length()) + 1)
                    || list.get(j).length() == list.get(j - 1).length()) {
                System.out.println(j+1);
                break;
            }

        }

    }
}


























































