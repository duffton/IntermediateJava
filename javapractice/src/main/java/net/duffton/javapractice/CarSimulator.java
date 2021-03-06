package net.duffton.javapractice;

public class CarSimulator {

    public static void main(String[] args) {
        System.out.println("Car Simulator running...");

        // Car myToyota = new Car();
        Car myToyota = new Car("Blue", "Wood");

        // System.out.println("The car colour is : " + Car.colour);

        // myToyota.colour = "Blue";
        // System.out.println("Got a paint job. New colour is: " + myToyota.colour);

        // System.out.println("myToyota has " + myToyota.getNumberOfSeats() + "seats");

        Car myHonda = new Car();
        // System.out.println(Car.colour + " Honda with red " + myHonda.getInterior() + " interior");

        myHonda.drive();

        // Car.colour = "Pink";
        // System.out.println("myHonda's colour is " + Car.colour);
        // System.out.println("myToyota's colour is also " + Car.colour);

        SelfDrivingCar autoBot = new SelfDrivingCar("Yellow", "Plastic");
        autoBot.drive();
        System.out.println("autoBot colour is " + autoBot.colour);
        System.out.println("autoBot interior is " + autoBot.mInterior);
    }

}