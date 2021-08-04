package week3lab;

import java.util.Scanner;

public class AverageofNumbers {
	public static void main(String[] args) {
		Average.average();
	
	}
	
}

	
class Average{
	public static void average() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter the number...");
		 int n = sc.nextInt();
		 
		 int [] a = new int[n];
		 int sum = 0;
		 int average=0;
		 for(int i =0;i<a.length;i++) {
			 a[i] = sc.nextInt();
			 sum += a[i];
			 
		 }
		 average += sum/a.length;
		 System.out.println("Average of n numbers..."+average);
		 
	 }
	}





