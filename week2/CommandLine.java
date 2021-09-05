package week3lab;

public class CommandLine {
	public static void main(String[] args) {
		System.out.println("command line arguments...");
		for(int x = 0;x <args.length;x++) {
			System.out.println("args"+ " "+x +" "+ args[x]);
		}
	}

}
