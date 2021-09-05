package Wrapping;

public class StringDemo {
	public static void main(String[] args) {
		String s = "hello world..";//only one value object is created
		String ss = new String("hello world..");
		//here one value object plus one string object created
		
		String t1 = "hello";
		String t2 = "hello";
		System.out.println(t1 == t2 );
		
		String t11 = new String("hello");
		String t22 = new String("hello");
		
		System.out.println(t11 == t22);
		System.out.println(t11.equals(t22));
		
		
		System.out.println(t1.charAt(2));
		System.out.println(t1.substring(0,4));
		System.out.println(t1.indexOf('e'));
		String sss = new String(new char[] {'a','b'});
		
		//string is a non mutable object
		String a = sss.replace('a', 'z');
		System.out.println(sss);
		System.out.println(a);
		
		System.out.println(t11);
		String temp = t11.replace('h', 'm');
		System.out.println(t11);
		System.out.println(temp);
		
		String mystring = "this is my string...";
		temp = mystring;
		mystring = mystring+"this is hello world..";
		System.out.println(mystring);
		System.out.println(temp);
	}

}
