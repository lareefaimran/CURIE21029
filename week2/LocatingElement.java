package week3lab;

import java.util.Scanner;

public class LocatingElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of elements in array: ");
		int[] a = new int[sc.nextInt()];
		System.out.println("Please enter the elements of array ");
		for(int i = 0;i <a.length;i++)
			a[i] = sc.nextInt();
		System.out.println("enter the element to be located....");
		int element = sc.nextInt();
		int index = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==element) {
				index = i;
			}
			
		}
		System.out.println("index of the element....: "+index);
		
		
	}
	
}
