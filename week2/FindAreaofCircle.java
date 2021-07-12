package basic;

import java.util.Scanner;

public class FindAreaofCircle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		
		double radius = scanner.nextDouble();
		//Area of circle
		double area = Math.PI * (radius * radius);
		
		System.out.println("The Area of Circle is: " + area);
		
		double circumference = Math.PI * 2 * radius;
		System.out.println("The circumference of Circle is: "+ circumference);
			

	}

}
