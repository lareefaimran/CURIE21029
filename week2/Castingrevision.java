package week2;

public class Castingrevision {

	public static void main(String[] args) {
		
		    byte b=20; //8 bit

			short s=b; //16 bit

			int i=s; //32 bit

			long l=i; //64 bit
		 
           long ll = 100;
           int ii= (int)ll;
           short ss = (short)ii;
           byte bb = (byte)ss;
         //even in compatible types if the value is of higher range, then the value is trimmed to a lower value

   		//by dividing the number by 256 and assigning the reminder.
           
           int iii = 257;
           byte bbb = (byte)iii;
           
           System.out.println(bbb);
           
           float f = 123.434f;
           int myint = (int)f;
           System.out.println(myint);
           
           
           System.out.println((char)169);
           System.out.println((int)'a');
           
           
           int myascii = 169;
           char mychar = (char)myascii;
           System.out.println(mychar);
        		   
	}

}
