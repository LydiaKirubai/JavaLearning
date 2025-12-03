/**You are given an integer array nums of size n. Your task is to determine whether the array is sorted in non-decreasing order.
 * Return: true if the array is sorted
 * false otherwise 
 */
package dsaday2;
import java.util.Scanner;

public class CheckSortedOrNot {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int[] numbers;
	   numbers = new int[n];
	   
	   for(int i=0; i<n; i++) {
		   numbers[i] = sc.nextInt();
	   }
	   
	   boolean isSorted = true;
	   
	   for(int i=0; i<n-1; i++) {
	   if(numbers[i] >numbers[i+1]) {
		   isSorted = false;
		   break;
	    }
	   
	   }
	   System.out.println(isSorted);
       
	}

}
