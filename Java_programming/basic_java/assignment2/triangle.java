package assignment2;

public class triangle {

	public static void main(String[] args) {
		int side1=45,side2=45,side3=90;

//	    printf("enter three sides:");
//	    scanf("%d %d %d",&side1,&side2,&side3);

	    if(side1==side2 && side2==side3)
	    	System.out.printf("Triangle is equilatrial triangle.");

	    else if(side1 == side2 || side2 == side3 || side1 == side3)
	    	System.out.printf("Triangle is isosceles triangle.");

	    else
	    	System.out.printf("Triangle is scelene triangle.");

	}

}
