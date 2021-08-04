
public class ArrayDemo3 {
	public static void main(String[] args) {
		//single dimension array declaration and initialization
		int []a = {10,20,30};//1 row and 3 columns
		
		for(int i = 0;i <a.length;i++) {
			System.out.println(a[i]);
		}
		
		//jdk 5 for loop
		System.out.println("New for loop....");
		for(int i : a) {
			System.out.println(i);
		}
		
		//double dimension array declaration and initialization
		int[][] aa = {{10,20,30,40},{100,200,300,400},{1000,2000,3000,4000}};
		//3 rows and 4 columns
		//To declare a single dimension array
		//single dimensional array declaration only
				int []aaa=new int[3];
				//to initialize
				aaa[0]=10;//array index always starts with zero
				aaa[1]=20;
				aaa[2]=30;
				//aaa[3]=40;//this statement will throw ArrayIndexOutOfBound error
		//two dimensional array declaration 
				int aaaa[][] = new int[3][4];//3 rows and 4 columns
				aaaa[0][0] = 10;
				aaaa[0][1] = 20;
				
			// to read an array
				System.out.println(aaaa[2][2]);
				System.out.println("Reading a two dimensional array......");
				for(int i = 0;i < aaaa.length;i++) {
					for(int j = 0;j<aaaa[i].length;j++) {
						System.out.print(aaaa[i][j]+"\t");
					}
					System.out.println();
					
				}
				
				//jdk 5 for loop
				System.out.println("Jdk 5 for loop");
				for(int i[] : aaaa) {
					for(int j:i) {
						System.out.print(j+" ");
					}
					System.out.println();
				}
		
		
		
		
		
	}
	

}
