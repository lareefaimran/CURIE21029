package Abstract;

public class AbstarctClassDemo {
	public static void main(String[] args) {
		SuperClass obj = new SubClass();
		obj.me2();
		obj.met();
		SuperClass obj2 = new SubClass2();
		obj2.me2();
		obj2.met();
		
		
		
	
	}
}
abstract class SuperClass{
	public SuperClass(int i) {
		System.out.println("Abstarct cons called...");
	}
	public abstract void met();
	final public void me2() {
		System.out.println("me2 is called...");
	}
	
}
class SubClass extends SuperClass{
	public SubClass() {
		super(20);//the parent class cons is called using super Keyword and in first line
		System.out.println("SubClass cons is called...");
	}
	@Override
	public void met() {
		System.out.println("abstarct method logic implemeted..");
		
	}
	
}
class SubClass2 extends SuperClass{
	public SubClass2() {
		super(2020);
	}
	@Override
	public void met() {
		System.out.println("subclas222222222222 logic called....");
		
	}
	
}