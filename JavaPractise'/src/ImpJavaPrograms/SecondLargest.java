package ImpJavaPrograms;

public class SecondLargest {

	public static void main(String[] args) {
		//second largest element in an array without sorting
		
		int[] ar= {45,12,34,78,90,15,82};
		
		int largest=0;
		int secondLargest=0;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>largest) {
				secondLargest=largest;
				largest=ar[i];
				
			}
			else if(ar[i]>secondLargest) {
				secondLargest=ar[i];
			}
			
			
		}
		System.out.println(secondLargest);

	}

}