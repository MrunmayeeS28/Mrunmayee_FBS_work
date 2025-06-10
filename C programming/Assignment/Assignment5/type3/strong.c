#include <stdio.h>
int strong(int*);
void main(){
    int num;
    printf("enter the number:");
    scanf("%d",&num);
    if(strong(&num)==1){
        printf("The number is strong number.");
    }
    else{
        printf("The number is not strong number.");
    }
} 
int strong(int*num){
    int fact,sum=0,res,mod;
    res = *num;
    while(*num!=0){
        mod = *num % 10;
        fact = 1;
        while(mod!=0){
            fact =fact * mod;
            mod--;
        }
        sum = sum + fact;
        *num = *num / 10;
    }
    if(res == sum)
        return 1;
    return 0;
   
}