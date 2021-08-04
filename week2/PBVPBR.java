import java.util.Scanner;

public class PBVPBR {
	public static void main(String[] args) {
		PPV_Whispergame ppv = new PPV_Whispergame();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value....: ");
		String myword = scan.next(); 
		
		System.out.println("My word is..."+myword);
		ppv.accept(myword);
		System.out.println("My word after ppv is..."+myword);
		
		System.out.println("Please enter the size for laddu...: ");
		int size = scan.nextInt();
		Laddu laddu = new Laddu(size);
		PPR_Laddugame ppr = new PPR_Laddugame();
		ppr.accept(laddu);
		System.out.println("Laddu size after passing..."+laddu.size);
		
	}

}

class PPV_Whispergame{
	public void accept(String myword) {
		System.out.println("Word Received..."+myword);
		myword = "sufyan";
		System.out.println("Word perceived..."+myword);
	}
	
}

class PPR_Laddugame{
	public void accept(Laddu laddu) {
		System.out.println("Laddu before pass....."+laddu.size);
		laddu.size = laddu.size-8;
		System.out.println("Laddu after passed..."+laddu.size);
	}
	
}

class Laddu{
	int size;
	Laddu(int size){
		this.size = size;
		
	}
}