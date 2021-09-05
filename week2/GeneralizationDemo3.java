//code reuseablitiy---
public class GeneralizationDemo3 {
	public static void main(String[] args) {
		B bobj = new B();
		System.out.println("Bobj...."+bobj.i);
		bobj.met();
		
		C cobj = new C();
		System.out.println("Cobj......"+cobj.i);
		cobj.met();
		
		A aobj = new A();
		System.out.println("Aobj...."+aobj.i);
		aobj.met();
		
	}

}
class A{
	int i = 10;
	public void met() {
		System.out.println("a class met logic called...........");
	}
}
class B extends A{
	
}
class C extends A{
	
}
