package net.duffton.javapractice;

// Car class blueprint for a Car object
public class Car {

    // Car properties
    public static String colour = "Black"; // creates a single copy of variable and all car objects point to it, can be accessed via the class name rather than the specific object name i.e. Car.colour - A static method can be called without creating an object.
    private int mNumberOfSeats = 5;
    private String mInterior;

    // Car constructor no arguments/parameters
    public Car() {
        // additional instructions go here
        mInterior = "Leather";
    }

    // Car constructor with parameters
    public Car(String chosenColour, String chosenInterior) {
        colour = chosenColour;
        mInterior = chosenInterior;
    }

    public String getInterior() {
        return mInterior;
    }

    public int getNumberOfSeats() {
        return mNumberOfSeats;
    }

    public void drive() {
        System.out.println("Car is moving.");
    }

}
