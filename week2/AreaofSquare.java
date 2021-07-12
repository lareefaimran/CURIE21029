package basic;

import java.util.Scanner;

public class AreaofSquare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sides of square: ");
		double side = scanner.nextDouble();
		
		//Area of Square
		double area = side * side;
		System.out.println("The Area of Square is: "+ area);

	}

}
