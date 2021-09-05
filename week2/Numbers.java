package week3lab;

import java.util.Scanner;


public class Numbers {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the number of rows.....");
	int rows = sc.nextInt();
	System.out.println("Please enter the number of columns.....");
	int columns = sc.nextInt();
	int a[][] = new int [rows][columns];
	System.out.println("Please enter the elements of array...");
	for(int i = 0;i<rows;i++) {
		for(int j = 0;j<columns;j++) {
			a[i][j] = sc.nextInt();
			
		}
		  
	}
	for(int i = 0;i<rows;i++) {
		for(int j = 0;j<columns;j++) {
			System.out.print(a[i][j]+"\t"); 
			
		}
		System.out.println();
		  
	}
	
		
	}
	

}
