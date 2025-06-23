package type3;

public class factorial {

	public static void main(String[] args) {
		int num=5;
//	    printf("enter the number:");
//	    scanf("%d",&num);
	    fact(num);

	}
	public static void fact(int num){
	    int fact =1;
	    while(num!=0){
	        fact = fact * num;
	        num--;
	    }
	    System.out.println("factorial is "+fact);
	}

}
