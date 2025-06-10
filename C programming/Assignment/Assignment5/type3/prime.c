#include <stdio.h>

void prime(int num);
void main(){
    int num;
    printf("Enter the number:");
    scanf("%d",&num);
    prime(num);
}
void prime(int num){
    int i=2,flag=0;

    while(i<num){
        if(num%i ==0){
            flag = 1;
            break;
        }
        i++;
    }
    if(flag==0){
        printf("This is prime number");
    }
    else{
        printf("This is not prime number");
    }
}
