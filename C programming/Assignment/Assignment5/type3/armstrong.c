#include <stdio.h>

void armstrong(int num);
void main(){
    int num;
    printf("Enter the number:");
    scanf("%d",&num);
    armstrong(num);
}
void armstrong(int num){
    int sum = 0,check,mod;
    // printf("Enter the number:");
    // scanf("%d",&num);
    check = num;
    while(num!=0){
        mod = num % 10;
        mod = mod * mod * mod;
        sum = sum + mod;
        num = num / 10;
    }
    
    if(check == sum){
        printf("Number is armstrong");
    }
    else{
        printf("number is not armstrong");
    }
}