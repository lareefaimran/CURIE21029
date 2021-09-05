package week3lab;

import java.util.Scanner;



public class StudentResult {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of students...");
		int student = sc.nextInt();
		System.out.println("Please enter the marks of student...");
		int marks = sc.nextInt();
		
		int result[][] = new int[student][marks];
		for(int i = 0;i<student;i++) {
			for(int j = 0;j<marks;j++) {
				result[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("The result of students.....");
		for(int i = 0;i<student;i++) {
			System.out.println(i);
			for(int j = 0;j<marks;j++) {
				System.out.print(result[i][j]+"\t");
				
			}
			System.out.println("");
			System.out.println();
		}
	}

}
