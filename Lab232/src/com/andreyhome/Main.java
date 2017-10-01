package com.andreyhome;

/*
1) Add to class MyWindow constructor without parameters, which will
initialize class’s fields by some default values.

2) Create instance of class MyWindow using constructor without parameters.
 */

class MyWindow {

    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;
    private String printFields;

    public MyWindow() {
        this.width = 15.0;
        this.height = 16.0;
        this.numberOfGlass = 4;
        this.color = "Red";
        this.isOpen = true;
    }

    public double getWidth (){
        return width;
    }

    public double getHeight (){
        return height;
    }

    public int getnumberOfGlass (){
        return numberOfGlass;
    }

    public String getColor (){
        return color;
    }

    public boolean getIsOpen (){
        return isOpen;
    }

    public void printFields() {
        System.out.print(getWidth()+"--");
        System.out.print(getHeight()+"--");
        System.out.print(getnumberOfGlass()+"--");
        System.out.print(getColor()+"--");
        System.out.print(getIsOpen());
        System.out.println("\n");
        this.printFields = printFields;
    }
}


public class Main {

    public static void main(String[] args) {

        MyWindow window1 = new MyWindow();
        window1.printFields();

    }
}
