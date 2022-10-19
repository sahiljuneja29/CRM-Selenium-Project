package ArrayPrograms;

import java.util.Arrays;

public class Array24 {

	public static void main(String[] args) {
		// Consecutive arrays

//		
//		Input: N = 6, arr[] = {2, 1, 0, -3, -1, -2}
//		Output: Yes
		
		int[] ar={2, 1, 0, -3, -1, -2,3};
		
		
		for(int i=0;i<ar.length;i++) {
			int temp=0;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					temp=ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
				
			}
		
		
		}
		System.out.println(Arrays.toString(ar));
		boolean flag=true;
		for(int k=0;k<ar.length-1;k++) {
			if(ar[k+1]!=ar[k]+1) {
				flag=false;
				break;
			}
		}
		System.out.println(flag);
		
	}

}