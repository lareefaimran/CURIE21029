package mod1_2.day4;

public class ThreadDemo2 {
	public static void main(String[] args) {
		Thread onioncutter = new Thread(new OnionCuttingJob());
		Thread vegcutter = new Thread(new VegetableCuttingJob());
		Thread riceboiler = new Thread(new RiceBoilingJob());
		
		onioncutter.start();
		vegcutter.start();
		riceboiler.start();
		
		
		
		
		
		//new OnionCuttingJob().onioncutting();
		//new VegetableCuttingJob().vegcutting();
		//new RiceBoilingJob().riceboiling();
		
	}

}
class OnionCuttingJob implements Runnable{
	@Override
	public void run() {
		onioncutting();
		
	}
	public void onioncutting() {
		System.out.println("onion cutting started...");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
		System.out.println("onion cutting ended...");
	}
	
}
class VegetableCuttingJob implements Runnable{
	@Override
	public void run() {
		vegcutting();
		
	}
	public void vegcutting() {
		System.out.println("vegetable cutting started..");
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
		System.out.println("vegetable cutting ended...");
	}
	
}
class RiceBoilingJob implements Runnable{
	@Override
	public void run() {
		riceboiling();
		
	}
	public void riceboiling() {
		System.out.println("rice boiling started...");
		try {
			Thread.sleep(10000);
		}catch(Exception e) {}
		System.out.println("Rice boiling ended...");
	}
	
}
