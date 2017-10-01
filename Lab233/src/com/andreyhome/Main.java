package com.andreyhome;

/*
Add to class MyWindow overload constructors, which will initialize class’ fields,
depend from what data we will put there: MyWindow(width, height), MyWindow(width, height, numberOfGlass).

Finally class MyWindow must have four constructors.

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

        MyWindow window1 = new MyWindow(15,16);
        MyWindow window2 = new MyWindow(25,17,3);
        MyWindow window3 = new MyWindow(35,18,2,"green");
        MyWindow window4 = new MyWindow(45,19,1,"blue", true);

        window1.printFields();
        window2.printFields();
        window3.printFields();
        window4.printFields();

    }
}
