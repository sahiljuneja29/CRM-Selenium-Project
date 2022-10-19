package JavaPrograms;

import java.io.Console;

public class Program6 {

	public static void main(String[] args) {
		// Java program to print the ascii value of a given character
		
		int chr = 'Z';
		System.out.println("The ASCII value of Z is :"+chr);

		
		//Java program to input and display your password.
		
		Console cons;
		if ((cons = System.console()) != null) {
			char[] pass_ward = null;
			try {
				pass_ward = cons.readPassword("Input your Password:");
				System.out.println("Your password was: " + new String(pass_ward));
			} finally {
				if (pass_ward != null) {
					java.util.Arrays.fill(pass_ward, ' ');
				}
			}
		} else {
			throw new RuntimeException("Can't get password...No console");
		}
		
	}

}