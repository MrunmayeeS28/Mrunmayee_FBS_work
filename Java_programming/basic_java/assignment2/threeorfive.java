package assignment2;

public class threeorfive {

	public static void main(String[] args) {
		int num=25;
//	    printf("Enter the number:");
//	    scanf("%d",&num);
	    if(num%3==0){
	        if(num%5==0){
	        	System.out.printf("Divisible by both");
	        }
	        else{
	        	System.out.printf("Divisible by 3 but not by 5");
	        }
	    }
	    else if(num%5==0){
	    	System.out.printf("Divisible by 5 but not by 3");
	    }
	    else{
	    	System.out.printf("Divisible by None");
	    }

	}

}
