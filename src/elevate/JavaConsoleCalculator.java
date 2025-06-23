package elevate;

import java.util.Scanner;

public class JavaConsoleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println();
			System.out.println("Enter the first number : ");
			int a = sc.nextInt();
			System.out.println("Enter the second number : ");
			int b = sc.nextInt();
			System.out.println("Please enter your choice :");
			System.out.println("1 - Addition");
			System.out.println("2 - Subtraction");
			System.out.println("3 - Multiplication");
			System.out.println("4 - Division");
			System.out.println("0 - Exit");
			System.out.println();
			
			int choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.exit(0);
			case 1:
				addition(a,b);
				break;
			case 2:
				subtraction(a,b);
				break;
			case 3:
				multiplication(a,b);
				break;
			case 4:
				division(a,b);
				break;
			default:
				System.out.println("Wrong choice, please try again!!");
			}
		}
	}

	static void addition(int a, int b) {
		System.out.println("Addition: "+(a+b));
	}

	static void subtraction(int a, int b) {
		System.out.println("Subtraction: "+(a-b));
	}

	static void multiplication(int a, int b) {
		System.out.println("Multiplication: "+(a*b));
	}

	static void division(int a, int b) {
		System.out.println("Division: "+(a/b));
	}
}