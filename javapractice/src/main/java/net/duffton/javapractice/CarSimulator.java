package net.duffton.javapractice;

public class CarSimulator {

    public static void main(String[] args) {
        System.out.println("Car Simulator running...");

        Car myToyota = new Car();

        System.out.println("The car colour is : " + myToyota.colour);

        myToyota.colour = "Blue";

        System.out.println("Got a paint job. New colour is: " + myToyota.colour);

    }

}