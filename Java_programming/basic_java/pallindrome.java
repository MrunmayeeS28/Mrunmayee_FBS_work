package type3;

public class pallindrome {

	public static void main(String[] args) {
		int num=121;
//	    printf("Enter the number:");
//	    scanf("%d",&num);
	    pallindrome(num);

	}

	public static void pallindrome(int num){
	    int sum=0,rev,mod;

	    rev = num;
	    while(num!=0){
	        mod = num % 10;
	        sum = sum * 10 + mod;
	        num = num / 10;
	        // printf("%d\n",sum);
	    }

	    if(sum == rev){
	        System.out.println("The number is pallindrome number");
	    }
	    else{
	    	System.out.println("The number is not pallindrome number");
	    }
}
}