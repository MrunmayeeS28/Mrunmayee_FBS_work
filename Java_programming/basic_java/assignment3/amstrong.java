package assignment3;

public class amstrong {

	public static void main(String[] args) {
		int num=153,sum = 0,check,mod;
//	    printf("Enter the number:");
//	    scanf("%d",&num);
	    check = num;
	    while(num!=0){
	        mod = num % 10;
	        mod = mod * mod * mod;
	        sum = sum + mod;
	        num = num / 10;
	    }
	    
	    if(check == sum){
	    	System.out.printf("Number is armstrong");
	    }
	    else{
	    	System.out.printf("number is not armstrong");
	    }

	}

}
