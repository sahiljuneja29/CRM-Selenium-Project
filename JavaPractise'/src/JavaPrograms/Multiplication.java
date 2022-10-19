package JavaPrograms;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		//a Java program that takes a number as input and prints its multiplication table upto 10
		
		try (Scanner scan = new Scanner(System.in)) {
			int num1=scan.nextInt();
			for(int i=1;i<=10;i++) {
				System.out.println(num1 * i);
			}
		}
	}

}
