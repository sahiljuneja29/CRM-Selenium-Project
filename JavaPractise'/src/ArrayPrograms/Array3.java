package ArrayPrograms;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		// Java program to sort a numeric array and a string array
		
		int[] ar= {34,12,7,102,9,15,-5,89,34,200,98,222,22,300};
		
		int temp;
		for(int i=0;i<ar.length-1;i++) {
			for(int j=0;j<ar.length-1;j++)
			{
				if(ar[j]>ar[j+1]) {
			
				temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
			}
			}
		}
		System.out.println(Arrays.toString(ar));

		String[] ar2= {"Sahil","Juneja","Janeja"};
		Arrays.sort(ar2);
		System.out.println(Arrays.toString(ar2));
	}

}
