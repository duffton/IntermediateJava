package net.duffton.javapractice;

public class CarSimulator {

    public static void main(String[] args) {
        System.out.println("Car Simulator running...");

        // Car myToyota = new Car();
        Car myToyota = new Car("Blue", "Wood");

        System.out.println("The car colour is : " + myToyota.colour);

        // myToyota.colour = "Blue";
        // System.out.println("Got a paint job. New colour is: " + myToyota.colour);

        System.out.println("myToyota has " + myToyota.getNumberOfSeats() + "seats");

        Car myHonda = new Car();
        System.out.println(myHonda.colour + " Honda with red " + myHonda.getInterior() + " interior");

        myHonda.drive();

    }

}