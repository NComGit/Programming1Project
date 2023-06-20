package Project;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int joker, quant, i;

		/*
		 * This section of code is just for testing the method. It will be replaced by
		 * the code from question 3.
		 */

		System.out.print("Please input the quantity of numbers in the array: ");
		quant = kb.nextInt();

		int array[] = new int[quant];

		System.out.printf("Please input %d numbers: ", quant);
		for (i = 0; i < quant; i++) {
			array[i] = kb.nextInt();
		}
		sortArray(array);
		System.out.println("Sorted array:");
		for (int d = 0; d < array.length; d++) {
			System.out.print(array[d] + " ");
		}
	}

	public static int[] sortArray(int array[]) {

		/*
		 * array[i] is compared against array[j], 
		 * if array[i] is greater than array[j],then the values are switched and array[j+1] 
		 * if array[i] is less than array[j] then array[j+1] 
		 * this is repeated until array[j] is equal to the length of the array then array[i+1} 
		 * Repeat until array[i] is equal to the length of the array
		 */
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int temp = 0;
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		// The organized array is returned
		return array;
	}

}
