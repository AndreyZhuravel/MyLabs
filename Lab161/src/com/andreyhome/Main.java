package com.andreyhome;

public class Main {

    public static void main(String[] args) {

        int[] mas;
        mas = new int[16];
        int i;
        int a=2;

        for(i = 1; i < 16;i++)
            mas[i] = i*a;
            i++;

        for(i = 1; i < mas.length; i++)
            System.out.print("[" + "" + mas[i]+"]");

        }
    }

