package assignment3;

public class firstandlast {

	public static void main(String[] args) {
		int num=1234,last,first,sum,temp;
//	    printf("Enter the number:");
//	    scanf("%d",&num);

	    temp = num;
	    last = num % 10;
	    
	    while(temp>10){
	        temp = temp / 10;
	    }

	    first = temp;
	    sum = first+last;
	    System.out.printf("Addition of first and last number is %d",sum);

	}

}
