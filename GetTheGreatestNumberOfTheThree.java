package tutor;

import java.util.Scanner;

public class GetTheGreatestNumberOfTheThree {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// Declare Variables
		int first, second, third, result;
		// Initialize Variables
		result = 0;

		System.out.print("Please input the first number: ");
		first = scanner.nextInt();
		System.out.print("Please input the second number: ");
		second = scanner.nextInt();
		System.out.print("Please input the third number: ");
		third = scanner.nextInt();

		if (first > second && first > third) {
			result = first;
		} else if (second > first && second > third) {
			result = second;
		} else if (third > first && third > second) {
			result = third;
		}

		System.out.println("The greatest number of them is " + result);
	}
}
