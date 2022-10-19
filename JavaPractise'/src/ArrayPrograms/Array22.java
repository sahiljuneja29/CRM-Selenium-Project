package ArrayPrograms;

public class Array22 {

	public static void main(String[] args) {
		//Write a Java program to find the sum of even and odd numbers in an array
		
		int[] ar={11, 12, 13, 14, 15};
		int oddsum=0;
		int evensum=0;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				evensum+=ar[i];
			}
			
			else {
				oddsum+=ar[i];
			}
		}
		
		System.out.println("Oddsum:" +oddsum);
		System.out.println("Evensum:" +evensum);
	}

}

