package demo;
class Employee {
	int id;
	String name;
	float salary;
	Employee() {
		System.out.println(" User defined no-argument"  + "constructor executed");
	}
	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}
public class Main1 {

	public static void main(String[] args) {
		
		Employee e1= new Employee();
		Employee e2= new Employee();
		
		e1.display();
		e2.display();
		
	}

}


public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
