/*
1)Write a program that takes a numerical grade as input and outputs the corresponding letter grade using if-else statements.
*/

import java.util.Scanner;

class OopjAssignment1Q1{
	
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Your Marks: ");
	int marks = sc.nextInt();

	System.out.println("Marks: " + marks);

	if(marks >= 80){
		System.out.println("Grade: A+");

		} else if(marks >= 70 && marks < 80){
				System.out.println("Grade: A");
	
		}else if(marks >=60 && marks < 70){
				System.out.println("Grade: B+");

		}else if(marks >=50 && marks < 60){
				System.out.println("Grade: B");

		}else if(marks >=36 && marks < 50){
				System.out.println("Grade: c");

		}else{
			System.out.println("Grade: Failed");
		}
	sc.close();
	
	}

}