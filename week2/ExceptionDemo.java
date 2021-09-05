package mod1_2.day1;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Life before exception...");
		try {
			int i = 1/Integer.parseInt(args[0]);
		}catch(ArithmeticException a) {
			System.out.println(a);
			System.out.println("You cannot divide a number by zero...use some other number");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
			System.out.println("Please enter the value in command line...");
		}
		catch(NumberFormatException ne) {
			ne.printStackTrace();
			System.out.println("please enter the valid number, characters are not allowed");
		}
		finally {
			System.out.println("finally block called..");
		}
		
		System.out.println("Life after exception...");
	}

}
