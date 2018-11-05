package com.company;

import java.util.HashSet;

public class Main {

    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> num = new HashSet<>();

        for (int i = 1; i <= 20; i++) {
            num.add(i);
        }
        return num;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // напишите тут ваш код

            set.removeIf(x -> x.intValue() > 10);


        /*Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            Integer num = iter.next();
            if (num > 10)
                iter.remove();*/

        return set;
    }

    public static void main(String[] args) throws Exception {

        System.out.println(removeAllNumbersGreaterThan10(createSet()));

    }
}

























































