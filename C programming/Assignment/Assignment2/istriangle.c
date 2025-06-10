#include <stdio.h>
//herre we can use angle also.
 void main(){
    int side1,side2,side3;

    printf("enter three sides:");
    scanf("%d %d %d",&side1,&side2,&side3);

    if(side1==side2 && side2==side3)
        printf("Triangle is equilatrial triangle.");

    else if(side1 == side2 || side2 == side3 || side1 == side3)
        printf("Triangle is isosceles triangle.");

    else
        printf("Triangle is scelene triangle.");
 }