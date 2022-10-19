package ImpJavaPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// remove duplicates from array of string
		String[] s1= {"Cricket","Hockey","Baseball","Badminton","Cricket","Hockey"};
		System.out.println(Arrays.toString(s1));
		
		//convert array to list and then add all
        // elements to LinkedHashSet. LinkedHashSet
        //will automatically remove all duplicate elements. 
        
		Set<String> set1=new LinkedHashSet<String>(Arrays.asList(s1));
		System.out.println(set1);
		
		//create array from the LinkedHashSet
		String[] newArray=set1.toArray(new String[set1.size()]);
		System.out.println(Arrays.toString(newArray));
		
		Set<String> s5=new LinkedHashSet<String>(Arrays.asList(s1));
		
		String[] ar5=s5.toArray(new String[s5.size()]);
	}

}