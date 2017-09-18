package com.andreyhome;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Please input number a: ");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();

        System.out.print("Please input number b higher then a: ");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();

        if (a > b) {
            System.out.println("Be careful: a>b. Let's try again");
        } else {
            double sum = 0.0;
            double avg = 0.0;
            int i = 1;
            int counter = 0;

            for (i = a; i <= b; i++) {
                sum += i;
                counter = counter + 1;
                avg = (sum / counter);
            }
            System.out.println("Sum=" + sum);
            System.out.println("Avg=" + avg);
            }
    }

}
