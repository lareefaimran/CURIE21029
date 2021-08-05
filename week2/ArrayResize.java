package week3lab;

public class ArrayResize {
	public static void main(String[] args) {
		int arr[] = new int[4];
		System.out.println("Array before resize.....");
		for(int i : arr) {
			System.out.println(i);
		}
		
		int arr2[] = new int[6];
		System.arraycopy(arr, 0, arr2, 0, 4);
		System.out.println("Array after resize............");
		for(int i : arr2) {
			System.out.println(i);
		}
	}


}
