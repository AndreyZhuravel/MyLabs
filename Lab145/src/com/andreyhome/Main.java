package com.andreyhome;

public class Main {

    public static void main(String[] args) {
        int a = 3; // по условию задачи переменные равны друг другу
        int b = 3; // по условию задачи переменные равны друг другу
        System.out.println(a << b); //сдвиг влево на N позиций означает умножение числа на 2 в степени N = 3 * (2*2*2) = 24
        System.out.println(a >> b); //сдвиг вправо на N позиций означает деление числа на 2 в степени N = 3 / (2*2*2) = 0,375
        System.out.println(a << 4); // 3*(2*2*2*2) = 48
        System.out.println(b >> 3); // 3 / (2 в степени 4)

    }
}
