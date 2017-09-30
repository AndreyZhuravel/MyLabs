package com.andreyhome;

/*
    Write class Employee with method calcSalary with argument name(String)
    and varargs salary(double…). This method should calculate total salary
    of employee and print his name and total salary. Write class Accountant
    that will be create Employee instance and use his method with a different number of data.

*/

import java.util.Scanner;

class Employee {

    private String name;
    private double salary;
    private double calcSalary;

    /*--1--*/
    public String getName() {
        return name;
    }

    public void setName(String name) {// Сюда передается строковая переменная name из класса Accountant = имя Employee
        System.out.println(name);
        this.name = name;
    }

    /*--2--*/
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /*--3--*/
    // Просуммировать введенные пользователем данные нужно в классе Employee

    public void calcSalary(double[] arr1) { // Сюда передается заполненный массив arr1 из класса Accountant

        double sum=0; // Объявляем новый параметр sum с типом double так как salary - тоже double

        for (int i = 0; i < arr1.length; i++) { // Проходим по массиву...
            sum=sum+arr1[i];} // ..суммируя его элементы
            System.out.println(sum); // Выводим сумму значений элементов массива
            this.calcSalary = calcSalary; // Возвращаем значение метода
        }
}

class Accountant {
    public static void main(String[] args) {

        // Считать данные пользователя нужно в классе Аccountant

        Scanner sc = new Scanner(System.in); // Объявляем Scanner
        Employee abc = new Employee(); // Создаем нового сотрудника через класс Employee

        System.out.println("Введите имя сотрудника: ");
        String name = sc.nextLine(); // Считаем имя сотрудника и запишем его в name, которое есть в классе Employee

        System.out.println("Сколько будет элементов в массиве?: ");
        int size = sc.nextInt(); // Считаем размер массива и запишем в size = ограничение массива
        double arr1[] = new double[size]; // Создаём массив arr1 размером в size
        System.out.println("Введите элементы массива: ");

        /*Заполним массив элементами на основе ввода пользователя с ограничением по длине (size)*/
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt(); // Заполняем массив
            abc.setSalary(i); // Для каждого элемента массива вызовем метод SetSalary в классе Employee и установим в salary - зарплату сотрудника//
        }

        // Если нужно вывести на печать элементы массива = т.е. зарплату
        // System.out.print(": ");
        // for (int i = 0; i < size; i++) {
        // System.out.print(" " + arr1[i]); // Вывод на экран
        //}

        abc.setName(name); // Вызовем метод setName в классе Employee для созданного сотрудника и запишем туда имя сотрудника на основе ввода пользователя

        //System.out.println(name); // Можно вывести имя сотрудника и просто вот так так как мы только что его создали

        abc.calcSalary(arr1); // Вызовем метод calcSalary в классе Employee для созданного сотрудника на основе данных в массиве - нам их нужно просуммировать
    }
}

    public class Main {
        public static void main(String[] args) {


        }
    }






