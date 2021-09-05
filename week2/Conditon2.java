package revision.mod1;

public class Conditon2 {
	public static void main(String[] args) {
		//ternary operator
		String s = (10<20)?"10 is less than 20":"10 is NOT lesser than 20";
		System.out.println(s);
		System.out.println((10<20)?"10 is less than 20":"10 is Not lesser than 20");
		
		
		System.out.println((11%2==0)?"Even number":"Odd number");
		
		//switch case
		//switch case works on values
		int age = 10;
		char c = 'a';
		String name= "rahim";
		switch(name) {
		case "rahim":
			System.out.println("eid holiday");
			break;
		case "ram":
			System.out.println("diwali holiday");
			break;
		case "John":
			System.out.println("ester holiday");
			break;
		default:
			System.out.println("no holiday");
			break;
		case "singh":
			System.out.println("guru holiday");
		}
		switch(age) {
		case 10:{
			System.out.println("You are a kid....");
			break;
		}
		case 20:{
			System.out.println("You are adult");
			break;
		}
		default:
			System.out.println("You are overaged...");
			break;
		}
		switch(c) {
		case 'a':
			System.out.println("a for Allah");
			break;
		case 'b':
			System.out.println("b for bakrid");
			break;
		default:
			System.out.println("default...");
		
		}
		
		
	}

}
