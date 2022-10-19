package ArrayPrograms;

import java.util.ArrayList;

public class Array16 {

	public static void main(String[] args) {
		// a Java program to print all the LEADERS in the array
		//Note: An element is leader if it is greater than all the elements to its right side.
		
	    int nums[] = {49, 1, 3, 200, 2, 4, 70, 5,12,65,14,55,15,32,16,18,17,20,19};
	   
	    ArrayList<Integer> l1=new ArrayList<Integer>();
	    
	    for(int i=0;i<nums.length;i++) {
	    	 int leader=nums[i];
	    	 for(int j=i+1;j<nums.length;j++) {
	    		 if(leader>nums[j]) {
	    			 continue;
	    		 }
	    		 else {
	    			 leader=nums[j];
	    		 }
	    	 }
	    }
	    
	   
	}

}
