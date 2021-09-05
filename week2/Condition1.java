package revision.mod1;

public class Condition1 {
	public static void main(String[] args) {
		int num = 10;
		int n = num%2;
		//If condition always evaluates using boolean
		//if(n==0)
		boolean b=(n==0);
		//if(b)
		if(num%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");
		boolean c=false;
		if(!c) {
			System.out.println("yes it is false...");
		}
		

	}
	
}
