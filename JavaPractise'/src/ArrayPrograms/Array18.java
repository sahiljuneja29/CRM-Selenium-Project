package ArrayPrograms;

import java.util.Arrays;

public class Array18 {

	public static void main(String[] args) {
		
		
		int[] ar1= {3,5,11,8,4};
		int[] ar2= {5,4,6,7,9,11};
		
		//find common elements between two array
		for(int i=0;i<ar1.length;i++) {
			for(int j=0;j<ar2.length;j++) {
				if(ar1[i]==ar2[j]) {
					System.out.println(ar1[i]);
				}
			}
		}
		
		//find second largest element in an array
		
		int[] ar3= {5,8,34,56,778,103,100,88};
		Arrays.sort(ar3);
		System.out.println(Arrays.toString(ar3));
		int index=ar3.length-1;
		while(ar3[index]==ar3[ar3.length-1]) {
			index--;
		}
		System.out.println("second largest element is:" + ar3[index]);

	}

}