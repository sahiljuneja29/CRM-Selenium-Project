package ImpJavaPrograms;

public class Mix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prime number
		int num=7;
		boolean flag=false;
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=true;
			}
		}
		
		if(!flag) {
			System.out.println("prime");
		}
		else
		{
			System.out.println("notprime");
		}
		
		//fibonacci series
		int num1=12;
		int a=0,b=0,c=1;
		
		for(int j=0;j<num1;j++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(a + " ");
		}
		
		// reverse a integer and check if it is palindrome
		int num3=12321;
		int num4=num3;
		int temp=0;
		
		while(num3!=0) {
			temp=(temp*10)+(num3%10);
			num3=num3/10;
		}
		System.err.println();
		System.out.println(temp);
		
		if(num4==temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
