package com.andreyhome;

/*
· Writing simple console application, using overloaded methods and final argument

- Write class A with overridden methods calcSquare that calculate square of rectangle,
square of foursquare and square of circle and print result. Write class that will
use these methods.

- Write class with method that will take final integer and assign
to it the square of this integer and print result. What will you get? Explain result.

· Student should use overloaded methods · Student should understand how to use final arguments

Rectangle
Area = w × h
w = width
h = height

Area = a2
a = length of side

Circle
Area = π × r2
Circumference = 2 × π × r
r = radius

 */
class A {
    private int width;
    private int height;
    private int radius;
    private double area;
    private double pi;

    public void CalculateSquare (int width, int height) {
        area = width*height;
        this.area = area;
        System.out.println("SquareOfRectangle is:" + area);
    }

    public void CalculateSquare (int width) {
        area = width*width;
        this.area = area;
        System.out.println("SquareOfFoursquare is:" + area);
    }

    public void CalculateSquare (int radius,double pi) {
        area = radius*pi;
        this.area = area;
        System.out.println("SquareOfFoursquare is:" + area);
    }
}



//При запуске класса B возникает ошибка так как final параметр area
//который принимается на вход не может быть переопределен в ходе выполнения кода
//
//class B {
//private double area;
//
//public void CalculateSquare (final double area) {
//area = area*area;
//this.area = area;
//System.out.println("Class B using final integer: " + area);
//}
//}

public class Main {

    public static void main(String[] args) {
        A a = new A();
        System.out.printf("Class A:" + "\n");
        a.CalculateSquare(18,32);
        a.CalculateSquare(18);
        a.CalculateSquare(5,3.1415926);

//        System.out.printf("Class B:" + "\n");
//        B b = new B();
//        b.CalculateSquare (18);
//

    }
}
