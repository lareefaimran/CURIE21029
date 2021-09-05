
public class GeneralizationDemo2 {
	//object reuseability-using object of generalized class will become reuseable object
	public static void main(String[] args) {
		Hall1 sHall = new Hall1();//specific hall-cannot be used for other parties
		sHall.party = new BirthdayParty1();
		sHall.party = new EngagementParty1();
		
		GeneralParty gHall = new GeneralParty();//generalhall-reuseable for all parties
		gHall.party = new BirthdayParty1();
		gHall.party = new EngagementParty1();
	}

}

class Hall1{
	BirthdayParty1 party;
}
class GeneralParty{
	Party1 party;
}
class Party1{}
class BirthdayParty1 extends Party1{}
class EngagementParty1 extends Party1{}
