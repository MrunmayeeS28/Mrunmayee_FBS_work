package assignment2;

public class age {

	public static void main(String[] args) {
		int age =45;
//	    printf("Enter the age:");
//	    scanf("%d",&age);
	    if(age < 12){
	    	System.out.printf("Your child.");
	    }
	    else if(age >= 12 && age<=19){
	    	System.out.printf("Your teenager.");
	    }
	    else if(age >= 20 && age<=59){
	    	System.out.printf("Your adult.");
	    }
	     else if(age >= 60 && age<120){
	    	 System.out.printf("Your senoir.");
	    }
	    else{
	    	System.out.printf("Please enter valid number.");
	    }

	}

}
