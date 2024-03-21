
/*4)  Write a program to reverse an Array in java .  */

import java.util.Scanner;
import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

public class OopjAssignment7Q4 {

    public static int[] arr = new int[5];

    public static Scanner sc = new Scanner(System.in);

    public static void setElements() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\nEnter Elements [ " + i + " ]    : ");
            arr[i] = sc.nextInt();
        }
    }

    public static void getElements() {

        System.out.println("\n---------Original Array---------\n");
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int arr[], int length) {
        int temp;
        for (int i = 0; i < length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
        System.out.println("\n---------Reversed Array using for-loop---------\n");
        System.out.println(Arrays.toString(arr));
    }

    // public static void reverseArray2(int arr[]) {
    //
    // Collections.reverse(Arrays.asList(arr));
    //
    // System.out.println("\n---------Reversed Array Using Collection---------\n");
    // System.out.println(Arrays.toString(arr));
    // }

    public static void main(String[] args) {
        OopjAssignment7Q4.setElements();
        OopjAssignment7Q4.getElements();
        OopjAssignment7Q4.reverseArray(arr, arr.length);
        // OopjAssignment7Q4.reverseArray2(arr);
    }
}
