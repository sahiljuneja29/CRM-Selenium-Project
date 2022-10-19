package StringPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringProg6 {
	
public static void main(String[] args) throws FileNotFoundException {
		
		
		//read string from file
		String filepath="C:\\Users\\sahil.juneja01\\Desktop\\String.txt";
		
		File file=new File(filepath);
		
		
		Scanner s=new Scanner(file);
		//to read the line by line user hasNextLine method
		while(s.hasNextLine()) {
			String line=s.next();
			if(line.contains("at")) {
				System.out.println("Value is present");
				
				//break;
			}
		}
		
		

	}

}
