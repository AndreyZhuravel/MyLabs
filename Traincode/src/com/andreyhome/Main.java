package com.andreyhome;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// здесь буду тренироваться и писать разные полезные примеры кода
        Scanner me = new Scanner(System.in);
        System.out.println("Введите логин");
        String test1, test2;
        test1 = me.nextLine();
        System.out.println("Введите Ваш домен почты без @");
        test2 = me.nextLine();
        System.out.println("Ваш адрес будет:"+ test1 + "@" + test2);
    }
}