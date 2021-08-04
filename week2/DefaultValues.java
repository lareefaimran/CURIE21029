
public class DefaultValues {

	
		 byte b;
		 short s;
		 int i;
		 long l;
		 double d;
		 float f;
		 char c;
		 boolean boo;
		 String p;
		
	
	public void met() {	
		
		System.out.println("Default value of byte......: "+b);
		System.out.println("Default value of short.....: "+s);
		System.out.println("Default value of int......: "+i);
		System.out.println("Default value of long.....: "+l);
		System.out.println("Default value of double.....: "+d);
		System.out.println("Default value of float....: "+f);
		System.out.println("Default value of char......: "+c);
		System.out.println("Default value of boolean.....: "+ boo);
		System.out.println("Default value of String.....: "+p);
	}
	public static void main(String[] args) {
		DefaultValues obj = new DefaultValues();
		obj.met();
	}

	

}
