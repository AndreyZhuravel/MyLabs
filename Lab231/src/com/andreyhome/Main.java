package com.andreyhome;

/*
1) Create class MyWindow with fields width (of double type), height (of double type),
numberOfGlass(of int type), color(of String type), isOpen(boolean).
2) Create five instances of class MyWindow with different fields values.
3) Add method printFields() to MyWindow class that print all fields values to console.
 */

class MyWindow {

    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;
    private String printFields;

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

        MyWindow window1 = new MyWindow(15,16,4,"white", true);
        MyWindow window2 = new MyWindow(25,17,3,"red", true);
        MyWindow window3 = new MyWindow(35,18,2,"green", false);
        MyWindow window4 = new MyWindow(45,19,1,"blue", true);
        MyWindow window5 = new MyWindow(55,20,5,"yellow", false);

        window1.printFields();
        window2.printFields();
        window3.printFields();
        window4.printFields();
        window5.printFields();

    }
}