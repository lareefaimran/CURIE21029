
public class AmaravthiProject {
	public static void main(String[] args) {
		AmaravathiCity.infrastructure(new Roads(), new BusStand(),new Airport(), 
				new Railwaystation(), new WaterProvision() , new DrainageProvision());
		AmaravathiCity dreamcity = new AmaravathiCity();
		dreamcity.promotion();
	}
}

class AmaravathiCity{
	static Roads road;
	static BusStand busstand;
	static Airport airport;
	static Railwaystation railwaystation;
	static WaterProvision waterprovision;
	static DrainageProvision drainageprovision;
	
	Secretariat secretariat;
	Hospital hospital;
	DrainageConnection drainage;
	
	public void buildHouse(House house) {
		System.out.println("one house built...."+house);
	}
	public void promotion() {
		System.out.println("roads are used..."+road);
		System.out.println("airport is used..."+airport);
		
		
	}
	public static void infrastructure(Roads road,BusStand busstand,Airport airport,Railwaystation
			railwaystation,WaterProvision waterprovision,DrainageProvision drainageprovision) {
			AmaravathiCity.road = road;
			AmaravathiCity.busstand = busstand;
			AmaravathiCity.airport = airport;
			AmaravathiCity.railwaystation = railwaystation;
			AmaravathiCity.waterprovision = waterprovision;
			AmaravathiCity.drainageprovision = drainageprovision;
			
			
			
	}
	
}
class Roads{}
class BusStand{}
class Airport{}
class Railwaystation{}
class WaterProvision{}
class DrainageProvision{}

class Secretariat{}
class University{}
class Hospital{}

class House{}
class DrainageConnection{}
class WaterConnection{}
