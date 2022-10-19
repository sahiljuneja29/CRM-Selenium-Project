package ArrayPrograms;

public class Array12 {

	public static void main(String[] args) {
		// a Java program to get the difference between the largest and smallest values in an array of integers.
		//The length of the array must be 1 and above
		
		int[] array1= {12,13,6,8,45,35,800,43,56,77};
		int largest=array1[0];
		int smallest=array1[0];
		
		for(int i=0;i<array1.length;i++) {
			if(array1[i]>largest) {
				largest=array1[i];
			}
			else if(array1[i]<smallest) {
				smallest=array1[i];
			}
			
		}
		System.out.println(largest-smallest);
	}

}