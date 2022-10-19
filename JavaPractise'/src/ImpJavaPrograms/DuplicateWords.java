package ImpJavaPrograms;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//find duplicate words in a string
		String s="My Name is My Sahil Juneja Sahil is";
		
		s=s.toLowerCase();
		
		String[] a=s.split(" ");
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j]) ) {
					System.out.println(a[i]);
				}
			}
		}

	}

}