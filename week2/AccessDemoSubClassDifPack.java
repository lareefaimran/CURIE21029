package diff;

import  AccessModifiers.AccesDemo;
public class AccessDemoSubClassDifPack extends AccesDemo {
	//nomod is package scope - not available outside the package
	//private is class scope
	public void met() {
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}
//different package non sub class - except public no other access specifier will work
//protected is relation scope
//public is global scope - accessible from anywhere
class AccessDemoNonSubClassDiffPackage {
	public void met() {
		AccesDemo obj=new AccesDemo();
		System.out.println(obj.pri);
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
		System.out.println(obj.pub);
	}

	}
	


