package ArrayPrograms;

public class Array2 {

	public static void main(String[] args) {
	// Largest and secondLargest element in an array
		
		int[] ar= {34,12,7,102,9,15,-5,89,34,200,98,222,22,300};
		int largest=0;
		int secondlargest=0;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>largest) {
				secondlargest=largest;
				largest=ar[i];
			}
			
			else if(ar[i]>secondlargest) {
				secondlargest=ar[i];
			}
		}
		System.out.println("Largest: "+largest);
		System.out.println("SecondLargest: "+secondlargest);

	}

}
