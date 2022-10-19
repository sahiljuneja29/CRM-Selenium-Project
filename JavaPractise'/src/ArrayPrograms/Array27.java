package ArrayPrograms;

import java.util.Arrays;

public class Array27 {

	public static void main(String[] args) {
		// third largest number
		
		int[] ar= {34,1,0,45,121,677,5,6,89};

		int largest=0;
		int secondlar=0;
		int thirdlargest=0;
		
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]>largest) {
				thirdlargest=secondlar;
				secondlar=largest;
				largest=ar[i];
			}
			
			else if(ar[i]>secondlar) {
				thirdlargest=secondlar;
				secondlar=ar[i];
			}
			
			else if(ar[i]>thirdlargest) {
				thirdlargest=ar[i];
			}
		}
		System.out.println(largest);
		System.out.println(thirdlargest);
		
	}

}