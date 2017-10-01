package com.andreyhome;

/*
Change code in two overloaded constructors to invoke first constructor using this keyword.
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
        this.numberOfGlass = 44;
        this.color = "white";
        this.isOpen = true;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width,height);
        this.numberOfGlass = numberOfGlass;
        this.color = "BLACK";
        this.isOpen = false;
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

        MyWindow window1 = new MyWindow(22,33);
        MyWindow window2 = new MyWindow(12,13,8);
        MyWindow window3 = new MyWindow(44,55);

        window1.printFields();
        window2.printFields();
        window3.printFields();

    }
}
