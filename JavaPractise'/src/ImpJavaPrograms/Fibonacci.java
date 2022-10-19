package ImpJavaPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		int a=0,b=0,c=1;
		
		for(int i=0;i<num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(a + " ");
			
			
			
		}

	}

}