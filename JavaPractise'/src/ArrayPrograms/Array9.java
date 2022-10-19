package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		// Java program to convert an array to ArrayList.
		
		Integer[] array1= new Integer[] {4,6,8,4,3,2,8};
		ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(array1));
		System.out.println(list1);
		
		String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
		ArrayList<String>  list = new ArrayList<String>(Arrays.asList(my_array));
		System.out.println(list);
		
		
		//a Java program to convert an ArrayList to an array.
		ArrayList<String> str1=new ArrayList<String>();
		str1.add("PHP");
		str1.add("Python");
		str1.add("Java");
		str1.add("C++");
		
		String[] myArray=new String[str1.size()];
		str1.toArray(myArray);
		System.out.println(Arrays.toString(myArray));
		
				
		

	}
}