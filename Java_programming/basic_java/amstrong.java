package type3;

public class amstrong {

	public static void main(String[] args) {
		int num=153;
		System.out.println("Enter the number:");
//	    scanf("%d",&num);
	    armstrong(num);

	}
	public static void armstrong(int num){
	    int sum = 0,check,mod;
	    // printf("Enter the number:");
	    // scanf("%d",&num);
	    check = num;
	    while(num!=0){
	        mod = num % 10;
	        mod = mod * mod * mod;
	        sum = sum + mod;
	        num = num / 10;
	    }
	    
	    if(check == sum){
	    	System.out.println("Number is armstrong");
	    }
	    else{
	    	System.out.println("number is not armstrong");
	    }
	}
}
