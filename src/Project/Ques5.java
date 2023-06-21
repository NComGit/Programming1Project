package Project;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input length of array");
		int length = sc.nextInt();
		
		//create new array of length based on user input
		int nums [] = new int[length];
		
		//loop through new array and prompt user to input value based of length of array
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("Enter num #%d %n",i+1);
			nums[i] = sc.nextInt();
		}
		sc.close();
		
		//calling method to find the majority number
		int majority = findMajority(nums);
		System.out.print("Input: nums = ");
		for (int val : nums) {
			System.out.print(val + ", ");
		};
		System.out.println();
		System.out.println("Output: " + majority);
	}
	
	public static int findMajority(int[] nums) {
		//used to record the majority number
		int majority = 0;
		//keep track of the max count occurrence of the majority number
		int max = 0;
		
		//loop through each value of the nums array
		for (int i = 0; i<nums.length; i++) {
			//reset count and currentNum at the beginning of each loop
			int count = 0;
			int currentNum = nums[i];
			for (int j = i+1; j < nums.length; j++) {
				//check inside inner loop if current value is equal to the outer loop current value
				//if it equals, increment the count
				if (nums[j] == currentNum) {
					count++;
				}
			}
			//if the current iteration is greater than the max, update the max
			//set the majority to be the currentNum
			if (count > max) {
				max = count;
				majority = currentNum;
			}
			
		}
		return majority;
	}
}
