package week2;

import java.util.Scanner;

public class Conditionoperator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:...");
		int x = scan.nextInt();
		
		if(x%2==0) {
			System.out.println("if else if-Even number......");
		}
		else {
			System.out.println("if else if-1Odd number.....");
			
		}
		
		System.out.println((x%2==0)?"Ternary-Even number":"Ternary-Odd number");

	
	switch(x%2)
	
	{
	  case 0:{
		  System.out.println("switch-Even number");
		  break;
	  }
	  case 1:{
		  System.out.println("switch-odd number");
		  break;
	  }
	}

}
}
