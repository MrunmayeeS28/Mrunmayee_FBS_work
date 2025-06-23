package assignment2;

public class operation {

	public static void main(String[] args) {
		int a=10,b=20;
	    char op='*';
//	    printf("\nEnter the value for a:");
//	    scanf("%d",&a);
//	    printf("\nEnter the value for b:");
//	    scanf("%d",&b);
//	    printf("\n+ \n- \n* \n/ \n%%");
//	    printf("\nChoose one operator form the list of operators:");
//	    // fflush(stdin);  //it is used to clear the buffer 
//	    scanf(" %c",&op);

	    if(op == '+'){
	        int sum = a + b;
	        System.out.printf("Addition of a and b is: %d",sum);
	    }
	    else if(op == '-'){
	        int sub = a - b;
	        System.out.printf("Substraction of a and b is:%d",sub);
	    }
	    else if(op == '*'){
	        int mul = a * b;
	        System.out.printf("Multiplication of a and b is:%d",mul);
	    }
	    else if(op == '/'){
	        double div = (a *1.0)/ b;
	        System.out.printf("Division of a and b is:%.2f",div);
	    }
	    else if(op == '%'){
	        int mod = a % b;
	        System.out.printf("Modulo of a and b:%d",mod);
	    }
	    else{
	    	System.out.printf("Enter the valid operator");
	    }

	}

}
