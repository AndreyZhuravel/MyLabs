package com.andreyhome;

public class Main {

    public static void main(String[] args) {
        double a = 3.14;
        byte b;

        int c = 700;
        double d = 61.94;
        long e = (long) 5.854981;

        System.out.println((b = (byte) a)); //b будет равно 3
        System.out.println((double) c); //c будет: 700.0
        System.out.println((int) d); //d будет: 61
        System.out.println((int) e); //e будет: 5
    }
}
