#include <stdio.h>
int pallindrome(int num);
void main(){
    int num;
    printf("Enter the number:");
    scanf("%d",&num);
    pallindrome(num);
}
int pallindrome(int num){
    int sum,rev,mod;

    rev = num;
    while(num!=0){
        mod = num % 10;
        sum = sum * 10 + mod;
        num = num / 10;
        // printf("%d\n",sum);
    }

    if(sum == rev){
        printf("The number is pallindrome number");
    }
    else{
        printf("The number is not pallindrome number");
    }
}