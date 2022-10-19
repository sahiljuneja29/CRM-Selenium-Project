package ImpJavaPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Mix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reverse a string
		String str="SahaS";
		String st="";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
			st=st+str.charAt(i);
		}
		System.out.println();
		System.out.println("********************************");
		
		
		//palindrome of string
		if(st.equals(str)) {
			System.out.println("Palindrome");
		}
		System.out.println();
		
		
		String str2="I love India";
		String[] ar=str2.split(" ");
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]);
		}
		System.out.println();
		System.out.println("********************************");
	
	
	//reverse a integer
	int num=123454321;
	int temp=0;
	int num1=num;
	
	while(num!=0) {
		temp=(temp*10)+(num%10);
		num=num/10;
	}
	System.out.println(temp);
	
	if(num1==temp)
		System.out.println("Palindrome of a number");
	
	// remove duplicate chars from a string
	String str1="SahShlk";
	String[] ars=str1.split("");
	System.out.println(Arrays.toString(ars));
	
	int unique=ars.length;
	
	for(int i=0;i<unique;i++) {
		for(int j=i+1;j<unique;j++) {
			if(ars[i].equals(ars[j])){
				ars[j]=ars[unique-1];
				unique--;
				j--;
				System.out.println(ars[i]);
			}
	
		}
	}
	
	String[] ars2=Arrays.copyOf(ars, unique);
	System.out.println(Arrays.toString(ars2));

	
	//find occurence of character in a string
	
	String str4="I love my India India I";
	String[] ar4=str4.split(" ");
	
	Map<String,Integer> m1=new HashMap<String,Integer>();
	
	for(int i=0;i<ar4.length;i++)
	{
		if(m1.containsKey(ar4[i])) {
			int count=m1.get(ar4[i]);
			m1.put(ar4[i], count+1);
		}
		
		else {
			m1.put(ar4[i], 1);
		}
	
	}
	System.out.println(m1);
	
	
	//fibonacci
	
	int numm=12;
	int a=0,b=0,c=1;
	
	for(int i=0;i<numm;i++) {
		a=b;
		b=c;
		c=a+b;
		System.out.print(a + " ");
	}
	
	}	
}
