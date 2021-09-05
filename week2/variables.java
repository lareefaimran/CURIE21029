package Revvision;

public class variables {
	public static void main(String[] args) {
		System.out.println(args[0]+":"+args[1]);
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		System.out.println(n1+n2);
		
		Employee emp1 = new Employee();
		emp1.i = 2020;
		Employee.s = 3030;
		System.out.println(emp1.i);
		System.out.println(Employee.s);
		
		Employee emp2 = new Employee();
		System.out.println(emp2.i);
		System.out.println(Employee.s);
		
		Employee e = new Employee(1000000);
		e.met();
		int result = e.met2();
		System.out.println(result);
		System.out.println(e.met2(20));
		System.out.println(e.met2(11,"njhdfjgh"));
		
	}

}
class Employee{
	int i =10;//instance variable
	static int s = 100;//class variable
	public Employee() {
		System.out.println("Employee object created....");
	}
	public Employee(int i) {
		System.out.println(i);
		System.out.println(this.i);
	}
	public void met() {
		System.out.println("met is called....");
	}
	public int met2(){
		System.out.println("mrt2 is called....");
		return 1;
	}
	public int met2(int i) {
		System.out.println("the value is supplied..."+i);
		return 2;
	}
	protected String met2(int i,String s) {
		if(i%2==0) {
			return "even number..";
	
		}
		else {
			return "odd Number..";
		}
	}
}
