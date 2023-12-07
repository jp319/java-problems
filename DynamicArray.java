package tutor;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] dynamic = new int[0], temporary;
		int size, number, length, decision, counter;
		
		do {
			System.out.println("How many numbers would you like to enter?");
			System.out.print("> ");
			size = scanner.nextInt();
			
			while (size > 0) {
				length = dynamic.length;
				temporary = new int[length];
				
				for (int index = 0; index < length; index++) {
					temporary[index] = dynamic[index];
				}
				
				dynamic = new int[size+length];
				
				for (int index = 0; index < length; index++) {
					dynamic[index] = temporary[index];
				}
				
				System.out.println("Please enter the numbers:");
				counter = length + 1;
				
				for (int i = 1; i <= size; i++, length++, counter++) {
					System.out.print(counter + ". ");
					number = scanner.nextInt();
					dynamic[length] = number;
				}
				
				size = 0;
			}
			
			System.out.println("Current numbers in the array: " + Arrays.toString(dynamic));
			System.out.println("Would you like to enter more numbers in the array? Yes[1] No[0]");
			System.out.print("> ");
			decision = scanner.nextInt();
			
		} while (decision != 0);
	}
}
