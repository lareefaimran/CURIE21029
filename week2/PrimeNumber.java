package week3lab;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number....");
		int num = sc.nextInt();
		sc.close();
		Test obj = new Test();
		obj.input(num);
		
		
	}

}   
class Test{
	boolean prime  = true;
	
	public void input(int num) {
		for(int i = 2;i < num;i++) {
			if(num%i == 0) {
				prime = false;
				break;
			}
		}
	
		if(prime) {
				System.out.println("The given number is prime number...: "+num);
			}else {
				System.out.println("The given number is not a prime number...: "+num);
			}
			
		
	}
	
	
}