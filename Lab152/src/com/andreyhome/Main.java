package com.andreyhome;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Please input number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number<9) {
            switch (number) {
                case 1: System.out.println ("You enter One");
                    break;
                case 2: System.out.println ("You enter Two");
                    break;
                case 3: System.out.println ("You enter Three");
                    break;
                case 4: System.out.println ("You enter Four");
                    break;
                case 5: System.out.println ("You enter Five");
                    break;
                case 6: System.out.println ("You enter Six");
                    break;
                case 7: System.out.println ("You enter Seven");
                    break;
                case 8: System.out.println ("You enter Eight");
                    break;
                case 9: System.out.println ("You enter Nine");
                    break;
            }
        } else
        System.out.println ("You enter Other (Number >10)");
    }
}

