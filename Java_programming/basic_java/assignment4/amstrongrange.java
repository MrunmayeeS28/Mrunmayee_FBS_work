package ssignment4;

public class amstrongrange {

	public static void main(String[] args) {
		int num,rem,temp,n=200;
//	    printf("enter the number:");
//	    scanf("%d",&n);
	    for(int start =1;start<=n;start++){
	    num = start;
	    temp = num;
	    int count = 0;
	    while(temp!=0){
	        temp = temp /10;
	        count++;
	    }
	    temp = num;
	    int sum=0;
	    while(temp>0){
	        rem = temp % 10;
	        int pow = 1;
	        for(int i =1;i<=count;i++){
	            pow = pow * rem; 
	        }
	        sum = sum + pow;
	        temp = temp / 10;
	    }
	    if(sum==num)
	        System.out.printf("\n%d",start);  
	  }
	}

}
