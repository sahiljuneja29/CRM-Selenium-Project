package ImpJavaPrograms;

public class CountInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Count number, alphabet and special characters
		
		String word="S5ah123$il*";
		
		int count=0;
		int countalphabet=0;
		int specialchar=0;
		
		for(int i=0;i<word.length();i++) {
			
			if(Character.isDigit(word.charAt(i))) {
				count+=1;
			}
			
			else if(Character.isAlphabetic(word.charAt(i))){
				countalphabet+=1;
			}
			
			else {
				specialchar+=1;
			}
			}
		System.out.println(word.length());
		System.out.println(count);
		System.out.println(countalphabet);
		System.out.println(specialchar);
	}

}
