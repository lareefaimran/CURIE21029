package revision.mod1;

public class OperatorsDemo {
	public static void main(String[] args) {
		int i = 10;
		int j = 2;
		
		//Arithmetic operators
		System.out.println("Addition.."+(i+j));
		System.out.println("Subtarction..."+(i-j));
		System.out.println("Multiplication..."+(i*j));
		System.out.println("Division..remainder.."+(i/j));
		System.out.println("Division...qutotient..."+(i%j));
		
		//Arithmetic operators--2
		
		int x = 10;
		System.out.println(x++);//this will first print and then increment
		System.out.println(x);//this will print incremented value
		
		x = 10;
		System.out.println(++x);//this will increment then print
		System.out.println(x);
		
		System.out.println(x--);//this will print x and then decrement
		System.out.println(x);//this will print decremented value
		
		System.out.println(--x);//this will decrement and then print
		System.out.println(x);
		
		x = 10;
		
		System.out.println(x+=5);
		System.out.println(x-=5);
		
		//Relational Operators either return true or false ie Boolean
		System.out.println(i==j);
		System.out.println(i!=j);//negate of comparison
		System.out.println(i<j);
		System.out.println(i>j);
		System.out.println(i<=j);
		System.out.println(i>=j);
		
		//Logical Operators &&(and) ||(or)
		System.out.println(i<=10 && i==100);//returns true only if both the conditions satisfy
		System.out.println(i<=10 || i ==100);//returns true if any one condition satisfies
		
		
		
		
		
	}

}
