package com.andreyhome;

/*
Add to class MyMath final static field PI = 3.14 and static
method areaOfCircle(), which will take radius, use constant PI and calculate area.
 */

class Calculation {

    private int [] array;


    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }
}

class MyMath {

    private final static double PI = 3.1415926;
    private int radius;

    static double areaOfCircle (int radius) {
        return radius*PI;
    }

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

        //Сделаем ccылку на объект массива MyMath и вызовем метод areaOfCircle
        MyMath circle = new MyMath();
        System.out.println(circle.areaOfCircle (35));

        //Сделаем 2 массива и наполним их
        Calculation arr1 = new Calculation();
        Calculation arr2 = new Calculation();

        arr1.setArray(new int[]{10, 21, 5, 22});
        arr2.setArray(new int[]{9, 8, 7, 4});

        //для доступа к методам MyMath для этих массивов нужно создать ссылку на объект для этого класса (MyMath)...

        MyMath massiv = new MyMath();

        // на этом объекте мы можем уже оперировать нашим массивом получая его через метод get класса Calculation
        // и передавать его в метод findMax\findMin класса MyMath

        massiv.findMin(arr1.getArray());
        massiv.findMax(arr1.getArray());

        massiv.findMin(arr2.getArray());
        massiv.findMax(arr2.getArray());

    }
}

