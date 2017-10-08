package com.andreyhome;

/*
Write a program that computes the distance an object will fall in Earth's gravity.
Create a new class called GravityCalculator with method calcDist(double time) that
takes double time, and returns the position of an object after falling for time
seconds (outputting the position in meters).

The formula in Math notation is: x(t) = 0.5 × a × time 2 + vi × time + xi
Where:
a - Acceleration (m/s2 ) = -9.81
t - Time (s) (for example t = 10)
vi - Initial velocity (m/s) = 0
xi - Initial position = 0

Declare acceleration value field as a constant;
*/

class GravityCalculator {

    private final static double acceleration = -9.81;
    private double fallingTime = 0.0;
    private double initialVelocity = 0.0;
    private double initialPosition = 0.0;
    private double finalPosition = 0.0;

    public void setFallingTime(double fallingTime) {
        this.fallingTime = fallingTime;
    }

    public double getFallingTime() {
        return fallingTime;
    }

    public void setInitialPosition(double initialPosition) {
        this.initialPosition = initialPosition;
    }

    public double getInitialPosition() {
        return initialPosition;
    }

    public void setInitialVelocity(double initialVelocity) {
        this.initialVelocity = initialVelocity;
    }

    public double getInitialVelocity() {
        return initialVelocity;
    }

    public double calcDist(double fallingTime) {
        finalPosition = (0.5*acceleration*(fallingTime*fallingTime)) + (initialVelocity*fallingTime) + initialPosition;
        System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m");
        return finalPosition;

    }

    public GravityCalculator (double initialPosition, double initialVelocity) {
        this.initialPosition = initialPosition;
        this.initialVelocity = initialVelocity;
    }

}

public class Main {

    public static void main(String[] args) {
	GravityCalculator obj = new GravityCalculator(100,100);
	obj.calcDist(10.0);

    }
}
