package ImpJavaPrograms;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//count the occurence of a given char in String
		
		String a="sashails";
		char val='a';
		int count=0;
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==val) {
				count++;
			}
		}
		System.out.println(count);
		

		
		// reverse a number
		int num=6783;
		int temp=0;
		
		while(num!=0) {
			
			temp=(temp*10)+(num%10);
			num=num/10;
		}
		System.out.println(temp);
	}
	
	
	

}