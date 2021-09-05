
public class BiriyaniDemo {
	public static void main(String[] args) {
		//infrastructural requirement
		Kitchen.alloldutensils = new Utensils();
		Kitchen.vessel2kg = new Vessel();
		Kitchen.laxmiDeluxe = new Stove();
		
		//object requirment
		Rice basmathi = new Rice();
		Water mineral = new Water();
		Gas induction = new Gas();
		Mutton mutton = new Mutton();
		Ingredient shop = new Ingredient();
		Biriyani mybiriyani = new Biriyani(basmathi,mineral,induction,mutton,
				shop);
		mybiriyani.makebiriyani();
		
	}

}
class Biriyani{
	static Kitchen kitchen;
	Rice rice;
	Water water;
	Gas gas;
	Mutton mutton;
	Ingredient ingredient;
	public Biriyani(Rice rice,Water water,Gas gas,Mutton mutton,
			Ingredient ingredient) {
		this.rice = rice;
		this.water = water;
		this.gas = gas;
		this.mutton = mutton;
		this.ingredient = ingredient;
		
	}
	
	public void makebiriyani(){
		System.out.println("I use...."+Biriyani.kitchen.vessel2kg);
		System.out.println("I use..."+Biriyani.kitchen.laxmiDeluxe);
		System.out.println("I use...."+Biriyani.kitchen.alloldutensils);
		System.out.println("I use.."+this.rice+":"+this.water+":"
		+this.gas+":"+this.mutton+":"+this.ingredient);
		
		System.out.println("Biriyaniiiiiiiiiiiiii Ready.................");
		
	}
	
}
class Kitchen{
	static Stove laxmiDeluxe;
	static Vessel vessel2kg;
	static Utensils alloldutensils;
	public static void buildkitchen(Stove laxmiDeluxe,Vessel vessel2kg,
			Utensils alloldutensils) {
		Kitchen.laxmiDeluxe = laxmiDeluxe;
		Kitchen.vessel2kg = vessel2kg;
		Kitchen.alloldutensils = alloldutensils;
	}
	
}

class Stove{
	
}

class Vessel{
	
}
class Utensils{
	
}
class Rice{
	
}
class Water{
	
}
class Gas{
	
}
class Mutton{
	
}
class Ingredient{
	
}