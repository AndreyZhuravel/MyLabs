package com.andreyhome;

public class Main {

    public static void main(String[] args) {
        int[][] array = new int[4][4];

        array[0][0] = 1;
        array[1][0] = 2;
        array[2][0] = 3;
        array[3][0] = 4;
        array[0][1] = 5;
        array[1][1] = 6;
        array[2][1] = 7;
        array[3][1] = 8;
        array[0][2] = 9;
        array[1][2] = 10;
        array[2][2] = 11;
        array[3][2] = 12;
        array[0][3] = 13;
        array[1][3] = 14;
        array[2][3] = 15;
        array[3][3] = 16;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}