#include <stdio.h>
 void main(){
     int num,fact=1;
     printf("enter the number:");
     scanf("%d",&num);

     while(num!=0){
        fact = fact * num;
        num--;
     }

     printf("factorial is %d",fact);
 }