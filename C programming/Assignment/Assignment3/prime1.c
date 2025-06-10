#include <stdio.h>

void main(){
    int num,i=2,flag=0;
    printf("Enter the number:");
    scanf("%d",&num);
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