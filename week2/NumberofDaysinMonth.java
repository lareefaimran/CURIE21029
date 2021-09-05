package week3lab;

import java.time.Month;
import java.util.Scanner;

public class NumberofDaysinMonth {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int daysinmonth = 0;
		String MonthName = "";
		System.out.println("Please enter the month..");
		int month = s.nextInt();
		System.out.println("Please enter the year..");
		int year = s.nextInt();
		
		switch(month) {
		case 1:
			MonthName = "January";
			daysinmonth = 31;
			break;
				
		case 2:
			MonthName = "Feburary";
			if((year%400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
				daysinmonth = 29;
			else
				daysinmonth = 28;
			break;
				
					
		case 3:
			MonthName = "March";
			daysinmonth = 31;
			break;
			
		case 4:
			MonthName = "April";
			daysinmonth = 30;
			break;
		case 5:
			MonthName = "May";
			daysinmonth = 31;
			break;
		case 6:
			MonthName = "June";
			daysinmonth = 30;
			break;
		case 7:
			MonthName = "July";
			daysinmonth = 31;
			break;
		case 8:
			MonthName = "August";
			daysinmonth = 31;
			break;
			
		case 9:
			MonthName = "September";
			daysinmonth = 31;
			break;
		case 10:
			MonthName = "October";
			daysinmonth = 30;
			break;
		case 11:
			MonthName = "November";
			daysinmonth = 31;
			break;
		case 12:
			MonthName = "December";
			daysinmonth = 30;
			break;
		
					
			
		}
		
		
		System.out.println("The month is "+ MonthName + " and it has "+ daysinmonth +" days in it");
	}

}
