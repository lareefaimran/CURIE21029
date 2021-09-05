package mod1_2.day5;

public class ExceptionDemo4 {
	public static void main(String[] args) throws Exception{
		Rocky heroine = new Rocky();
		heroine.buyDress();
		
	}

}
class Rocky{
	public void buyDress()throws Exception{
	ShoppingMall damal = new ShoppingMall();
	try {
	damal.dresschange();
	}catch(Exception e) {
		System.out.println("i will take care....");
	}
}

class ShoppingMall{
	boolean lock = true;
	public void dresschange() throws Exception{
		if(true) {
			try {
				throw new Exception();
			}catch(Exception e) {
				//System.out.println("exception occurred..."+e);
			}
		}
	}
}
}