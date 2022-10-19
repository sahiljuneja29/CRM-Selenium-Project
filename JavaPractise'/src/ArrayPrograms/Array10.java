package ArrayPrograms;

public class Array10 {

	public static void main(String[] args) {
		// Java program to find common elements from three sorted (in non-decreasing order) arrays. 
		
		int[] array1= {3,5,7,8,10,34,56};
		int[] array2= {7,10,12,34,89,100,101};
		int[] array3= {1,2,7,8,10,22,34};
		
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				for(int k=0;k<array3.length;k++) {
					if(array2[j]==array3[k] && array1[i]==array2[j] && array1[i]==array3[k] ) {
						System.out.println(array1[i]);
					}
				}
			}
		}

	}

}

