package week2;

	import java.util.Scanner;

	public class Printanummber {

		public static void main(String[] args) {
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter the number: ");
			
			int number = reader.nextInt();
			
			System.out.println("You entered : "+number);
			reader.close();
			

		}

	}


