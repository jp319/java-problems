package tutor;

import java.util.Scanner;

public class PrimeFactorsExercise {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int decision;
		do {
			System.out.println("\n\n");
			System.out.println("-----------------");
			System.out.println("Hello there, what solution would you like to use?");
			System.out.println("-----------------");
			System.out.println("-- String  [1] --");
			System.out.println("-- Array   [2] --");
			System.out.println("-- Methods [3] --");
			System.out.println("-- Exit    [0] --");
			System.out.println("-----------------");
			System.out.print  ("> ");
			decision = scanner.nextInt();
			System.out.println("\n\n");
			if (decision == 1) {
				System.out.println("-- Now using the string solution --");
				PrimeFactorsStringSolution();
			} else if (decision == 2) {
				System.out.println("-- Now using the array solution --");
				PrimeFactorsArraySolution();
			} else if (decision == 3) {
				System.out.println("-- Now using the method solution --");
				PrimeFactorsMethodSolution();
			}
		} while (decision != 0);
		System.out.println("Make sure to know how this code works... Good Luck");
	}
	
	public static void PrimeFactorsStringSolution() {
		int given, number;
		int divisor;
		int decision;
		String factors;
		
		do {
			System.out.print("Enter a number: ");
			
			given = number = scanner.nextInt();
			divisor = 2;
			factors = "";
			
			while (number > 1) { //4, 0
				while (number % divisor == 0) { // 4%2=0; 2%2=0; 0%2=false
					factors += divisor; // 2, 2
					factors = (number % divisor == 0 && number/divisor != 1) ? factors + ", " : factors;
					number /= divisor; // 4/2 = 2; 2/2=0
				}
				divisor++;
			}
			
			System.out.print("Prime factors for " + given + " are:");
			System.out.println(" " + factors);
			
			System.out.println("Continue? Yes[1] No[0]");
			System.out.print("> ");
			
			decision = scanner.nextInt();
			
		} while (decision != 0);
	}
	
	public static void PrimeFactorsArraySolution() {
		int given, number;
		int divisor;
		int decision;
		int index, size;
		int[] factors, temp;
		
		do {
			System.out.print("Enter a number: ");
			
			given = number = scanner.nextInt();
			divisor = 2;
			index = size = 0;
			factors = new int[size];
			
			while (number > 1) {
				while (number % divisor == 0) {
					size++;
					temp = factors;
					factors = new int[size];
					
					for (int i = 0; i < temp.length; i++) {
						factors[i] = temp[i];
					}
					
					factors[index] = divisor;
					number /= divisor;
					index++;
				}
				divisor++;
			}
			
			System.out.print("Prime factors for " + given + " are:");
			System.out.print(" ");
			
			for (int i = 0; i < factors.length; i++) {
				System.out.print(factors[i]);
				if (i+1 != factors.length) {
					System.out.print(", ");
				}
			}
			
			size = 0;
			index = 0;
			factors = new int[size];
			
			System.out.println("\nContinue? Yes[1] No[0]");
			System.out.print("> ");
			
			decision = scanner.nextInt();
			
		} while (decision != 0);
	}
	
	public static void PrimeFactorsMethodSolution() {
		int number;
		int decision;
		int[] factors;
		
		do {
			System.out.print("Enter a number: ");
			
			number = scanner.nextInt();
			factors = clearArray();
			
			factors = getPrimeFactors(factors, number);
			
			System.out.print("Prime factors for " + number + " are:");
			System.out.print(" " + arrayToString(factors));
			
			System.out.println("\nContinue? Yes[1] No[0]");
			System.out.print("> ");
			
			decision = scanner.nextInt();
			
		} while (decision != 0);
	}
	
	public static int[] getPrimeFactors(int[] factors, int given) {
		int size = 0, index = 0, divisor = 2;
		
		while (given > 1) {
			while (given % divisor == 0) {
				size++;
				factors = increaseArray(factors, size - factors.length);
				
				factors[index] = divisor;
				given /= divisor;
				index++;
			}
			divisor++;
		}
		
		return factors;
	}
	
	public static int[] increaseArray(int[] array, int increaseBy) {
		int[] temp = array;
		array = new int[array.length + increaseBy];
		
		for (int i = 0; i < temp.length; i++) {
			array[i] = temp[i];
		}
		
		return array;
	}
	
	public static String arrayToString(int[] array) {
		String string = "";
		for (int i = 0; i < array.length; i++) {
			string += array[i];
			if (i+1 != array.length) {
				string += ", ";
			}
		}
		return string;
	}
	
	public static int[] clearArray() {
		return new int[0];
	}
}
