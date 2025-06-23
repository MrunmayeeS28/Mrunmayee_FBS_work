package Test;

class SalesManager{
	int id,target;
	char name[];
	double salary,incentive;
}
class DemoSM {

	public static void main(String[] args) {
		SalesManager s1;
		s1 = new SalesManager();
		System.out.println(s1);
		System.out.println("Id:"+s1.id+" Name:"+s1.name+" Salary:"+s1.salary+" incentive:"+s1.incentive+" Target:"+s1.target);


	}

}
