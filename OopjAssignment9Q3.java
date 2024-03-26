
/*3. Java program that throws an array index out of bound exception: */

public class OopjAssignment9Q3 {

    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[6]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
