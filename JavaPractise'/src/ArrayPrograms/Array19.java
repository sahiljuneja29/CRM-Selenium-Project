package ArrayPrograms;

import java.util.Arrays;

public class Array19 {

	public static void main(String[] args) {
		
		
		int[] arr= {3,5,6,7,8,9};
		
		System.out.println(Arrays.toString(arr));
		
	int index=3;
	for(int i=index;i<arr.length-1;i++) {
		arr[i]=arr[i+1];
	}
	System.out.println(Arrays.toString(arr));

   //insert element into array
	int[] arr2= new int[]{3,5,6,7,8};
	int index1=2;
	int value=12;
	
	for(int i=arr2.length-1;i>index1;i--) {
		arr2[i]=arr2[i-1];
	}
	arr2[index1]=value;
	System.out.println(Arrays.toString(arr2));

	}
		
}


