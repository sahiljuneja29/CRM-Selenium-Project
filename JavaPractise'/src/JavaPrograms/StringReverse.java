package JavaPrograms;

public class StringReverse {
	
	public static String str="Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
	static int letter=0;
	static int space=0;
	static int number=0;
	static int other=0;

	public static void main(String[] args) {
		// Java program to reverse a string
		
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(str.charAt(i));
		}
		
		 //Java program to count the letters, spaces, numbers and other characters of an input string.
		
		for(int i=0;i<str.length();i++) {
			
			if(Character.isAlphabetic(str.charAt(i))){
				letter+=1;
			}
			else if(Character.isDigit(str.charAt(i))){
				number+=1;
			}
			else if(str.charAt(i)==' '){
				space+=1;
			}
			else {
				other+=1;
			}
		}
		System.out.println("\nLetter:"+ letter);
		System.out.println("Number:"+ number);
		System.out.println("Space:"+ space);
		System.out.println("Other:"+ other);

	}

}