package com.andreyhome;

public class Laptop extends Device {

    @Override
    public void workdevice () {
        System.out.println("I am laptop");
        super.workdevice();
    }

//    @Override
//    public String toString () {
//        return voltage + " voltage";
//    }

    @Override
    public Laptop constructDevice() {
        System.out.println("Laptop");
        return new Laptop();
    }

    public String getOS (){
        String s = "WINDOWS";
        System.out.printf(s);
        return s;

    }

}
