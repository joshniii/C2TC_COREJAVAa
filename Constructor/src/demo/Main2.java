package demo;
class Employee1 {
	int id;
	String name;
	float salary;
	Employee1(int id, String name, float salary) { 
		System.out.println(" User defined no-argument"  + "constructor executed");
	}
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}
public class Main2 {

	public static void main(String[] args) {
		
		Employee1 e1= new Employee1(101,"joshni", 45000);
		Employee1 e2= new Employee1(102,"jyothi",25000);
		Employee1 e3= new Employee1(103,"vihaan",55000);
		
		e1.display();
		e2.display();
		e3.display();
	}

}

