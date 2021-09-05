package Wrapping;

public class WrappingDemo {
	public static void main(String[] args) {
		/*
		 * for every primitive type , there is wrapper type
		 * int - Integer
		 * float - Float
		 * char - Character
		 * boolean - Boolean
		 * byte - Byte
		 * long -Long
		 * 
		 */
		//before jdk5
		//int i = 10;//simple type
		//now we want to convert it into object type
		//Integer ii = new Integer(i);//boxing
		//int n = ii.intValue();//unboxing
		//Integer iii = new Integer(n);//boxing
		
		//AFTER JDK 5
		//jdk introduced autoboxing and autounboxing
		//Integer nn = Integer.valueOf(i);
		//int nnn = nn;//auto unboxing
		//Integer xxx = nnn;////auto boxing
		
		
		//ADVANTAGES WE HAVE
		//utility methods
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.max(10, 20));
		System.out.println(Integer.compare(10,20));
		String sss1 = args[0];
		String sss2 = args[1];
		System.out.println(sss1+sss2);
		//int s1 = Integer.parseInt(args[0]);
		//int s2 =Integer.parseInt(args[1]);
		//System.out.println(s1 + s2);
	
		
		
		
		
	}

}
