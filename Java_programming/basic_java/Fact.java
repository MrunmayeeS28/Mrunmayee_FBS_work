package type4;

public class Fact {

	public static void main(String[] args) {
		int num=4;
//	    printf("enter the number:");
//	    scanf("%d",&num);
	    System.out.printf("factorial is %d",fact(num));

	}
	
	public static int fact(int num){
	    int fact =1;
	    while(num!=0){
	        fact = fact * num;
	        num--;
	    }
	    return fact;
	}

}
