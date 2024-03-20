
/*1. Write a program to print elements of Array ?  */

import java.util.Scanner;

public class OopjAssignment7Q1 {

   
    public static void printRecord(int[][] arr){

        for( int i = 0; i < arr.length; i++ ){
            for(int j = 0; j < arr.length; j++){
            System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        
        int[][] arr = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for( int i = 0; i < 3; i++ ){
            for( int j = 0; j < arr.length; j++ ){
            System.out.print("Enter Elements (" + i + ", " + j + ") :");
            arr[i][j] = sc.nextInt();
            }
        }
        
        OopjAssignment7Q1.printRecord(arr);

        sc.close();
    }
}
