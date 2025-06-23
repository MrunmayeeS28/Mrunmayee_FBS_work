package assignment3;

public class table {

	public static void main(String[] args) {
		int num=5,res,i = 1;
//	    printf("enter the number:");
//	    scanf("%d",&num);
	    while(i<=10){
	        res = num * i;
	        System.out.printf("%d * %d = %d\n",num,i,res);
	        i++;
	    }
	}

}
