package learningday4;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int nums[] = {10, 20, 30, 40, 50};
		int n = nums.length;
		int i= 0;
		while(i<n-1) {
			int temp = nums[i];
			nums[i] = nums[n-1];
			nums[n-1] = temp;
			i++;
			n--;
		}
		System.out.println(Arrays.toString(nums));

	}
	

}
