
public class GeneralizationDemo {
	public static void main(String[] args) {
		Superclass sc = new Subclass1();
		
		Employee e = new Engineer();
		Engineer eng = new Enginner();
		
		
		acceptEmployee(eng);
		acceptEmployee(e);
		acceptEmployee(new Attendar());
		
		acceptEngineer(eng);
		acceptEngineer(e);
		acceptEnginner(new Attendar());
	}
	public static void acceptEmployee(Employee e) {
	}
	public static void acceptEngineer(Engineer eng) {
	
		

}
//subclass replacing the superclass
class Superclass{}
class Subclass1 extends Superclass{}
class Subclass2 extends Superclass{}

class Employee{}
class Engineer extends Employee{}
class Attendar extends Employee{}

}