package week3lab;


import java.util.Scanner;

public class NumberToWords {
	public static String[] units = {"Zero","One","Two","Three","Four","Five","Six",
			"Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen",
			"Sixteen","Seventeen","Eighteen","Nineteen"};
	public static String[] tens = {" "," ","Twenty","Thirty","Forty","Fifty","Sixty","Seventy"
			,"Eighty","Ninety"};
	public static String convert(int n) {
		
		
		if(n < 0) {
			return "Invalid number";
		}
		if(n <20)
			return units[n];
		if(n < 100)
			return tens[n/10] + ((n%10 !=0 )?" ":"") + units[n%10]; 
		if(n < 1000)
			return units[n/100]+" Hundred"+ ((n%100 != 0)? " ": "") + convert(n%100);
		if(n < 100000)
			return  convert(n/1000) +" Thousand"+((n%10000 != 0)? " ": "")+convert(n%1000);
		if(n < 10000000)
			return convert(n/100000) +" Lakh"+((n%100000 != 0)? " ":"")+convert(n%100000);
		return convert(n/10000000)+" Crore "+((n%10000000 != 0)?" ": "")+convert(n%10000000);
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to convert into word...");
		int n = sc.nextInt();
		System.out.println(convert(n));
	
		}
		
	}


