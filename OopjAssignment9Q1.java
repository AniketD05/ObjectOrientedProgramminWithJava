
/*1. Write a Java program that throws an arithmetic exception and catch it using a try-catch block. */

public class OopjAssignment9Q1 {

    public static void main(String[] args) {
        try {
            int result = 1 / 0; 
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("\nArithmeticException caught: " + e.getMessage());
        }
    }
}
