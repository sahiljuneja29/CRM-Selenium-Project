package StringPrograms;

public class StringProg3 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String a1="Sahil";
			String a2="Mahil";
			String a3="Sahil";
			String a4="";
			System.out.println(a1.compareTo(a2));
			System.out.println(a2.compareTo(a1));
			System.out.println(a1.compareTo(a3));

			System.out.println(a2.compareTo(a4));
			System.out.println(a4.compareTo(a2));
			
			//The ClassCastException is thrown when objects of incompatible types get compared. 
			//In the following example, we are comparing an object of the ArrayList (al) with a string literal ("Sehwag").
			
			String str = null;  
			  
			// null is invoking the compareTo method. Hence, the NullPointerException  
			// will be raised  
//			int no =  str.compareTo("India is my country.");  
//			  
//			System.out.println(no);  
//			
			//.ValueOF  converts other datatype values to String
			
			int val=45;
			String s1=String.valueOf(val);
			System.out.println("23"+s1);

	
	}

}
