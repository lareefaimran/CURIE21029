package week3lab;

public class Typecasting {
	byte b = 10;
	short s = b;
	int i = s;
	long l = i;
	
	double d = l;
	float f = (float)d;
	
	int mynum = 169;
	char c = (char)mynum;
	
	
	long ll = 20;
	int ii = (int)ll;
	short ss = (short)ii;
	byte bb = (byte)ss;
	
	float ff = 10.6f;
	double dd = ff;
	
	char ch = '@';
	int type = ch;
	public void met() {
		System.out.println("Type casting of primitive data types.....IMPLICIT");
		System.out.println("Implicit of byte..."+b);
		System.out.println("Implicit of short...."+s);
		System.out.println("Implicit of int..."+i);
		System.out.println("Implicit of long..."+l);
		System.out.println("Implicit of double...."+ d);
		System.out.println("Implicit of float...."+f);
		System.out.println("Implicit of char.."+c);
		System.out.println("Type casting of primitive data types.....EXPLICIT");
		System.out.println("Explicit of long..."+ll);
		System.out.println("Explicit of int..."+ii);
		System.out.println("Explicit of short.."+ss);
		System.out.println("Explicit of byte..."+bb);
		System.out.println("Explicit of float...."+ff);
		System.out.println("Explicit of double..."+dd);
		System.out.println("Explicit of char..."+ch);
		System.out.println("Explicit of int..."+type);
		
		
	}
	public static void main(String[] args) {
		Typecasting prm = new Typecasting();
		prm.met();
	}
	
	
	

}
