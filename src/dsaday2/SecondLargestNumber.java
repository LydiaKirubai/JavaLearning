/**
 * Problem Statement:
 * Given an integer array of size n, find the second largest number in the array.
 * Input Format:
 * First line: an integer n (size of the array)
 * Second line: n space-separated integers
 * Output Format: Print the second largest element in the array.
 */
//package dsaday2;

import java.util.Scanner;
public class SecondLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers;
		numbers = new int[n];
		
		for(int i=0; i<n; i++) {
			numbers[i] = sc.nextInt();			
		}
			
			int biggest_num = Integer.MIN_VALUE;
			int second_biggest = Integer.MIN_VALUE;
			
			for(int num:numbers) {
			if(num > biggest_num) {
				second_biggest = biggest_num;
				biggest_num = num;
				
		 }else if(num > second_biggest && num < biggest_num) {
			 second_biggest =  num;
		 }
			
		}
			if(second_biggest == Integer.MIN_VALUE) {
				System.out.println("No second largest element");
			}else {
		System.out.println(second_biggest);	
			}
	}

}
