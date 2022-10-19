package StringPrograms;

public class InternExample {
	
	public static void main(String args[]){  
		String s1=new String("hello");  
		String s2="hello";  
		String s3=s1.intern();//returns string from pool, now it will be same as s2  
		
//		String s4=s2;
//		System.out.println(s2);
//		s2=s2.concat(s4);
//		System.out.println(s2);
//		System.out.println(s4);
		
		System.out.println(s1==s2);//false because reference variables are pointing to different instance  
		System.out.println(s2==s3);//true because reference variables are pointing to same instance
		System.out.println(s1==s3); //false
		
		//System.out.println(s4==s2);
		
		
		System.out.println(s1.equals(s2));   //true
		System.out.println(s1.equals(s3)); //true
		System.out.println(s2.equals(s3)); //true
		
		
	    String str = "This is index of example";  
        int index = str.lastIndexOf('i',10);  
        System.out.println(index);  

}
}