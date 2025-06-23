package assignment2;

public class greatest {

	public static void main(String[] args) {
		int a=12 , b=9, c=63;
//	    printf("Enter the value of a,b and c:");
//	    scanf("%d %d %d",&a,&b,&c);

	    if(a>b){
	        if(a>c){
	        	System.out.printf("Value of a %d is greater",a);
	        }
	        else{
	        	System.out.printf("Value of c %d is greater",c);
	        }
	    }
	    else if(b>c){
	    	System.out.printf("Value of b %d is greater",b);
	    }
	    else{
	    	System.out.printf("Value of c %d is greater",c);
	    }

	}

}
