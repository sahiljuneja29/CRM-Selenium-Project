package JavaPrograms;

public class Program13 {

	public static void main(String[] args) {
		// Java program to compute the sum of the first 100 prime numbers
		int sum=0;
		for(int i=0;i<=100;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		
		System.out.println(sum);

	}

}