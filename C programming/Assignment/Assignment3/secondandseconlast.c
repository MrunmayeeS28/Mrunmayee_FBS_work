#include <stdio.h>
#include <math.h>
 void main(){
    int num,num1,num2,dig,sum,d,temp;
    printf("enter the number:");
    scanf("%d",&num);
    printf("enter the digit:");
    scanf("%d",&dig);

    d = pow(10,dig-1);
    printf("\n%d",d);
    temp = num / d;
    num2 = temp % 10;
    printf("\n%d",num2);

    while(num>d){
        num1 = num % 10;
        num = num / 10;
    }
    printf("\n%d",num1);
    sum = num1 + num2;
    printf("\nAddition of numbers is %d",sum);

 }