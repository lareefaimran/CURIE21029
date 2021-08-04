
public class LocalInstanceDemo {
	int i ;
	int k = 2020;
	public void met() {
		int i = 10;
		System.out.println("Local variable i......"+i);
		System.out.println("Instance variable not overridden...."+ k);
		System.out.println("Instance variable overriden....."+this.i);
	}


 public static void main(String [] args) {
	 
	 LocalInstanceDemo obj = new LocalInstanceDemo();
	 obj.met();
	 
	 
	 LocalInstanceDemo obj2 = new LocalInstanceDemo();
	 obj2.i = 5555;
	 obj2.met();
	 
 }
	 
 }
