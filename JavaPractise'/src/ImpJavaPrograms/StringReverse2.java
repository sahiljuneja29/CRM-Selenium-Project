package ImpJavaPrograms;

public class StringReverse2 {
	
	public static void main(String[] args) {
		
		//reverse a string using reverse function
		
		String a1="Sahil";
		StringBuilder s1=new StringBuilder();
		s1.append(a1);
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		
		
		//reverse a string without using reverse function
		String a2="SahaS";
		String reverse="";
		
		//convert string to char array
		char[] c=a2.toCharArray();
		System.out.println(c);
		for(int i=c.length-1;i>=0;i--) {
			reverse=reverse+c[i];
			System.out.print(c[i]);
		}
		if(reverse.equals(a2))
		{
			System.out.println("palindrome");
		}
		
		
	}

}