package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Array26 {

	public static void main(String[] args) {
		// Move all negative elements to end 
		
//		N=8
//			input	arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
//				Output :7  9  10  11  -5  -3  -4  -1
		
		int[] ar={-5, 7, -3, -4, 9, 10, -1, 11};
	
		
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l2=new ArrayList<Integer>();
		
		//l1.sort(Comparator.reverseOrder());
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>=0) {
				l1.add(ar[i]);
				
			}
			
			else {
				l2.add(ar[i]);
			}
			
			
		}
		l1.addAll(l2);
		System.out.println(l1);
		System.out.println(l2);
		
		Object[] ar2=l1.toArray();
		System.out.println(Arrays.toString(ar2));

	}

}