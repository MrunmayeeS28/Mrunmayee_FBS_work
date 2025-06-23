package assignment2;

public class result {

	public static void main(String[] args) {
		int res,marks=78;
//	    printf("Enter your marks:");
//	    scanf("%d",&marks);
	    if(marks<=100){
	    if(marks>75){
	    	System.out.printf("Distinction");
	    }
	    else if(marks>65){
	    	System.out.printf("First Class");
	    }
	    else if(marks>55){
	    	System.out.printf("Second Class");
	    }
	    else if(marks>=40){
	    	System.out.printf("Pass Class");
	    }
	    else{
	    	System.out.printf("Fail");
	    }
	    }
	    else{
	    	System.out.printf("Enter valid marks!!");
	    }

	}

}
