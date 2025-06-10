#include <stdio.h>

void main(){
    int num,sum,rev,mod;
    printf("Enter the number:");
    scanf("%d",&num);

    rev = num;
    while(num!=0){
        mod = num % 10;
        sum = sum * 10 + mod;
        num = num / 10;
        printf("%d\n",sum);
    }

    if(sum == rev){
        printf("The number is pallindrome number");
    }
    else{
        printf("The number is not pallindrome number");
    }
}