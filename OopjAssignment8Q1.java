
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


    public static void initialiseArray(){
        System.out.print("Enter the size of array : ");
        int sizeOfArray1 = sc.nextInt();
        arr1 = new int[sizeOfArray1];

    }

    public static void setElements() {
                
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("\nEnter Elements [ " + i + " ]    : ");
            arr1[i] = sc.nextInt();
        }
    }

    public static void getElements() {

        System.out.println("\n" + "Array : " + Arrays.toString(arr1) + "\n");
    }

    public static void sumOfArray() {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            
                sum = sum + arr1[i];
                
        }
        System.out.println("Sum : " + sum + "\n");
    }

    public static void averageOfArray() {

        int totalSum = 0;
        float avg = 0.0f;
        for (int i = 0; i < arr1.length; i++) {
            totalSum += arr1[i];
        }
        avg = totalSum / (float)arr1.length;
       
        System.out.println("Average : " + avg + "\n");

    }

    public static void largestSmallestElement(int[] arr1) {

        int largest = arr1[0];
        int smallest = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > largest) {
                largest = arr1[i];
            } else if(arr1[i] < smallest) {
                smallest = arr1[i];
            }
        }
        System.out.println("Largest Element: " + largest + "\n");
        System.out.println("Smallest Element: " + smallest + "\n");
    }

    public static void sortedArray() {

        int temp = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr1) + "\n");
    }

    public static void main(String[] args){

        OopjAssignment8Q1.initialiseArray();
        OopjAssignment8Q1.setElements();
        OopjAssignment8Q1.getElements();
        OopjAssignment8Q1.sumOfArray();
        OopjAssignment8Q1.averageOfArray();
        OopjAssignment8Q1.largestSmallestElement(arr1);
        OopjAssignment8Q1.sortedArray();
    }
}
