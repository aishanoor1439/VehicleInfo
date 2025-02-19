package com.mycompany.mavenproject8;

import java.util.Scanner;

//Class Definition
public class Car {

    Scanner input = new Scanner(System.in);

//  Attributes
    String brand = "Toyota Corolla";
    double priceNew = 25000;
    String color = "Silver";
    double odometerReading = 45320;

//  Methods
    void getPriceAfterUse() {
        double used = priceNew * (1 - (odometerReading / 60000));
        System.out.println("Price of the car after being used: " + used);

    }

    void updateMilage() {
        System.out.println("Do you want to update mileage?");
        char response = input.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter the updated value:");
            double travelledDistance = input.nextInt();
            odometerReading += travelledDistance;
            System.out.println("Milage updated successfully!");
        } else {
            System.out.println("Thank You for using the program.");
        }
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Original Cost: " + priceNew);
        getPriceAfterUse();
        System.out.println("Color: " + color);
        System.out.println("odometerReading: " + odometerReading);
    }
}
