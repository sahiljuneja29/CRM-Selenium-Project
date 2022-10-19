package StringPrograms;

public class StringProg2 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//String methods
			
			String a1=" My name is sahil";
			//System.out.println(a1.le);
			
			for(int i=a1.length()-1;i>-1;i--) {
				System.out.println(a1.charAt(i));
			}
			
			
			System.out.println(a1);
			String a2=" My name is SAHIL";
			System.out.println(a2);
			System.out.println(a1.trim());  //It removes beginning and ending spaces of this string.
			System.out.println(a1.charAt(2));  //It returns char value for the particular index
			System.out.println(a1.compareTo("hello"));  
			System.out.println(a1.concat("Juneja"));   //It concatenates the specified string.
			System.out.println(a1.indexOf("M"));   //It returns the specified substring index.
			System.out.println(a1.contains("rock"));   // It returns true or false after matching the sequence of char value.
			System.out.println(a1.endsWith("sahil"));
			System.out.println(a1.isEmpty());
			System.out.println(a1.isBlank());
			System.out.println(a2.isEmpty());  //It checks if string is empty.
			System.out.println(a2.isBlank());
			System.out.println(a1.startsWith(" "));
			System.out.println(a1.length());     //It returns string length
			System.out.println(a1.strip());
			System.out.println(a1.toUpperCase());
			System.out.println(a1.toLowerCase());   //It returns a string in lowercase.
			System.out.println(a1.substring(3, 16));  //It returns substring for given begin index and end index.
			System.out.println(a1.substring(3));   //It returns substring for given begin index.
			System.out.println(a1.replace("sahil","mohit")); //It replaces all occurrences of the specified char value.	
			
			System.out.println(a1.equals(a2));  //It checks the equality of string with the given object.
			System.out.println(a1.compareTo(a2)); // returns zero if the strings are equal
			System.out.println("ignore case "+a1.equalsIgnoreCase(a2));
			
			char[] ca=a2.toCharArray();   // it returns the character array
			
			for(char a: ca) {
				System.out.println(a);
			}
			System.out.println(a2.toCharArray());
			String a3="this,is,my,school";
			String[] words=a3.split(",");   //It returns a split array of string matching regex.
			
			for(String w:words) {
				System.out.println(w);
			}
		
		}



}
