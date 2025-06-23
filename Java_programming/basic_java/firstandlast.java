package type3;

public class firstandlast {

	public static void main(String[] args) {
		int num=12345;
	    operation(num);

	}

	public static void operation(int num){
	    int last,first,sum,temp;

	    temp = num;
	    last = num % 10;
	    
	    while(temp>10){
	        temp = temp / 10;
	    }

	    first = temp;
	    sum = first+last;
	    System.out.println("Addition of first and last number is "+sum);
	}
}
