package assignment1;

public class evenodd {

	public static void main(String[] args) {
		int num=12;
//	    printf("enter the number:");
//	    scanf("%d",&num);
	    if(num>0){
	       if(num%2==0){
	           System.out.printf("even");
	        }
	       else{
	    	   System.out.printf("odd");
	        }
	    }
	    else{
	    	System.out.printf("enter valid number.");
	    }

	}

}
