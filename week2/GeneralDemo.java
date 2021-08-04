
public class GeneralDemo {
	public static void main(String[] args) {
		Hall myhall = new Hall();
		myhall.party = new Associationparty();
		System.out.println(myhall.party);
		
		
	}

}
class Hall{
	Party party;
	
}
class Party{
	
}
class BirthdayParty extends Party{}
class Engagementparty extends Party{}
class Associationparty extends Party{}