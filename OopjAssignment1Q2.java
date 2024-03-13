/*
2)Write a program that checks if a given year is a leap year or not using both if-else and switch-case.
*/

import java.util.Scanner;

class OopjAssignment1Q2{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Year: ");	
	int year = sc.nextInt();
	
	System.out.print("Year: " + year);
	System.out.println();

	/*
	if (year % 4 == 0) {
		
		System.out.println(year + " is a Leap Year");
	} else {
		
		System.out.println(year + " is Not a Leap Year");
	}
	/*

	/*
	switch(year % 4){
	
		case 0:
			System.out.println(year + " is a Leap Year");
			break;
		
		default:
			System.out.println(year + " is Not a Leap Year");
			break;
	
	}
	/*
	
	sc.close();
	}


}