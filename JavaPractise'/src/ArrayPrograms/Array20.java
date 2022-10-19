package ArrayPrograms;

import java.util.Arrays;

public class Array20 {

	public static void main(String[] args) {
		// Find the cumulative sum of an array in Java:
		
		/*Array = {9, 8, 7, 0, -2, 5}
		Cumulative sum = [9, 17, 24, 24, 22, 27]*/
		
		int[] ar={9, 8, 7, 0, -2, 5};
		int sum=0;
		
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
			ar[i]=sum;
		}
		
		System.out.println(Arrays.toString(ar));

	}

}
