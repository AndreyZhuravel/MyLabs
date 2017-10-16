package com.andreyhome;

public class Main {

    public static void main(String[] args) {
        Swimmable submarine = new Submarine();
        Swimmable ship = new Ship();
        Swimmable[] arr = {submarine,ship};

        for (int i=0; i <arr.length; i++) {
            arr[i].swim();
            System.out.println("");
        }

        Paintable submarine1 = new Submarine();
        Paintable ship1 = new Ship();
        Paintable wall = new Wall();
        Paintable[] arr1 = {submarine1,ship1,wall};
        for (int i=0; i <arr1.length; i++) {
            arr1[i].paint();
        }
    }
}
