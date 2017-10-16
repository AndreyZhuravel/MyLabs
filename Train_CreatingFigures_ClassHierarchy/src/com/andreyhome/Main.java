package com.andreyhome;

public class Main {

    public static void main(String[] args) {

        //Создаем отрезок
        Otrezok otrezok = new Otrezok();
        System.out.println("Отрезок равен = " + otrezok.lang(1,2,3,4));
        System.out.println("------------------");

        //Создаем квадрат
        System.out.println("Создаем квадрат");
        Square square = new Square(19);

        System.out.println("Площадь квадрата = " + square.areaShape());
        System.out.println("Периметр квадрата = " + square.perimetrShape());
        square.paintingShape();
        System.out.println("------------------");

        //Создаем пятиугольник
        Pentagon pent = new Pentagon();
        pent.setHeightPentagon(14);

        System.out.println("Площадь пятиугольника = " + pent.areaShape());
        System.out.println("Периметр пятиугольника = " + pent.perimetrShape());
        pent.paintingShape();
        System.out.println("------------------");

        //Создаем прямоугольник
	    Rectangle rec = new Rectangle(10,10);
//        rec.setHeightRectangle(12);
//        rec.setWidthRectangle(20);

        System.out.println("Площадь прямоугольника = " + rec.areaShape());
        System.out.println("Периметр прямоугольника = "+ rec.perimetrShape());
        rec.paintingShape();
        System.out.println("------------------");

    }
}
