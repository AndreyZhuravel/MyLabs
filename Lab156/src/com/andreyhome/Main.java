package com.andreyhome;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            System.out.print("Please input number a in two digits from 0 to 99: ");
            Scanner scan1 = new Scanner(System.in);

            int a = scan1.nextInt();
            int firstdigit=(a/10)%10;
            int seconddigit =a%10;
            /** используем деление заданного числа по модулю на 10, и последняя цифра заданного числа попадет в остаток.
            Для того, чтобы получить 2 (3,4...) цифру с конца заданного числа нам перед делением по модулю необходимо
            разделить заданно число на 10 (100,1000...)
            */

            int b1 = 2; //степень

            System.out.printf("First digit of your number in square %.0f \n", Math.pow(firstdigit, b1));
            System.out.printf("Second digit of your number in square %.0f \n", Math.pow(seconddigit, b1));
            }
        }



