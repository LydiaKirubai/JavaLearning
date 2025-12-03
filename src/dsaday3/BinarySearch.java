package dsaday3;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int num[] = {10, 20, 30, 40, 50};
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		
		int lower_bound = 0;
		int upper_bound = num.length-1;
		
		while(lower_bound<=upper_bound) {
		int mid_value = (lower_bound + upper_bound)/2;
		if(num[mid_value]==target) {
			System.out.println("Target found.");
		}else if(mid_value < upper_bound) {
			mid_value = mid_value+1;
		}else if(mid_value > lower_bound) {
			mid_value = mid_value-1;
		}
		}
		sc.close();

	}

}
