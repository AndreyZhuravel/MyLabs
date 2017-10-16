package com.andreyhome;

import java.util.Scanner;

public class Createphone {

    public static void main(String[] args) {

        Phone Meizu = new Phone(); /* create new object iPhone*/
        Scanner in = new Scanner(System.in);

        System.out.println("Please input color");
        String color = in.nextLine(); /* write user input to variable color */

        Meizu.setColor(color); /* put green color to new object*/
        Meizu.setModel("Meizu"); /* put model to new object*/
        Meizu.setType("23482387"); /* put type to new object*/
        System.out.println(Meizu.getColor()); /* print color of new object*/
        System.out.println(Meizu.getModel()); /* print model of new object*/
        System.out.println(Meizu.getType()); /* print type of new object*/
        Meizu.call("la-la-la");; /* print ringtone of new object*/
        System.out.println(Meizu.getPrice(color)); /* call getPrice method according to user input and print price*/
    }
}
