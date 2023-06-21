package Project;

import java.util.Scanner;

public class Ques1again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, sumNum;
		String magicNum; // the magic number

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 2-digit numbers:");
		num1 = sc.nextInt(); // to get 1st 2 digit
		num2 = sc.nextInt(); // to get 2nd 2 digit
		num3 = sc.nextInt(); // to get 3rd 2 digit
		sumNum = num1 + num2 + num3;

		if (sumNum % 3 == 0) {
			// criteria #3
			if (sumNum % 5 == 0) {
				magicNum = String.valueOf(num2) + String.valueOf(num1) + "1";
			} else {
				// criteria #1
				magicNum = String.valueOf(String.valueOf(num2).charAt(0)) + (num1 + num3);
			}
		} else {
			// criteria #2
			if (sumNum % 5 == 0) {
				magicNum = (num1 + num3) + String.valueOf(String.valueOf(num2).charAt(1));
			} else {
				// criteria #4
				magicNum = String.valueOf(num1) + String.valueOf(num2) + String.valueOf(num3);
			}
		}

		// Print the magic number
		System.out.println();
		System.out.println("Your magic number is " + magicNum);

		sc.close();

	}

}
