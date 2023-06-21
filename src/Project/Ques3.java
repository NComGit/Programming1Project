package Project;

import java.util.Random;
import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i, j, row, col, removeNum;
		Random rand = new Random();
		System.out.println("Give me 2 integer");
		row = sc.nextInt();
		col = sc.nextInt();

		// initializing the array
		int[][] arr = new int[row][col];

		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				arr[i][j] = rand.nextInt(101); // 1-100 boundary
			}
		}
		System.out.println("Here are my array: ");

		// to print it

		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("Please enter the number you want to disappear:");
		removeNum = sc.nextInt();
		
		int[][] updatedArray = removeNumber(arr, removeNum, row, col); 

		System.out.println("Updated array:");

		// To print the updated array
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.printf("%4d", updatedArray[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] removeNumber(int[][] arr, int removeNum, int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == removeNum) {
					arr[i][j] = 0;
				}
			}
		}

		return arr;
	}
}
