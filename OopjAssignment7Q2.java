
/*2) Write a Java program to check the equality of two arrays? */

import java.util.Scanner;

public class OopjAssignment7Q2 {

    private static Scanner sc = new Scanner(System.in);

    public static void setElements(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Enter Elements " + "( " + i + ", " + j + " ) : ");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void getElements(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static boolean compareArray(int[][] arr1, int[][] arr2) {

        if (arr1.length == arr2.length) {

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {

                    if (arr1[i][j] != arr2[i][j]) {
                        return false;
                    }
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {

        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];
        System.out.println("Enter Elements of Array 1 ----->");
        OopjAssignment7Q2.setElements(arr1);

        System.out.println("Enter Elements of Array 2 ----->");
        OopjAssignment7Q2.setElements(arr2);

        System.out.println("\n-----Array 1-----");
        OopjAssignment7Q2.getElements(arr1);

        System.out.println("\n-----Array 2-----");
        OopjAssignment7Q2.getElements(arr2);

        OopjAssignment7Q2.compareArray(arr1, arr2);

        if (compareArray(arr1, arr2)) {
            System.out.println("Arrays EQUAL!!");
        } else {
            System.out.println("Arrays NOT EQUAL!!");
        }

    }
}
