package com.andreyhome;

public class Main {

    public static void main(String[] args) {

        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int max = m[0], min = m[0];

        for (int i = 0; i < m.length; i++)
        {
            if (m[i] > max)
                max = m[i];

            if (m[i] < min)
                min = m[i];
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);

        double sum = 0.0;
        for (int i = 0; i< m.length; i++) {
                sum += m[i];
            }

        double avg = sum / m.length;
            System.out.println("Среднее арифметическое число: " + avg);
        }
    }
