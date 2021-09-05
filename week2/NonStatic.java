package week3lab;

public class NonStatic {

	public static void main(String[] args) {
		AccessStatic obj = new AccessStatic();
		obj.met();
		
	}

}
class AccessStatic{
	static int i = 10;
	public void met() {
		System.out.println(i);
	}
}
