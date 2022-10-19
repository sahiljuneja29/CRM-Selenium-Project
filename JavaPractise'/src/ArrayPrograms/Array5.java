package ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class Array5 {

	public static void main(String[] args) {
		// Java program to remove duplicate elements in an array
		
		int[] ar= {34,1,3,6,8,1,5,6,8,60};
		List<Integer> l1=new ArrayList<Integer>();
		
		for(int i=0;i<ar.length;i++) {
			if(!l1.contains(ar[i]))
			{
				l1.add(ar[i]);
			}

	}
		System.out.println(l1);
		
		// Java program to find duplicate elements in an array
		List<Integer> l2=new ArrayList<Integer>();
		List<Integer> l3=new ArrayList<Integer>();
		
		System.out.println("Duplicate elements are");
		for(int j=0;j<ar.length;j++) {
			if(l2.contains(ar[j])) {
				System.out.println(ar[j]);
				//l3.add(ar[j]);
			}
			else {
				l2.add(ar[j]);			}
		}
		//System.out.println(l3);
		}
	}