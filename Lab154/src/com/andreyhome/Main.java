package com.andreyhome;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        int counter = 0;

        for (i = 1; i <= 300; i++) {
            if (counter ==10) {
                break;
            }
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);
                counter++;
                //System.out.println(counter); -- тут работает счетчик
            }
        }

    }
}

