package revision.mod1;

public class Condition3 {
	public static void main(String[] args) {
		int age = 20;
		if(age < 10)
			System.out.println("you are a child....");
		if(age<19)
			System.out.println("you are teen...");
		if(age <10)
			System.out.println("you are a child...........");
		else if(age < 19)
			System.out.println("you are teeeeeennnnnnn......... ");
		else
			System.out.println("you are adult");
		
		char c ='c';
		if(c =='a')
			System.out.println("you are selected a");
		else if(c =='b')
			System.out.println("you are selected b");
		else
			System.out.println("you are selected neither a nor b");
		
		String s = "Allah";
		if(s.equalsIgnoreCase("Allah"))
			System.out.println("you selected Allah ");
		else if(s.equalsIgnoreCase("Jesus"))
			System.out.println("you selected Jesus");
		else
			System.out.println("you selected neither");
		
		
	}

}
