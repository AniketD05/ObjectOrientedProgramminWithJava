
/*
6)Implement a program that calculates the Body Mass Index (BMI) based on height and 
weight input using if-else to classify the BMI int categories 
(underweight, normal weight, overweight, etc. 
*/
import java.util.Scanner;

public class OopjAssignment1Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height(cm): ");
        float height = sc.nextFloat();

        System.out.println("Enter Weight(kg): ");
        float weight = sc.nextFloat();
        
        height = height/100;
        float bmi = (weight) / (height * height);

    
        System.out.println("-------------------");
        System.out.println("Your Details: ");
        System.out.println("-------------------");
        System.out.printf("%-10s%s%n", "Height:", height + " cm");
        System.out.printf("%-10s%s%n", "Weight:", weight + " kg");
        System.out.println("-------------------");
        System.out.printf("%-10s%.2f kg/m^2%n", "BMI:", bmi);

        System.out.println("-------------------");
        if(bmi < 18.50){
            System.out.println("'Underweight'");
           } else if (bmi >= 18.50 && bmi <= 24.90) {
            System.out.println("'Normal weight'");
           } else{
            System.out.println("'Overweight'");
           }
        System.out.println("-------------------");
        sc.close();
    }
}
