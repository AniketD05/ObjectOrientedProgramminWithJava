/*
3)Implement a simple calculator program that takes two numbers and an operator (+, -, *, /) as input and performs the operation using switch-case.
*/

import java.util.Scanner;

class OopjAssignment1Q3 {

	public static double calculation(char opt, int num1, int num2) {

		double result = 0;

		switch (opt) {

			case '+':
				result = num1 + num2;

				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;

				break;
			case '/':
				result = num1 / num2;

				break;
			default:
				System.out.println("Invalid Input");
				break;
		}
		return result;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number1 :");
		int num1 = sc.nextInt();

		System.out.println("Enter Number2 :");
		int num2 = sc.nextInt();

		System.out.println("Enter Operator(+, -, *, /) :");
		char opt = sc.next().charAt(0);

		double result = calculation(opt, num1, num2);
		System.out.println("Result: " + num1 + " " + opt + " " + num2 + " = " + result);

		sc.close();
	}

}