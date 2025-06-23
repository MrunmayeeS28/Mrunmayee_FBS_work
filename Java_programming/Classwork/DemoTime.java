package Test;
class Time{
	int hrs,min,sec;
}

class DemoTime{

	public static void main(String[] args) {
		
		Time t1;
		t1 = new Time();
		System.out.println(t1);
	
		System.out.println("Time is:"+t1.hrs+":"+t1.min+":"+t1.sec);
		
	}

}