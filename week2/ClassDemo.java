
public class ClassDemo {
	public static void main(String[] args) {
		new Human().work();//anonymous
		Human lareefa = new Human();
		Human la = null;
		
		lareefa.work();
		int n = lareefa.givechange();
		System.out.println(n);
		
		
		System.out.println(lareefa.give(100));
		
		
		
	}

}

class Human{
	
	void work() {
		System.out.println("work method called....");
	}
	
	int givechange()
	{
		return 1;
	}
	
	int give(int money) {
		if(money >=100) {
			return money-50;
		}
		else
		{
			return money;
		}
	}
	
	
}
