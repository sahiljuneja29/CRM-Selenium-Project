package JavaPrograms;

public class Program9 {
	
	/*Java program to print numbers between 1 to 100 which 
	are divisible by 3, 5 and by both*/
	
	public static void main(String[] args) {
	
		for(int i=0;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("Divisible by 3 and 5 both:"+ i);
			}
			else if(i%3==00 && i%5!=0) {
				System.out.println("Divisible by 3: "+i);
			}
			
			else{
				System.out.println("Divisible by 5:"+i);
			}
		}
	
	}

}
