package com.andreyhome;

public class Main {

    public static void main(String[] args) {
        Device device = new Laptop();
//        device.workdevice();

//        if (device instanceof Laptop) {
//            Laptop laptop = (Laptop) device;
//            laptop.workdevice();
//            laptop.getOS();
//        }

    Laptop note1 = new Laptop();
	Device one1 = new Device();

	Laptop note2 = note1.constructDevice();
	Device one2 = one1.constructDevice();

  System.out.println(note2);
  System.out.println(one2);

//  Device.workdevice();
//  System.out.println(device);

    }
}
