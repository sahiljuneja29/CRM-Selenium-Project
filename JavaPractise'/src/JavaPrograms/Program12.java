package JavaPrograms;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		/*Java program that accepts two integer values between 25 to 75 and
		 *return true if there is a 
		 *common digit in both numbers
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Input First number:");
		int num1=scan.nextInt();
		System.out.println("Input Second number:");
		int num2=scan.nextInt();
		
		System.out.println("Result: "+ common_Digit(num1,num2));

	}

	private static boolean common_Digit(int p, int q) {
		if(p<25 || q>75)
			return false;
		int x=p%10;
		int y=q%10;
		p=p/10;
		q=q/10;
		
		System.out.println(x +":"+y+":"+ p+":"+q);
		
		
		return (p == q || p == y || x == q || x == y);
	}
}