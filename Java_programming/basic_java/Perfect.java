package type4;

public class Perfect {

	public static void main(String[] args) {
		int num=28;
//	    printf("Enter the number:");
//	    scanf("%d",&num);
	    if(perfect(num)==1)
	        System.out.printf("perfect number");
	    else    
	    	System.out.printf("not perfect number");

	}
	
	public static int perfect(int num){
	    int perfect,sum=0,i=1;

	    perfect = num;

	    while(i<=num/2){  //need to check only half of the number 
	        if(num%i==0){
	            sum = sum + i;
	        }
	        i++;
	    }
	    if(perfect==sum)
	        return 1;

	    return 0;
	}

}
