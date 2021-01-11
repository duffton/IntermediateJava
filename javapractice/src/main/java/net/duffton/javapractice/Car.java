package net.duffton.javapractice;

// Car class blueprint for a Car object
public class Car {

    // Car properties
    public String colour = "Black";
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
