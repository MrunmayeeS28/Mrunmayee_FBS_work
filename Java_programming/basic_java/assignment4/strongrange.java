package ssignment4;

public class strongrange {

	public static void main(String[] args) {
		 int n=200;
//		    printf("enter the range:");
//		    scanf("%d",&n);

		    for(int start=1;start<=n;start++){
		        int sum = 0;
		        int temp = start;
		        while(temp>0){
		        int rem = temp % 10;
		        int fact = 1;
		        for(int i=rem;i>=1;i--){
		            fact = fact * i;
		        }
		        sum = sum + fact;
		        temp = temp / 10; 
		      }
		      if(start==sum)
		            System.out.printf("%d ",start);
		    }

	}

}
