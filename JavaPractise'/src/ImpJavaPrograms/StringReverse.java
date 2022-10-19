package ImpJavaPrograms;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Automation";
		
		StringBuilder s1=new StringBuilder();
		String s2;
		s1.append(str);
		s1=s1.reverse();
		
		System.out.println(s1);
		
		// without using reverse function
		
		String a1="Sahil Juneja";
		
		for(int i=0;i<a1.length();i++) {
			System.out.print(a1.charAt(a1.length()-1-i));
		}

	}

}