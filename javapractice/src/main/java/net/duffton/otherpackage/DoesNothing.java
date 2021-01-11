package net.duffton.otherpackage;

import net.duffton.javapractice.Car;

public class DoesNothing {

    public void tryingStuffOut() {

        Car mySubaru = new Car();
        mySubaru.drive();
        System.out.println(mySubaru.colour);

    }
}
