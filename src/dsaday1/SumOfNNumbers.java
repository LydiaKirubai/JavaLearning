/**
 * Problem Statement:
 * Write a Java program that:
 * Reads an integer n from the user — the number of elements.
 * Reads n integers from the user.
 * Prints the sum of all the n integers.
 */
package dsaday1;
import java.util.Scanner;
public class SumOfNNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt(); // Read number of elements
        int sum = 0;
        
        for(int i=0; i<n; i++) {
        	sum = sum + sc.nextInt(); // Read each number
        }
        System.out.println(sum);
        sc.close();
	}

}
