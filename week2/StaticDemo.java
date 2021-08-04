
public class StaticDemo {
  public static void main(String[] args) {
	StaticMethod.metStatic(1000);
	StaticMethod obj = new StaticMethod();
	obj.metNormal();
	
	StaticMethod obj2 = new StaticMethod();
	obj2.metNormal();
}
}

class StaticMethod{
	static int money;
	public void metNormal() {
		System.out.println("non static method called..."+money);
	}
	
	public static void metStatic(int money) {

		StaticMethod.money = money;
		System.out.println("static method called..."+money);
	}
}
