package Project;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		int quant, i;

		// Establishing quantity of numbers that will be in the array
		System.out.print("Please input the quantity of distinct numbers that will be in the array: ");
		quant = kb.nextInt();

		int array[] = new int[quant];

		// Establishing numbers that will be in the array
		System.out.printf("Please input %d numbers: ", quant);
		for (i = 0; i < quant; i++) {
			array[i] = kb.nextInt();
		}
		int missing = missingNum(array);
		System.out.print(missing);
		kb.close();

	}

	public static int missingNum(int[] nums) {
		int i, realSum = 0, maxSum = 0;
		int length = nums.length;

		// Calculating sum of user input numbers
		for (i = 0; i < length; i++) {
			realSum += nums[i];
		}
		// Calculating sum of numbers between 0 and array length
		for (i = 0; i <= length; i++) {
			maxSum += (length - i);
		}
		// Subtracting sum of input numbers from sum of total array length
		return (maxSum - realSum);
	}
}
