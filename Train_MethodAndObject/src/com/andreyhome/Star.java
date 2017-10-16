package com.andreyhome;

public class Star {

    private String brightness; //--сначала идут поля
    private int distance;

    public static final int SPEED_LIGHT = 123;
    public static int starcount;

    public static int calculateSpeed (){
       // return starcount*distance; //--нельзя вызывать статику из нестатики
        System.out.println("test");
        return starcount;
    }

    public int addStar(){
        return starcount++;
    }

    public Star(String shine){ //--потом конструкторы
        this (shine,120);
    }

    public Star(final String shine, final int distance){
        this.brightness = shine;
        this.distance = distance;
    }

    public void setBrightness(String brightness) { //--потом методы
        this.brightness = brightness;
    }

    public String getBrightness() {
        return brightness;
    }

    public int getDistance() {
        return distance;
    }

}
