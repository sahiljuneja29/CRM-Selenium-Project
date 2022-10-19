package ImpJavaPrograms;

public class Prime100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<100;i++) {
			if(isPrime(i)) {
				System.out.print(" "+i);
			}
		}
		
		
		
	}
	public static Boolean isPrime(int num) {
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}

}

