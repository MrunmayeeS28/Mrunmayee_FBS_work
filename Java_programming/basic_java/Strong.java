package type4;

public class Strong {

	public static void main(String[] args) {
		int num=145;
//	    printf("enter the number:");
//	    scanf("%d",&num);
	    if(strong(num)==1)
	        System.out.printf("strong number");
	    else
	        System.out.printf("not strong number");

	}
	
	public static int strong(int num){
	    int fact,sum=0,res,mod;
	    
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
	    if(res == sum)
	        return 1;
	    return 0;
	}

}
