package assignment2;

public class discount {

	public static void main(String[] args) {
		int discount;
	    double total_amount,price =750;
	    char category='y';
//	    printf("Enter the price:");
//	    scanf("%d",&price);
//	    printf("Are you a student?(y/n):");
//	    scanf(" %c",&category);
	    if(category =='y'){
	        if(price>500){
	            total_amount = price - (price*20.0)/100;
	        }
	        else{
	            total_amount = price - (price*10.0)/100;
	        }
	        System.out.printf("You have to pay %.2f",total_amount);
	    }
	    else if(category == 'n'){
	        if(price>600){
	            total_amount = price - (price*15.0)/100;
	            System.out.printf("You have to pay %.2f",total_amount);
	        }
	        else{
	        	System.out.printf("You are not eligible for discount");
	        }
	    }
	    else{
	    	System.out.printf("Enter valid answer...");
	    }

	}

}
