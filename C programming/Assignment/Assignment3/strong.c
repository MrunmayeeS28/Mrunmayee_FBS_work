#include <stdio.h>
void main(){
    int num,fact,sum=0,res,mod;
    printf("enter the number:");
    scanf("%d",&num);

    res = num;
    while(num!=0){
        mod = num % 10;
        fact = 1;
        while(mod!=0){
            fact =fact * mod;
            mod--;
        }
        sum = sum + fact;
        num = num / 10;
    }
    if(res == sum){
        printf("The number is strong number.");
    }
    else{
        printf("The number is not strong number.");
    }
   
}