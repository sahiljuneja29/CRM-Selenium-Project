package ArrayPrograms;

public class Array25 {

	public static void main(String[] args) {
		// Count pairs with given sum
		
//		Input:
//			N = 4, K = 6
//			arr[] = {1, 5, 7, 1}
		
		int[] ar={1, 5, 7, 1,3,4,2,3};
		int sum=6;
		
		int count=0;
		
		for(int i=0;i<ar.length;i++) {
			int temp=0;
			for(int j=i+1;j<ar.length;j++) {
				temp=ar[i]+ar[j];
				if(temp==sum) {
					count=count+1;
					System.out.println("pair:"+ +ar[i] +";"+ar[j]);
				}
			}
		}
		System.out.println(count);
		

	}

}