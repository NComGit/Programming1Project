package Project;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		int joker, quant, i;

		// Establishing joker
		System.out.print("Please input a number, that will henceforth be known as joker: ");
		joker = kb.nextInt();

		// Establishing quantity of numbers that will be compared against joker
		System.out.print("Please input the quantity of numbers: ");
		quant = kb.nextInt();

		int array[] = new int[quant];

		// Establishing numbers that will be compared against joker
		System.out.printf("Please input %d numbers: ", quant);
		for (i = 0; i < quant; i++) {
			array[i] = kb.nextInt();
		}

		// If number in array[i] is less than joker then print "0"
		// if not, then subtract joker from array[i];
		// Repeat until array[i] is less than joker
		for (i = 0; i < quant; i++) {
			if (array[i] < joker) {
				array[i] = 0;
			}
			while (array[i] >= joker) {
				array[i] -= joker;
			}
			System.out.print(array[i] + " ");
		}
		
		kb.close();
	}
}
