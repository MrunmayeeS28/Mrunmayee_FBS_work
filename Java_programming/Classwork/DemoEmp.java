package Test;

class Employee{
	int id;
	char name[];
	double salary;
}
public class DemoEmp {

	public static void main(String[] args) {
		Employee e1;
		e1 = new Employee();
		System.out.println(e1);
		System.out.println("Id:"+e1.id+" Name:"+e1.name+" salary:"+e1.salary);

	}

}
