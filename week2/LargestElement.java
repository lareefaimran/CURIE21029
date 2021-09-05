package week3lab;

import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of rows..");
		int rows = sc.nextInt();
		System.out.println("Please enter the number of columns..");
		int columns = sc.nextInt();
		int arr[][] = new int[rows][columns];
		System.out.println("Please enter the elements of array....");
		for(int i = 0;i < rows;i++) {
			for(int j = 0;j< columns;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0;i<rows;i++) {
			int max = 0;
			for(int j = 0;j< columns;j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
	
			}
			System.out.println("The largest element is "+ max);
		}
		
		
	}

}
