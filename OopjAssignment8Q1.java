
/*
1. Design a Java program that will accept an array of integers and perform various
operations on it. The program should have the following features:

a. Accept an array of integers of size n from the user.
b. Display the contents of the array on the console.
c. Calculate and display the sum of all the elements in the array.
d. Calculate and display the average of all the elements in the array.
e. Find and display the largest element in the array.
f. Find and display the smallest element in the array.
g. Sort the array in ascending order and display the sorted array on the console.

You should use static methods to implement the above features.

Example Input:
                Array: {5, 10, 15, 20, 25}
Example Output:
                Contents of Array: 5 10 15 20 25
                Sum of Array: 75
                Average of Array: 15
                Largest element in Array: 25
                Smallest element in Array: 5
                Sorted Array: 5 10 15 20 25 
*/
import java.util.Scanner;
import java.util.Arrays;

public class OopjAssignment8Q1 {

    private static Scanner sc = new Scanner(System.in);

    private static int [] arr1;
    private static int [] arr2;

    public static void initialiseArray(){
        System.out.print("Enter the size of array 1: ");
        int sizeOfArray1 = sc.nextInt();
        arr1 = new int[sizeOfArray1];

        System.out.print("Enter the size of array 2: ");
        int sizeOfArray2 = sc.nextInt();
        arr2 = new int[sizeOfArray2];
    }

    public static void setElements() {
        
        System.out.println("\n---------Array 1---------\n");
                
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("\nEnter Elements [ " + i + " ]    : ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("\n---------Array 2---------\n");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("\nEnter Elements [ " + i + " ]    : ");
            arr2[i] = sc.nextInt();
        }
    }

    public static void getElements() {

        System.out.println("\n---------Array 1---------\n");
        System.out.println(Arrays.toString(arr1) + "\n");

        System.out.println("\n---------Array 2---------\n");
        System.out.println(Arrays.toString(arr2) + "\n");
    }

    public static void sumOfArray() {
        int[] sum = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
                sum[i] = arr1[i] + arr2[i];
        }
        System.out.println("\n---------Sum of Array ---------\n");
        for (int j = 0; j < sum.length; j++) {
            System.out.print((sum[j] + " "));
        }
       
    }

    public static void averageOfArray() {
    }

    public static void largestElement() {
    }

    public static void smallestElement() {
    }

    public static void sortedArray() {
    }

    public static void main(String[] args){

        
        OopjAssignment8Q1.initialiseArray();
        OopjAssignment8Q1.setElements();
        OopjAssignment8Q1.getElements();
        OopjAssignment8Q1.sumOfArray();
        OopjAssignment8Q1.averageOfArray();
        OopjAssignment8Q1.largestElement();
        OopjAssignment8Q1.smallestElement();
        OopjAssignment8Q1.sortedArray();
    }
}
