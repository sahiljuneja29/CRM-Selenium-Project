package StringPrograms;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringProg4 {
	

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String str="SahilSh";
			
			String[] s1=str.split("");
			
			System.out.println(Arrays.toString(s1));
			
			Set<String> s2=new LinkedHashSet<String>(Arrays.asList(s1));
			
			System.out.println(s2);
			
			String[] s3=s2.toArray(new String[s2.size()]);
			String s6="";
			for(String s5:s3) {
				s6+=s5;
			}
			System.out.println(s6);

		

	}


}
