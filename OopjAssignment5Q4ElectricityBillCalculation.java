/*
4. Electricity Bill Calculation

Create a class named "ElectricityBill" that has the following instance variables:
a. customerName (String)
b. unitsConsumed (double)
c. billAmount (double)

Create a constructor that initializes the customerName and unitsConsumed instance variables.
Define a method named "calculateBillAmount" that calculates the bill amount based on the number of 
units consumed. The formula for calculating the bill amount is:
a. For the first 100 units: Rs. 5 per unit
b. For the next 200 units: Rs. 7 per unit
c. For the remaining units: Rs. 10 per unit 

Implement the "calculateBillAmount" method in the "ElectricityBill" class.

Define a main method that creates an object of the "ElectricityBill" class and 
sets the customerName and unitsConsumed instance variables. 
Then, call the "calculateBillAmount" method to calculate the bill amount and 
display the customerName, unitsConsumed, and billAmount.

*/
import java.util.Scanner;

class ElectricityBill {
    String customerName;
    double unitsConsumed;
    double billAmount; 

    public ElectricityBill( String customerName, double unitsConsumed){
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    public void setCustomerName( String customerName){
        this.customerName = customerName;
    }

    public void setUnitsConsumed( double unitsConsumed){
        this.unitsConsumed = unitsConsumed;
    }

    public String getCustomerName(){
        return customerName;
    }

    public double getUnitsConsumed(){
        return unitsConsumed;
    }

    public double calculateBillAmount(){
        
        if (unitsConsumed <= 100) {

            billAmount = unitsConsumed * 5;

        } else if (unitsConsumed <= 300){
               
            billAmount = (unitsConsumed - 200) * 5 + (unitsConsumed - 100) * 7;

        } else {

            billAmount = (100 * 5) + (200 * 7) + (unitsConsumed - 300 ) * 10;

        } 
        return billAmount; 
    }

}


public class OopjAssignment5Q4ElectricityBillCalculation {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("\n--------------- Welcome to Electricity Bill Calculator ---------------\n");
            
            System.out.print("Enter Name  : ");
            String customerName = sc.nextLine();

            System.out.print("Enter Units : ");
            double unitsConsumed = sc.nextInt();

            ElectricityBill ebill = new ElectricityBill(customerName, unitsConsumed);

            System.out.println("---------------------------------------------------------");
            System.out.printf("Your Bill   : %.2f%n" , ebill.calculateBillAmount());
            System.out.println("---------------------------------------------------------");

            sc.close();
        }
}
