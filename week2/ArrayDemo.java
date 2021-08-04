
public class ArrayDemo {
	public static void main(String[] args) {
		ArrayDemo obj = new ArrayDemo();
		int i = 10;
		int arr[] = {10,20,30,40};
		//pass by value
		System.out.println("met before called...."+i);
		obj.met(i);
		System.out.println("met after called..."+i);
		
		//pass by reference
		//System.out.println("arr[1] before called.."+arr[1]);
		//obj.met(arr);
		//System.out.println("arr[1] after called..."+arr[1]);
		
		//solution for pass by reference
		int arrayduplicate[] = new int[4];
		//arrayduplicate = arr;
		System.arraycopy(arr, 0, arrayduplicate, 0, 4);
		System.out.println("arr[2] before called..."+arr[2]);
		obj.met(arrayduplicate);
		System.out.println("arr[2] after met called..."+arr[2]);
	}
	void met(int i) {
		i = 20;
	}
	void met(int arr[]) {
		arr[2] = 200;
	}

}
