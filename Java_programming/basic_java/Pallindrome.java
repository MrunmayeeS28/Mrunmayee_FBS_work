package type4;

public class Pallindrome {

	public static void main(String[] args) {
		int num=1221;
//		System.out.printf("Enter the number:");
//	    scanf("%d",&num);
	    if(check(num)==1)
	        System.out.printf("pallindrome number");
	    else    
	    	System.out.printf("not pallindrome number");

	}

	public static int check(int num){
	    int sum=0,rev,mod;
	  
	    rev = num;
	    while(num!=0){
	        mod = num % 10;
	        sum = sum * 10 + mod;
	        num = num / 10;
	        // printf("%d\n",sum);
	    }

	    if(sum == rev)
	        return 1;
	    return 0;
	}
}
