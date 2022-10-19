package ArrayPrograms;

import java.util.Arrays;

public class Array14 {

	public static void main(String[] args) {
		
		/*a Java program to find the length of the longest consecutive
		elements sequence from a given unsorted array of integers.*/
		
		int[] array1= {49, 1, 3, 200, 2, 4, 70, 5,12,65,14,55,15,32,16,18,17,20,19,6,8,7};
		
		Arrays.sort(array1);
		
		System.out.println(Arrays.toString(array1));
		
		
		//[1, 2, 3, 4, 5, 12, 14, 15, 16, 17, 18, 19, 20, 32, 49, 55, 65, 70, 200]
		
		int longestseq=1;
		for(int i=0;i<array1.length-1;i++)
		{
			int len=1;
			for(int j=i+1;j<array1.length;j++) {
			
				if(array1[j]-1==array1[j-1]) {
					len+=1;
				}
				else {
					break;		
			}
				longestseq=Math.max(longestseq, len);
			}
			
		}
		System.out.println(longestseq);
		
	}

}

