package com.andreyhome;

abstract class Vechile implements Swimmable, Paintable {
    protected int speed = 25;
    protected int flow = 4;

    abstract protected int getActualspeed(int flow);

    public void swim() {
        int i;
        for (i = 0; i < getActualspeed(flow); i++){
            System.out.printf("swimming");
        }
    }

    public void paint() {
        System.out.println("Vehicle is painting");
    }
}


