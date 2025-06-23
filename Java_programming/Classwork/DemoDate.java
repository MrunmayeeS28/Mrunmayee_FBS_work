package Test;
class Date{
	int day,month,year;
}


class DemoDate{

	public static void main(String[] args) {
		
		Date d1;
		d1 = new Date(); 
		System.out.println(d1); 
		System.out.println("Date is:"+d1.day+"/"+d1.month+"/"+d1.year);

	}

}
