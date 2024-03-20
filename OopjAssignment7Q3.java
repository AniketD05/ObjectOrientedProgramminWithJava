
/*3) Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number? */

import java.util.Scanner;

public class OopjAssignment7Q3 {

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

    public static int[][] sumOfArrays(int[][] arr1, int[][] arr2) {
      
        int[][] sum = new int[arr1.length][arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sum;
    }

    public static void displaySumOfArrays(int[][] sum) {

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
            System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];
        System.out.println("Enter Elements of Array 1 ----->");
        OopjAssignment7Q3.setElements(arr1);

        System.out.println("Enter Elements of Array 2 ----->");
        OopjAssignment7Q3.setElements(arr2);

        System.out.println("\n-----Array 1-----");
        OopjAssignment7Q3.getElements(arr1);

        System.out.println("\n-----Array 2-----");
        OopjAssignment7Q3.getElements(arr2);
        
        int sum[][] = OopjAssignment7Q3.sumOfArrays(arr1, arr2);

        System.out.println("\n-----Sum Of Array-----");
        OopjAssignment7Q3.displaySumOfArrays(sum);

    }
}
