package revision.mod1;

public class LoopingDemo {
	public static void main(String[] args) {
		int i = 10;
		
		while(i<10){//pre conditional check
			System.out.println(i);
			i++;
		}
		do {//post conditional check
			System.out.println("do..while "+i);
			i++;
		}while(i<10);
		
		//for(;;){} infinite loop
		//while(true)//infinite while loop
		for(int n = 0;n<10;n++) {//(initialization(only once)(1);condition(2);
			//increment or decrement(4)//print(3)
			System.out.println(n);
			
		}
	}

}
