package week3lab;

import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of elements in array: ");
		int[] a = new int[sc.nextInt()];
		System.out.println("Please enter the elements to be sorted..: ");
		for(int i = 0;i <a.length;i++)
			a[i] = sc.nextInt();
		int temp = 0;
		for(int i =0;i<a.length;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j] = temp;
					
					
				}
			}
			
			
		}
		System.out.println();
		System.out.println("Elements after soretd....");
		for(int i =0;i<a.length;i++) {
			
			System.out.println(a[i]+" ");
		}
		
	}
	

}


