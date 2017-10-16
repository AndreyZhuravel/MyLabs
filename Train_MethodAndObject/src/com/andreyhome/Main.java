package com.andreyhome;

public class Main {

    public static void main(String[] args) {
        Star star1 = new Star("ss");
        Star star2 = new Star("ss");
        star1.addStar();
        System.out.println(Star.starcount);
        star2.addStar();
        System.out.println(Star.starcount);

       // System.out.println(Star.SPEED_LIGHT);
       System.out.println(Star.calculateSpeed());

        //System.out.println(Star.getBrightness());
       // System.out.println(Star.getDistance());

    }
}
