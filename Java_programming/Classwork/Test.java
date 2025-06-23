package Test;
class Date{
	int day=20,month=06,year=2025;
}


class Test {

	public static void main(String[] args) {
		
		Date d1; //reference
		//System.out.println(d1); it gives compliation error,it must be initialize
		d1 = new Date(); //get memory at heap
		System.out.println(d1); //printing hashcode Test.Date@6f539caf
		
		Date d2;
		d2 = new Date();
		System.out.println(d2);
		
		int a=10;
		System.out.println(a);
		System.out.println(d1.day);
		System.out.println(d1.month);
		System.out.println(d1.year);
		System.out.println("Date is:"+d1.day+"/"+d1.month+"/"+d1.year);
		System.out.println("hi");
	}

}
