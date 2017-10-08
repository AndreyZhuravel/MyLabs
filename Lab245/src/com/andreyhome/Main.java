package com.andreyhome;

/*
The value of π can be calculated with the series: π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
Write a class MyCalc with public static method calcPi(int) that takes as parameter
an integer n, and computes and returns the value of π approximated to the first n terms of the series.
*/

class MyCalc {

    static void calcPi(int n) {
        int i;
        float a = -1.0000f;
        float b = 0.0000f;
        int del = 4;
        int counter = 0;
        float pi = 0.0000f;

        for (i = 1; i <= n; i++) {

            if ((i % 2) == 0) {
                    //System.out.println("Итерация " + i + " четная ");

                    a = a+2; // увеличение знаменателя на 2, чтобы в знаменателе всегда были нечетные числа
                    b = del / a; // получение значения от деления 4 на знаменатель
                    pi = pi - b; // запись результата в pi

                    counter++; // переход на следующую итерацию

            } else {
                if ((i % 1) == 0) {
                    //System.out.println("Итерация " + i + " нечетная ");
                    a = a+2;
                    b = del / a;
                    pi = pi + b;

                    counter++;
                }

            }

        }
        System.out.println(pi);

    }
}

public class Main {

    public static void main(String[] args) {

        MyCalc acalc = new MyCalc();
        acalc.calcPi(99);


    }
}
