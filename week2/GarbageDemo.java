
public class GarbageDemo {
	public static void main(String[] args) {
		GrandFather daddu = new GrandFather();
		System.out.println(daddu.getGold());
		//after few years
		//there is no mechanism to kill object
		met(daddu);
		daddu = null;
		
		System.gc();
		System.out.println(daddu.getGold());
		
		
	}
	static void met(GrandFather gf) {
		
	}

}
class GrandFather{
	private String gold;
	protected String getGold() {
		return "The gold is under the tree...go and take it";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Fianlize called...");
		System.out.println("The gold is under the tree....bury it with me");
		
	}
}
