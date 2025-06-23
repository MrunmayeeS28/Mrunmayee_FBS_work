package type4;

public class Amstrong {

	public static void main(String[] args) {
		int num=153;
//	    printf("Enter the number:");
//	    scanf("%d",&num);
	    if(armstrong(num)==1)
	        System.out.printf("Number is armstrong");
	    else
	    	System.out.printf("Number is not armstrong");

	}
	
	public static int armstrong(int num){
        
        int temp = num;
        int count = 0;
        while(temp!=0){
        temp = temp /10;
        count++;
        }
        temp = num;
        int sum=0;
            while(temp>0){
            int rem = temp % 10;
            int pow = 1;
            for(int i =1;i<=count;i++){
            pow = pow * rem; 
            }
            sum = sum + pow;
            temp = temp / 10;
        }
        if(sum==num)
              return 1;
        return 0;
}

}
