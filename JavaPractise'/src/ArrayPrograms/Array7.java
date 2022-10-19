package ArrayPrograms;

public class Array7 {

	public static void main(String[] args) {
		// a Java program to find all pairs of elements in an integer array whose sum is equal to a given number
		
		int[] ar= {12, 13, 10, 15, 8, 40, -15};
		int sum=25;
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]+ar[j]==sum) {
					System.out.println(ar[i]+":"+ar[j]);
				}
			}
		}

	}

}
