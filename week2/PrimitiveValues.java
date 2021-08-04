package week3lab;

public class PrimitiveValues {
	byte b;
	short s;
	int i;
	long l;
	double d;
	float f;
	char c;
	boolean boo;
	String str;
		public void met(){
		System.out.println("Default Values all primitive types....");
		System.out.println("Default value of byte...: "+b);
		System.out.println("Default value of short....: "+s);
		System.out.println("Default value of int....: "+i);
		System.out.println("Default value of long.......: "+l);
		System.out.println("Default value of double.........: "+d);
		System.out.println("Default value of float.....: "+f);
		System.out.println("Default value of char..: "+c);
		System.out.println("Default value of boolean....: "+boo);
		System.out.println("Default value of String...: "+str);
		
	}
		public static void main(String[] args) {
			PrimitiveValues pv = new PrimitiveValues();
			pv.met();
		}

}
