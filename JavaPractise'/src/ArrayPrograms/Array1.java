package ArrayPrograms;

public class Array1 {

	public static void main(String[] args) {
		// Largest and Smallest element in an array
		
		int[] ar= {34,12,7,102,9,15,-5,89,34,200,98,22};
		int smallest=0;
		int largest=0;
		
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]>largest) {
				largest=ar[i];
				
			}
			
			else if(ar[i]<smallest){
				smallest=ar[i];
				
			}
		}
		
		System.out.println(largest);
		System.out.println(smallest);
	}

}

