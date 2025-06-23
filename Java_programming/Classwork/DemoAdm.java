package Test;

class Admin{
	int id;
	char name[];
	double salary,allowance;
	
}
class DemoAdm {

	public static void main(String[] args) {
		Admin a1;
		a1 = new Admin();
		System.out.println(a1);
		System.out.println("Id:"+a1.id+" Name:"+a1.name+" salary:"+a1.salary+" Allowance:"+a1.allowance);


	}

}
