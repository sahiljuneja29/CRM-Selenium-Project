package StringPrograms;

public class StringProg1 {
	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			  
			String username = "Te45ndulkar123";
			  int size = username.length();
	          if(size > 8 && size <15){
	            
	        	 char arr[]=username.toCharArray();
	            int count=0;
	            int digit=0;
	            for(char c:arr){
	              if(Character.isLetter(c)){
	                ++count;
	              }
	              else if(Character.isDigit(c)){
	            	  ++digit;
	              }
	            }
	            System.out.println(digit);
	            if(count == size){
	              System.out.println("valid username");
	            }
	            else {
	            	System.out.println("invalid username");
	            }
	          }
	        }	
		


}
