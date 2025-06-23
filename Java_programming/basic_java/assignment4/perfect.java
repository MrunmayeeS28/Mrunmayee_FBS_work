package ssignment4;

public class perfect {

	public static void main(String[] args) {
		int num=10,sum;
//	    printf("enter the range:");
//	    scanf("%d",&num);

	    for(int start=1;start<=num;start++){
	        sum = 0;
	        for(int i=1;i<start;i++){ 
	            if(start%i==0){
	               sum = sum + i;
	            }   
	        }
	        if(start==sum)
	            System.out.printf("%d ",start);
	    }

	}

}
