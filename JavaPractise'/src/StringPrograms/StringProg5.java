package StringPrograms;

public class StringProg5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a java program to count the total number of occurrences of a given character in a string without using any loop?
		
		String str="My name is Sahil Juneja";
		char c='a';
		
		int count=str.length()- str.replace("a","").length();
		System.out.println(count);

	}

}
