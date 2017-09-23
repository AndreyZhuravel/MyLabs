package com.andreyhome;

class Computer {
    private String manufacturer;
    private int serialNumber;
    private int quantityCPU;
    private int frequencyCPU;
    private float price;

    /*--1--*/
    public String getManufacturer() {
        return manufacturer;}

    public void setManufacturer (String manufacturer) {
        this.manufacturer = manufacturer;}

    /*--2--*/
    public int getSerialNumber() {
        return serialNumber;}

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;}

    /*--3--*/
    public int getQuantityCPU() {
        return quantityCPU;}

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;}

    /*--4--*/
    public int getFrequencyCPU() {
        return frequencyCPU;}

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;}

    /*--5--*/
    public float getPrice() {
        return price;}

    public void setPrice(float price) {
        this.price = price;}

}

public class Main {
    public static void main(String[] args) {

        String [] pcs; /*К ссылочным типам данных относятся массивы, строки и классы. Строка типа String является объектом*/
        pcs = new String [5]; /*Создадим массив из 5 символьных строк*/

        for (String element : pcs) { /* для каждого элемента массива pcs создадим объект pc */
            Computer pc = new Computer();
            System.out.println(element); /*для каждого элемента должно возвратиться null*/
            }
        }

}

