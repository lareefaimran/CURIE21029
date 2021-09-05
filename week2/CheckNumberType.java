package week3lab;

import java.util.Scanner;

public class CheckNumberType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number of rows...");
		int rows = sc.nextInt();
		
		int a[] = new int[rows];
		System.out.println("Please enter the elements of array..");
		for(int i =0;i<rows;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Please enter the element tobe searched...");
		int search = sc.nextInt();
		int counter = 0;
		for(int i = 0;i<rows;i++) {
			if(a[i]==search) {
				
				System.out.println("The element is found at location..."+i);
				counter++;
				
			
			}
			
		}
		System.out.println("The number of times element occured in array is.."+counter);
		
		
		
	}

}
