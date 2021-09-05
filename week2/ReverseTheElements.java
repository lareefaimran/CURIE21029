package week3lab;

import java.util.Scanner;

public class ReverseTheElements {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int num,reversenum;
		System.out.println("Please enter the number of rows...");
		int rows = sc.nextInt();
		System.out.println("Please enter the number of colmns..");
		int columns = sc.nextInt();
		int[][] a = new int[rows][columns];
		System.out.println("Please enter the elements of array..");
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<columns;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=rows-1;i>=0;i--) {
			
			for(int j = columns-1;j>=0;j--) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
				 
		}
		
		
	}

}
