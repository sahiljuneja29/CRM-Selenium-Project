package ArrayPrograms;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		// a Java program to check the equality of two arrays
		
		int[] ar1= {4,6,-7,8,2};
		int[] ar2= {4,6,-7,8,2};
		boolean flag=true;
		
		if(ar1.length==ar2.length) {
			for(int i=0;i<ar1.length;i++) {
				if(ar1[i]!=ar2[i]) {
					flag=false;
					break;
				}
			}
		}
		else {
			flag=false;
		}
		
		if(flag) {
			System.out.println("Both arrays are equal");
		}
		else {
			System.out.println("Both arrays are not equal");
		}
		
		//using arrays equals method
		System.out.println(Arrays.equals(ar1, ar2));
	}
	

}
