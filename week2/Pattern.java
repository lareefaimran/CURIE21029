package week3lab;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of rows...");
		int rows = scan.nextInt();
		System.out.println("Please enter the number of columns..");
		int columns = scan.nextInt();
		int a[][] = new int[rows][columns];
		System.out.println("Please enter the elements of array...");
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<=i;j++) {
				a[i][j] = scan.nextInt();
			}
			
		}
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<=i;j++) {
				System.out.print(a[i][j]+" \t");
			}
			System.out.println();
		}
		
		//other rows and columns will  be zero..
		
		
	}

}
