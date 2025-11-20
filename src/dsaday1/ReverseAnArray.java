/**
 * Write a Java program to reverse a given integer array. 
 * Your program should take an array of integers as input and print the array in reverse order.
 * Input:
 * First line: an integer n, representing the size of the array.
 * Second line: n space-separated integers representing the elements of the array.
 * Output: Print the elements of the array in reverse order, separated by spaces.
 */
package dsaday1;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = n-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
			
		}
		sc.close();
	}

	
}
