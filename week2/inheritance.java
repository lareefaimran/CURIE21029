package Revvision;

public class inheritance {
	public static void main(String[] args) {
		SuperClass sc = new SubClass();
		
		
	}

}
abstract class SuperClass{
	public SuperClass() {
		System.out.println("default of super cons called...");
		
	}
	public SuperClass(int i) {
		System.out.println("cons of super class called...");
		
	}
}
class SubClass extends SuperClass{
	public SubClass() {
		super(20);
	}
	
}
