package assignment3;

public class factorial {

	public static void main(String[] args) {
		int num=5,fact=1;
//	     printf("enter the number:");
//	     scanf("%d",&num);

	     while(num!=0){
	        fact = fact * num;
	        num--;
	     }

	     System.out.printf("factorial is %d",fact);

	}

}
