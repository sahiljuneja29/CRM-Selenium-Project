package ArrayPrograms;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		// java program to reverse an array of integer values
		
		int[] ar= {34,21,67,43,45,89,98};
		int temp;
		
		for(int i=0;i<ar.length/2;i++) {
			temp=ar[i];
			ar[i]=ar[ar.length-i-1];
			ar[ar.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(ar));
	}

}
