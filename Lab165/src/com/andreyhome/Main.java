package com.andreyhome;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a=4;
        int b=4;

        int i=0;
        int j=0;

        Scanner sc=new Scanner(System.in);

        int arr1[][]=new int[a][b],arr2[][]=new int[b][a];

        System.out.println("Внесите элементы массива построчно");

        for(i=0;i<4;++i)
            for(j=0;j<4;++j)
                arr1[i][j]=sc.nextInt();

        for(i=0;i<4;++i)
            for(j=0;j<4;++j)
                arr2[j][i]=arr1[i][j];

        System.out.println("Матрица до транспонирования:");
        for(i=0;i<b;++i)
        {
            for(j=0;j<a;++j)
            System.out.print(arr2[j][i]+" ");///<<-------
            System.out.println("");
        }

        System.out.println("Матрица после транспонирования:");
        for(i=0;i<b;++i)
        {
            for(j=0;j<a;++j)
            System.out.print(arr2[i][j]+" ");///<<-------
            System.out.println("");
        }

    }
}