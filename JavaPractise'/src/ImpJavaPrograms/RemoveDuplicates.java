package ImpJavaPrograms;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// remove duplicates from array
		int[] ar1=new int[]{3,5,7,2,7,8,3};
		
		int unique=ar1.length;
		
		for(int i=0;i<unique;i++) {
			for(int j=i+1;j<unique;j++) {
				if(ar1[i]==ar1[j]) {
					
					ar1[j]=ar1[unique-1];
					unique--;
					j--;
					//System.out.println(ar1[i]);
				}
			}
		}
		
	int[] ar2=Arrays.copyOf(ar1, unique);
	System.out.println(Arrays.toString(ar2));
	
	
	
	// remove duplicates from string
	
	String str="SahilSi";
	System.out.println(str);
	
	String[] str1=str.split("");
	System.out.println(Arrays.toString(str1));
	int strlen=str1.length;
	
	
	for(int k=0;k<strlen;k++) {
		for(int l=k+1;l<strlen;l++) {
			if(str1[k].equals(str1[l])) {
				str1[l]=str1[strlen-1];
				strlen--;
				l--;
							
			}
		}
	}
	
	
	String[] str2=Arrays.copyOf(str1, strlen);
	System.out.println(Arrays.toString(str2));
	
	String s2="";
	for(String s:str2) {
		s2+=s;
	}
	System.out.println(s2);
	}

}
