
/*5) Find out smallest and largest number in a given Array?  */

import java.util.Arrays;
import java.util.Scanner;

public class OopjAssignment7Q5 {

    public static int[] arr = new int[5];

    public static Scanner sc = new Scanner(System.in);

    public static void setElements() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\nEnter Elements [ " + i + " ]    : ");
            arr[i] = sc.nextInt();
        }
    }

    public static void getElements() {

        System.out.println("\n---------Array---------\n");
        System.out.println(Arrays.toString(arr) + "\n");
    }

    public static void smallestLargestElement(int arr[]){

        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            } else if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Smallest Number: " + smallest);
        System.out.println("Largest Number: " + largest + "\n");
       
    }
    public static void main(String[] args) {

        OopjAssignment7Q5.setElements();
        OopjAssignment7Q5.getElements();
        OopjAssignment7Q5.smallestLargestElement(arr);
    }
}
