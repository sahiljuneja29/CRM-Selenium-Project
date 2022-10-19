package ArrayPrograms;

import java.util.Arrays;

public class Array28 {

	public static void main(String[] args) {
		// Move all zeros to the beginning/end of an array 
		
		int[] ar= {34,1,0,45,0,12,67,0,5,6,0,89};
		int num;
		int j=0;
		for (int i=0;i<ar.length;i++) {
			
			if(ar[i]==0) {
				num=ar[i];
				ar[i]=ar[j];
				ar[j]=num;
				j++;
			}
		}
		
		System.out.println(Arrays.toString(ar));

	}

}