package com.andreyhome;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner me = new Scanner(System.in); //создаем  новый  объект  сканнер
        System.out.println("Enter the name of the student"); // выводим строку с приветствием
        String test = me.nextLine(); //считываем введенную информацию через строку

        System.out.println("Name of the student is..." + test +" :_) !"); //выводим строку пользователю
    }
}
