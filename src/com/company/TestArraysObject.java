package com.company;

public class TestArraysObject {

    public static Cars[] cars;

    public static void main(String[] args) {
        cars = new Cars[2];

        cars[0]=new Cars("0",20,100);

    }

    public static class Cars {
        private String Id;
        private int rashod;
        private int bak;

        public Cars(String id, int rashod, int bak) {
            Id = id;
            this.rashod = rashod;
            this.bak = bak;
        }
    }


}
