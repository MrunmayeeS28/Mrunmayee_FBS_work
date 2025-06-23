package type4;

public class Firstandlast {

	public static void main(String[] args) {
		int num=234531;
//	    printf("Enter the number:");
//	    scanf("%d",&num);
	    System.out.printf("addition of first and last digit is %d",add(num));

	}
	
	public static int add(int num){
	    int last,first,sum,temp;
	    temp = num;
	    last = num % 10;
	    
	    while(temp>10){
	        temp = temp / 10;
	    }

	    first = temp;
	    sum = first+last;
	    return sum;
	}

}
