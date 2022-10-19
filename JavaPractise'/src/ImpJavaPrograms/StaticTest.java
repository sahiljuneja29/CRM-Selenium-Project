package ImpJavaPrograms;

public class StaticTest {
	
	int val=2;
	static int var=25;
	static {
		System.out.println("Hello this is static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(val);
		System.out.println("Main Method");
		StaticTest.test();
	}
	
	public static void test() {
		var=45;
		System.out.println(StaticTest.var);
		System.out.println("Normal Method");
	}

}