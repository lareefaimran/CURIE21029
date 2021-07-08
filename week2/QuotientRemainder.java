package week2;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		  int dividend = 25;
		  int divisor = 4;
	  
	      int Quotient = dividend/divisor;
	      int Remainder = dividend%divisor;
	  
	  
	      System.out.println("Quotient = "+Quotient);
	      System.out.println("Remainder = "+Remainder);
	

	}

}



class OddEven{
	public static void main(String[] args) {
	     int num;
	     System.out.println("Enter an integer number:");
	     
	     
	     Scanner input = new Scanner(System.in);
	     num = input.nextInt();
	     
	     if(num%2==0) {
	    	 System.out.println("Entered number is even");
	     }else
	     {
	    	 System.out.println("Entered number is odd");
	     }
	
}

}














