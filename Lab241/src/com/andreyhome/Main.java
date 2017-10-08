package com.andreyhome;

/*
Create class MyMath with two static methods (findMin and findMax), which
will take array of int values as argument and return minimum element value
(for findMin method) or maximum element value (for findMax method).
 */

class MyMath {

    static void findMin (int [] massiv) {
        int min = massiv[0];

        for (int i = 0; i < massiv.length; i++)
        {
                if (massiv[i] < min)
                min = massiv[i];
        }
        System.out.println("Минимальное число: " + min);
    }

    static void findMax (int [] massiv) {
        int max = massiv[0];

        for (int i = 0; i < massiv.length; i++)
        {
            if (massiv[i] > max)
                max = massiv[i];
        }
        System.out.println("Максимальное число: " + max);

    }

}

public class Main {

    public static void main(String[] args) {

        MyMath massiv = new MyMath();

        massiv.findMin(new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14});
        massiv.findMax(new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14});

    }
}
