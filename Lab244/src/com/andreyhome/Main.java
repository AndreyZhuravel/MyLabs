package com.andreyhome;

/*
1) Create Employee class with fields firstName, lastName, occupation, telephone
and static field numberOfEmployees and getters/setters.

2) Class must have constructor, which will initialize class fields and increment numberOfEmployees.

3) Create multiple instances of Employee class and the output numberOfEmployees field to the console.
 */
class Employee {

    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;
    private static int numberOfEmployees;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }

    public Employee (String firstName, String lastName, String occupation, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
        numberOfEmployees++;
    }

    public void printFields() {
        System.out.print(getFirstName()+"--");
        System.out.print(getLastName()+"--");
        System.out.print(getOccupation()+"--");
        System.out.print(getTelephone()+"--");
        System.out.println("\n");
    }

}

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Andrey","Ivanov", "Kiev", "0673222122");
        Employee employee2 = new Employee("Ivan","Petrov", "Lvov", "0997778899");
        Employee employee3 = new Employee("Alex","Semenov", "Kharkov", "0959003030");

        employee1.printFields();
        employee2.printFields();
        employee3.printFields();

        System.out.print(employee1.getNumberOfEmployees());

    }
}
