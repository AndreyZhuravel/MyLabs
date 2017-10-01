package com.andreyhome;
/*
1. Create array of MyWindow’s and fill it by creating MyWindow’s objects
using different constructors.

2. Call method printFields() on each array element.

 */

class MyWindow {

    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    private String printFields;

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = 4;
        this.color = "white";
        this.isOpen = true;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = "yellow";
        this.isOpen = false;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = true;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
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

        MyWindow objAry[] = new MyWindow[5];

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                objAry[i] = new MyWindow(15, 16);
                objAry[i].printFields();
            }
            if (i == 1) {
                objAry[i] = new MyWindow(25, 17, 3);
                objAry[i].printFields();
            }
            if (i == 2) {
                objAry[i] = new MyWindow(35, 18, 2, "green");
                objAry[i].printFields();
            }
            if (i == 3) {
                objAry[i] = new MyWindow(45, 19, 1, "blue", true);
                objAry[i].printFields();
            }
            if (i == 4) {
                objAry[i] = new MyWindow(77, 77);
                objAry[i].printFields();
            }

        }

    }
}