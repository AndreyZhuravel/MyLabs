package com.andreyhome;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] m = {-10, -15, 5, 10, 15, 20, 25, 22, 15, 10, -9, -2};

        System.out.println("Отрицательные");
        for (int value : m) {
        if (value < 0) {
            System.out.println(value);
        }
    }
        System.out.println("Положительные");
        for (int value : m) {
        if (value >= 0) {
            System.out.println(value);
        }
    }
        //
        //System.out.println("Сортировка");
        //Arrays.sort(m);
        //System.out.println(Arrays.toString(m));

}
}