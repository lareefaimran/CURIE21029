package mod1_2.day5;

public class CustomExceptionDemo {
	public static void main(String[] args) {
		ATM bobatm = new ATM();
		try {
		bobatm.withdrawMoney(3000);
		}catch(MaxwithDrawLimitException e) {
			System.out.println(e);
			System.out.println("Let me now give lesser value...");
		}
		catch(NoFundException ne) {
			System.out.println(ne);
			System.out.println("my balance needs to be topedup");
		}
		catch(Exception ae) {
			System.out.println(ae);
			System.out.println("unknown exception");
		}
		
	}

}
class ATM{
	public void withdrawMoney(int amt) throws Exception{
		int available = 1000;
		if(amt >= 2000) {
			throw new MaxwithDrawLimitException("The limit sholudnot exceedbeyond 2000..");
		}
		if(available <= amt) {
			throw new NoFundException();
		}
	}
}
class MaxwithDrawLimitException extends Exception{
	String msg;
	public MaxwithDrawLimitException(String msg) {
		this.msg=msg;
	}
	public String toString() {
		return "exception..."+this.getClass().getName()+".........."+this.msg;
	}
	
}
class NoFundException extends Exception{
	
}
