
public class ConsDemo {
	public static void main(String[] args) {
		Humans lareefa = new Humans();
		Humans lareef = new Humans("ssss");
		Humans laree = new Humans(10);
		
		
		
	}

}

class Humans
{
  Humans(){
	  System.out.println("cons is called...");
  }
  Humans(String s){
	  System.out.println("cons with string is called..");
  }
  Humans(int i){
	  System.out.println("cons with int is called...");
  }
}
