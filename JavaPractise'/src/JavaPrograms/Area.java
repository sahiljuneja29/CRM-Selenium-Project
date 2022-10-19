package JavaPrograms;

public class Area {
	
	static double radius=7.5;

	public static void main(String[] args) {
		// Java program to print the area and perimeter of a circle
		
		double area=Math.PI*radius*radius;
		double perimeter=2*Math.PI*radius;
		
		System.out.println(area);
		System.out.println(perimeter);

	}

}