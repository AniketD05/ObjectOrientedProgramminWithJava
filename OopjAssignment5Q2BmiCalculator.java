/*1. 
2. BMI Calculator
You have been asked to write a Java program to implement a BMI (Body Mass Index) calculator. 
The program should have the following functionality:

The BMI calculator class should have the following fields:

a. height: A double field to store the height of the person in meters.
b. weight: A double field to store the weight of the person in kilograms.

The BMI calculator class should have the following methods:

a. A constructor to initialize the height and weight fields of the BMI calculator object.
b. Getter and setter methods.
c. Double calculateBMI(): A method to calculate the BMI of the person using the
following formula:

BMI = weight / (height * height).

Write a Java program that creates an object of the BMI calculator class, 
prompts the user to input their height and weight, sets the height and weight fields of the 
BMI calculator object using the setter methods, calculates the BMI using the calculateBMI() method, 
and prints the calculated BMI to the console.

*/

import java.util.Scanner;

class BMICalculator {
    private double height;
    private double weight;

    public BMICalculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setweight(double weight) {
        this.weight =  weight;
    }

    public double getheight() {
        return height;
    }

    public double getweight() {
        return weight;
    }


    public double calculateBMI() {
        double BMI = weight / (height * height); 
        return BMI;
    }

}

class OopjAssignment5Q2BmiCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n---------- WELCOME TO BMI CALCULATOR ----------");

        System.out.printf("\nEnter Height (meter)     : ");

        double height = sc.nextDouble();

        System.out.printf("Enter your Weight (kg)    : ");

        double weight = sc.nextDouble();

        BMICalculator bcal = new BMICalculator(height,weight);
        
        double BMI = bcal.calculateBMI();

        System.out.printf("\nYour BMI    : %.3f%n" , BMI );

        sc.close();
    }
}