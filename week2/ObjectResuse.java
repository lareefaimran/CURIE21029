package week3lab;

public class ObjectResuse {
	public static void main(String[] args) {
		PartyHall pp = new PartyHall();
		pp.bp = new BirthdayParty();
		//pp.bp = new EngagementParty();
		
		GeneralParty gp = new GeneralParty();
		gp.p = new BirthdayParty();
		gp.p = new EngagementParty();
		
		
	}

}
class GeneralParty{
	Party p;
	
}
class PartyHall{
	BirthdayParty bp;
	
}
class Party{
	
}
class BirthdayParty extends Party{
	
}
class EngagementParty extends Party{
	
}
