package ArrayPrograms;

import java.util.Arrays;

public class Array15 {

	public static void main(String[] args) {
		 /*a Java program to find the length of the longest consecutive
		elements sequence from a given unsorted array of integers.*/
	
		    
		        int nums[] = {49, 1, 3, 200, 2, 4, 70, 5,12,65,14,55,15,32,16,18,17,20,19};
		        System.out.println("Original array length: "+nums.length);
		        System.out.print("Array elements are: ");
		        for (int i = 0; i < nums.length; i++)
		        {
		            System.out.print(nums[i]+" ");
		        }
		        //System.out.println(Arrays.sort(nums));
		        System.out.println("\nThe new length of the array is: "+ longestSeq(nums));

		    }

		    public static int longestSeq(int[] nums) {
		        Arrays.sort(nums);
		        int longestSequence = 1;
		        for (int j = 0; j < nums.length-1; j++){
		            int len = 1;
		            for (int i = j+1; i < nums.length; i++) {
		                if (nums[i] - nums[i - 1] == 1)
		                    len++;
		                else
		                    break;
		            }
		            
		            longestSequence = Math.max(longestSequence, len);
		            System.out.println(len);
		        }
		       
		        return longestSequence;
		    
		

	}

}


