package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Array11 {

	public static void main(String[] args) {
		// a Java program to move all 0's to the end of an array. 
		//Maintain the relative order of the other (non-zero) array elements.

		
		int[] array1= {2,6,4,8,5,0,3,12,0,43,0,25,0,88,56,0,76};
		
		ArrayList<Integer> l1=new ArrayList<>();
		ArrayList<Integer> l2=new ArrayList<>();
		
		for(int i=0;i<array1.length-1;i++) {
			if(array1[i]==0) {
				l1.add(array1[i]);
				array1[i]=array1[i+1];
				
			}
			else {
				l2.add(array1[i]);
			}
		}
		
		l2.addAll(l1);
		System.out.println(l2);
	}

}