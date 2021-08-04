
public class ClassVariableDemo {
	public static void main(String[] args) {
		System.out.println(Houses.masjidname);
		Houses.masjidname = "quba masjid....";
		System.out.println(Houses.masjidname);
		
		Houses rasheeda = new Houses();
		rasheeda.housename = "this is rasheeda home....";
		
		
		Houses aamena = new Houses();
		aamena.housename = "this is aamaena home...";
		
		
		System.out.println(rasheeda.housename+":"+rasheeda.masjidname);
		System.out.println(aamena.housename+":"+aamena.masjidname);
		
		Houses rajihouse = new Houses();
		rajihouse.housename = "this is rajii house....";
		System.out.println(rajihouse.masjidname);
	}

}

class Houses{
	
	String housename;
	static String masjidname;
	
}
