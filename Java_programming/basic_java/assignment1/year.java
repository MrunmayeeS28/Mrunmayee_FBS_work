package assignment1;

public class year {

	public static void main(String[] args) {
		 int year = 2004;
		 if(year%4==0 && year%100!=0 || year%400 == 0){
			 System.out.printf("year is leap");
		    }
		    else{
		    	System.out.printf("year is not leap");
		    }

	}

}
