package tutor;

import java.util.Arrays;
import java.util.Random;

public class commonElements {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array_one, array_two, common_int;
		int size, common_int_size = 1;
		
		size = 8;
		array_one = new int[size];
		array_two = new int[size];
		common_int = new int[common_int_size];
		
		array_one[0] = 1;
		array_one[1] = 2;
		array_one[2] = 5;
		array_one[3] = 5;
		array_one[4] = 8;
		array_one[5] = 9;
		array_one[6] = 7;
		array_one[7] = 10;
		
		array_two[0] = 1;
		array_two[1] = 0;
		array_two[2] = 6;
		array_two[3] = 15;
		array_two[4] = 6;
		array_two[5] = 4;
		array_two[6] = 7;
		array_two[7] = 0;
		
//		for (int i = 0; i < size; i++) {
//			array_one[i] = random.nextInt(size);
//			array_two[i] = random.nextInt(size);
//		}
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (array_one[i] == array_two[j]) {
					int[] temp = common_int;
					common_int = new int[common_int_size];
					for (int k = 0; k < temp.length; k++) {
						common_int[k] = temp[k];
					}
					common_int[common_int_size - 1] = array_one[i];
					common_int_size++;
				}
			}
		}
		
		System.out.println("Array one: " + Arrays.toString(array_one));
		System.out.println("Array two: " + Arrays.toString(array_two));
		System.out.println("The following common integers were found: ");
		System.out.println(Arrays.toString(common_int));
	}
}
