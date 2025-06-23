package Test;
class Hr{
	int id;
	char name[];
	double salary,commission;
	
}
public class DemoHr {

	public static void main(String[] args) {
		Hr h1;
		h1 = new Hr();
		System.out.println(h1);
		System.out.println("Id:"+h1.id+" Name:"+h1.name+" Salary:"+h1.salary+" Commission:"+h1.commission);


	}

}
