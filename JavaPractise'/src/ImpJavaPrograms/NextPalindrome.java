package ImpJavaPrograms;

public class NextPalindrome {

	
	
	public static boolean Palindrome(int n) {
		int temp=0;
		int a=n;
		while(n!=0) {
			temp=(temp*10)+(n%10);
			n=n/10;
		}
		
		if(temp==a) {
			return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input=71;
		while(Palindrome(input)!=true) {
			input=input+1;
		}
		System.out.println(input +" is palindrome");
		
		
	}

}