package JavaPrograms;

public class Program11 {

	public static String str="the quick brown fox jumps over the lazy dog";
	
	public static void main(String[] args) {
		// a Java program to capitalize the first letter of each word in a sentence

		String[] str1=str.split(" ");
		
		for(int i=0;i<str1.length;i++) {
			System.out.print(Character.toUpperCase(str1[i].charAt(0)) + str1[i].substring(1));
			System.out.print(" ");

		}
		System.out.println(" ");
		//a Java program to convert a given string into lowercase
		for(int i=0;i<str1.length;i++) {
			System.out.print(Character.toLowerCase(str1[i].charAt(0)) + str1[i].substring(1));
			System.out.print(" ");

		}
	}

}