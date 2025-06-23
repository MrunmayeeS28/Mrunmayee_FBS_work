package assignment3;

public class prime {

	public static void main(String[] args) {
		int num=7,i=2,flag=0;
//	    printf("Enter the number:");
//	    scanf("%d",&num);
	    while(i<num){
	        if(num%i ==0){
	            flag = 1;
	            break;
	        }
	        i++;
	    }
	    if(flag==0){
	        System.out.printf("This is prime number");
	    }
	    else{
	        System.out.printf("This is not prime number");
	    }

	}

}
