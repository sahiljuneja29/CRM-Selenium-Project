package ArrayPrograms;

import java.util.Arrays;

public class Array21 {

	public static void main(String[] args) {
		// WriteArray programs in Java to remove odd numbers from an array. 
		
		int[] ar={11, 12, 13, 14, 15};
		int[] ar2=null;
		int len=0;
		int j=0;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				len+=1;
			}
		}
		
		ar2=new int[len];
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				//len+=1;
				ar2[j]=ar[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(ar2));

	}

}