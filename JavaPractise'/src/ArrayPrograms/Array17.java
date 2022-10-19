package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Array17 {

	public static void main(String[] args) {
		
		
		//convert array to arrayList
		
		String[] Arr=new String[] {"Tokyo","Denver","Melbourne","LA"};
		
		ArrayList<String> ar1=new ArrayList<String>(Arrays.asList(Arr));
		
		System.out.println(ar1);
		
		//convert arrayList to an array
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(56);
		list.add(4);
		
		Integer[] ar=new Integer[list.size()];
		list.toArray(ar);
		
		for(Integer a:ar) {
			System.out.println(a);
		}

	}

}