package AccessModifiers;

public class AccesDemo {
	private int pri;
	int nomod;
	protected int pro;
	public int pub;
	
	public void met() {
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}
}
class AccesDemoSubclassSamePackage extends AccesDemo{
	public void met() {
		AccesDemo obj = new AccesDemo();
		System.out.println(obj.pri);
		System.out.println(obj.nomod);
		System.out.println(obj.pro);
		System.out.println(obj.pub);
	}
}
