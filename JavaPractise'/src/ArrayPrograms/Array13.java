package ArrayPrograms;

public class Array13 {

	public static void main(String[] args) {
		// a Java program to compute the average value of an array of integers except the largest and smallest values


		int[] array1= {5, 7, 2, 4, 9};
			//{12,13,6,8,45,35,800,43,56,77};
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
		
		float sum=0.0f;
		float avg=0.0f;
		for(int j=0;j<array1.length;j++) {
			if(array1[j]!=smallest && array1[j]!=largest) {
				sum=sum+array1[j];
			
			}
		}
		avg=sum/(array1.length-2);
		
		System.out.println(avg);
	}
}

