package type4;

public class Prime {

	public static void main(String[] args) {
		int num=7;
//	    printf("Enter the number:");
//	    scanf("%d",&num);
	    if(prime(num)==0)
	        System.out.printf("prime number");
	    else
	    	System.out.printf("not prime");

	}
	
	public static int prime(int num){
	    int i=2,flag=0;

	    while(i<num){
	        if(num%i ==0){
	            flag = 1;
	            break;
	        }
	        i++;
	    }
	    return flag;
	}

}
