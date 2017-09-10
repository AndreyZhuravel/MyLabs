package com.andreyhome;

public class Main {

    public static void main(String[] args) {
        int a , b;
        a = 5;
        b = (a == 5) ? 20 : 100;
        System.out.println( "Integer b: " +  b ); // тут будет выведено 20

        b = (a == 10) ? 20 : 100;
        System.out.println( "Integer b: " + b ); // тут будет выведено 100
    }
}
