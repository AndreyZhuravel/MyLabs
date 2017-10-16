package com.andreyhome;

public class Device {

    protected int voltage;

    public void workdevice() {
        System.out.println("I work");
    }

    public Device constructDevice() {
        System.out.println("Device");
        return new Device();
    }
}

