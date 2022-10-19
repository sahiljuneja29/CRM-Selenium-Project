package ArrayPrograms;

public class Array23 {

	public static void main(String[] args) {
		// Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number
		
		int num=15;
		
		//int[] ar= {10,14,8,6,7,18,16,12,-6,13,30};
		int[] ar={ -40, -5, 1, 3, 6, 7, 8, 20 };
		
		for(int i=0;i<ar.length;i++) {
			int sum=0;
			for(int j=i+1;j<ar.length;j++) {
				
				sum=ar[i]+ar[j];
				
				if(sum==num) {
					System.out.println(ar[i] +" :" + ar[j]);
					
				}
				
			}
		}
	}

}

