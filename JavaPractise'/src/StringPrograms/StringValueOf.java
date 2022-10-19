package StringPrograms;

public class StringValueOf {
	 
    public static void main(String[] args) {  
        boolean b1=true;  
        byte b2=11;    
        short sh = 12;  
        int i = 13;  
        long l = 14L;  
        float f = 15.5f;  
        double d = 16.5d;  
        char chr[]={'j','a','v','a'}; 
        char c='a';
        
        //to get string representation of diff data types use .valueOf method of String
       StringValueOf obj=new StringValueOf();  
        String s1 = String.valueOf(b1);    
        String s2 = String.valueOf(b2);    
        String s3 = String.valueOf(sh);    
        String s4 = String.valueOf(i);    
        String s5 = String.valueOf(l);    
        String s6 = String.valueOf(f);    
        String s7 = String.valueOf(d);    
        String s8 = String.valueOf(chr);    
        String s9 = String.valueOf(obj);    
        String s10 = String.valueOf(c);  
        System.out.println(s1);  
        System.out.println(s2);  
        System.out.println(s3);  
        System.out.println(s4);  
        System.out.println(s5);  
        System.out.println(s6);  
        System.out.println(s7);  
        System.out.println(s8);  
        System.out.println(s9);  
        System.out.println(s10);  
    }  
}  

