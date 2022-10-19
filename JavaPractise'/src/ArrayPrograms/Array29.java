package ArrayPrograms;

public class Array29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {10, 130, 20, 30, 2, 200, 32, 31, 5, 500, 60};
		
		//find largest and smallest element in an array
		
		int largest=ar[0];
		int smallest=ar[0];
		
		for(int i=0;i<ar.length;i++) {
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