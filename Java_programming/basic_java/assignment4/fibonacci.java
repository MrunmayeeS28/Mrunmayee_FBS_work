package ssignment4;

public class fibonacci {

	public static void main(String[] args) {
		int num=10,first=0,second=1,next;
//	    printf("enter the number terms:");
//	    scanf("%d",&num);

	    for(int i = 0;i<num;i++){
	        if(i<=1){
	            next = i;
	        }
	        else{
	            next = first + second;
	            first = second;
	            second = next;
	        }
	        System.out.printf("%d ",next);
	    }
	}

}
