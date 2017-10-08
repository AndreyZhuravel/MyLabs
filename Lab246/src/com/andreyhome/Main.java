package com.andreyhome;

/*
Write a class MyPyramid with public static method printPyramid(int h)
that takes parameter an integer h between 1 and 9, and prints a pyramid
of numbers of height h. Example: For h = 4 the method should print the pyramid 1 121 12321 1234321

 */

class MyPyramid {

    static void printPyramid(int h) {

        int countrow = 1;

        for (int i = h; i > 0; i--) //Организовываем цикл по высоте = количеству строк
        {
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" "); //Печатаем 2 пробела между цифрами
            }

            //Счет цифр в порядке возрастания
            for (int j = 1; j <= countrow; j++)
            {
                System.out.print(j+" ");
            }

            //Счет цифр в порядке убывания
            for (int j = countrow-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();

            countrow++;
        }

    }
}

public class Main {

    public static void main(String[] args) {

        MyPyramid piramidka = new MyPyramid();
        piramidka.printPyramid(4);
    }
}
