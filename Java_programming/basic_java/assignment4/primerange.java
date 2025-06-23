package ssignment4;

public class primerange {

	public static void main(String[] args) {
		int n=100,start,flag;
//	    printf("enter the number:");
//	    scanf("%d",&n);

	    for( start = 2;start<=n;start++){
	        flag = 0;
	        for(int i =2;i<start;i++){
	            if(start%i==0){
	                flag=1;
	                break;
	            }
	        }    
	        if(flag==0){
	            System.out.printf("%d ",start);
	        }
	    }

	}

}
