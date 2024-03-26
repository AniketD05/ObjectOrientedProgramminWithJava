
/*2. Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd: */

public class OopjAssignment9Q2 {
    
        public static void main(String[] args) {
            try {
                checkEvenNumber(5);
            } catch (Exception e) {
                System.out.println("\nException caught: " + e.getMessage());
            }
        }
    
        static void checkEvenNumber(int num) throws Exception {
            if (num % 2 != 0) {
                throw new Exception("OddNumberException: Number is odd.");
            } else {
                System.out.println("Number is even.");
            }
        }
    }
    
