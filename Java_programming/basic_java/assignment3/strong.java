package assignment3;

public class strong {

	public static void main(String[] args) {
		int num=145,fact,sum=0,res,mod;
//	    printf("enter the number:");
//	    scanf("%d",&num);

	    res = num;
	    while(num!=0){
	        mod = num % 10;
	        fact = 1;
	        while(mod!=0){
	            fact =fact * mod;
	            mod--;
	        }
	        sum = sum + fact;
	        num = num / 10;
	    }
	    if(res == sum){
	        System.out.printf("The number is strong number.");
	    }
	    else{
	    	System.out.printf("The number is not strong number.");
	    }
	}

}
