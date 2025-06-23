package assignment3;

public class range {

	public static void main(String[] args) {
		int i,start=1,end=10,sum=0;
//	    printf("Enter the start number:");
//	    scanf("%d",&start);
//	    printf("Enter the end number:");
//	    scanf("%d",&end);
	    
	    for(i=start;i<=end;i++){
	        sum = sum + i;
	    }
	    System.out.printf("%d",sum);

	}

}
