package com.andreyhome;

/*
Create class Person with fields firstName(String), lastName(String), age(int),
gender(String), phoneNumber(int), and five overloaded methods that set this
fields with different arguments list. Create class that will be use instance
of class Person and his methods.

!!! using overloaded methods
 */

class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private int phoneNumber;

    public void test(String firstName) {
        this.firstName = firstName;
        System.out.println(firstName);
    }

    public void test(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(firstName + " " + lastName);
    }

    public void test(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        System.out.println(firstName + " " + lastName + " " + gender);
    }

    public void test(int age) {
        this.age = age;
        System.out.println(age);
    }

    public void test(int age, int phoneNumber) {
        this.age = age;
        this.phoneNumber = phoneNumber;
        System.out.println(age + " " + phoneNumber);
    }
}

public class Main {

    public static void main(String[] args) {

	Person abc = new Person();
        abc.test("Andrey");
        abc.test("Andrey","Zhuravel");
        abc.test("Andrey","Zhuravel","Male");
        abc.test(9);
        abc.test(9,671234567);
    }
}
