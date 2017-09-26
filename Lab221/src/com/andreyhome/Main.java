package com.andreyhome;


/*
В процессе решения
*/


/*
Create a Matrix class that contains the methods of addition and multiplication of matrices (work with two-dimensional arrays);
 */

import java.util.Scanner;

class Matrix {

        private int a=2;
        private int b=2;
        private int i=0;
        private int j=0;
        private String matrix1;
        int arr1[][] = new int[2][2];
        int arr2[][] = new int[2][2];
        int arr3[][] = new int[2][2];

        public void additionMatrix() {

            System.out.println("Новая матрица:");

            for(i=0;i<2;++i)
                for(j=0;j<2;++j)
                    arr3[i][j]=arr1[i][j]+arr2[i][j];///<<-------Логика сложения элементов матрицы 1 и матрицы 2

            System.out.println("1-ая матрица:");
            for(i=0;i<b;++i)
            {
                for(j=0;j<a;++j)
                    System.out.print(arr1[i][j]+" ");///<<-------
                System.out.println("");
            }

            System.out.println("2-ая матрица:");
            for(i=0;i<b;++i)
            {
                for(j=0;j<a;++j)
                    System.out.print(arr2[i][j]+" ");///<<-------
                System.out.println("");
            }

            System.out.println("3-ая матрица:");
            for(i=0;i<b;++i)
            {
                for(j=0;j<a;++j)
                    System.out.print(arr3[i][j]+" ");///<<-------
                System.out.println("");
            }

            this.matrix1 = matrix1;
        }

    }
class CreateMatrixInstance {

    public static void main(String[] args) {

        int i = 0;
        int j = 0;

//      Matrix arr1[][];
//      Matrix arr2[][];
//      Matrix arr3[][];
        int arr1[][] = new int[2][2];
        int arr2[][] = new int[2][2];
        int arr3[][] = new int[2][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Внесите элементы массива построчно для 1-ой матрицы");
        for (i = 0; i < 2; ++i)
            for (j = 0; j < 2; ++j)
                arr1[i][j] = sc.nextInt();

        System.out.println("Внесите элементы массива построчно для 2-ой матрицы");
        for (i = 0; i < 2; ++i)
            for (j = 0; j < 2; ++j)
                arr2[i][j] = sc.nextInt();

        System.out.println("Новая матрица:");

        for(i=0;i<2;++i)
            for(j=0;j<2;++j)
                arr3[i][j]=arr1[i][j]+arr2[i][j];///<<-------Логика сложения элементов матрицы 1 и матрицы 2

        for(i=0;i<2;++i)
        {
            for(j=0;j<2;++j)
                System.out.print(arr3[i][j]+" ");///<<-------
            System.out.println("");
        }

    }
}

//    int arr1[][]=new int[a][b],arr2[][]=new int[c][d],arr3[][]=new int[e][f];



public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
