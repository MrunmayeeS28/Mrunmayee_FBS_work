package assignment3;

public class pallindrome {

	public static void main(String[] args) {
		int num=121,sum=0,rev,mod;
//	    printf("Enter the number:");
//	    scanf("%d",&num);

	    rev = num;
	    while(num!=0){
	        mod = num % 10;
	        sum = sum * 10 + mod;
	        num = num / 10;
	        System.out.printf("%d\n",sum);
	    }

	    if(sum == rev){
	    	System.out.printf("The number is pallindrome number");
	    }
	    else{
	    	System.out.printf("The number is not pallindrome number");
	    }

	}

}
