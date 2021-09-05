package mod1_2.day4;

public class ThreadDemo5 {

	public static void main(String[] args) {
		Thread t = new Thread(new Myjob2());
		t.start();
		try {
			Thread.sleep(1000);
		}catch(Exception a) {}
		System.out.println("main method..");

	}

}
class Myjob2 implements Runnable{
	@Override
	public void run() {
		System.out.println("child method..");
		
	}
}
