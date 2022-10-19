package StringPrograms;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//compareTo function compares lexicographically
		
		String str="Sahil";
		String str2="Juneja";
		String str3="Sahil";
		
		System.out.println(str.compareTo(str2));   //9
		System.out.println(str.compareTo(str3));	//0
		System.out.println(str2.compareTo(str));   //-9
		
	}

}