package type4;

public class Range {

	public static void main(String[] args) {
		int start=1,end=10;
//	    printf("Enter the start number:");
//	    scanf("%d",&start);
//	    printf("Enter the end number:");
//	    scanf("%d",&end);
	    System.out.printf("sum is %d",range(start,end));

	}
	
	public static int range(int start,int end){
	    int i,sum=0;
	    
	    for(i=start;i<=end;i++){
	        sum = sum + i;
	    }
	    return sum;
	}

}
