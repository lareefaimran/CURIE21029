package Revvision;

public class JavaRevision {
	public static void main(String[] args) {
		//Parent p = new Children();
		//System.out.println(p.i);
		//p.met();
		
		Children c = new Children();
		System.out.println(c.i);
		c.met();
		c.ChildMethod();
		
		AnotherChild ac = new AnotherChild();
		System.out.println(ac.i);
		ac.met();
		
		
	}

}
abstract class Parent{
	int i;
	public Parent() {
		System.out.println("parent cons called...");
	}
	public Parent(int i) {
		
	}
	final public void met() {
		System.out.println("Parent method called...");
	}
	public abstract void metAbs();
}

class Children extends Parent{
	public Children() {
		super(1);
	}
	public void ChildMethod() {
		System.out.println("child method called...");
		super.met();
		}
	/*
	public void met() {
		System.out.println("method overriden");
	
	}*/
	@Override
	public void metAbs() {
		// TODO Auto-generated method stub
		
	}
	
}
class AnotherChild extends Parent{
	@Override
	public void metAbs() {
		// TODO Auto-generated method stub
		
	}
	
}