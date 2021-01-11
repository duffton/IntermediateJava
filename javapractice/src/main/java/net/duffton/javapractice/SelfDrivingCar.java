package net.duffton.javapractice;

public class SelfDrivingCar extends Car {

    public SelfDrivingCar(String chosenColour, String chosenInterior) {
        super(chosenColour, chosenInterior);
        System.out.println("Constructing self-driving car.");
    }

    @Override // tells compiler that a subclass is using the method and notifies of any changes or errors.
    public void drive() {
        super.drive();
        System.out.println("Driving to Googleplex, Mountain View");
    }

}
