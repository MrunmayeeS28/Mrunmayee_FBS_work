#include <stdio.h>

void main(){
    int num,perfect,sum=0,i=1;
    printf("Enter the number:");
    scanf("%d",&num);

    perfect = num;

    while(i<=num/2){  //need to check only half of the number 
        if(num%i==0){
            sum = sum + i;
        }
        i++;
    }
    

    if(perfect==sum){
        printf("number is perfect\n");
    }
    else{
        printf("number is not perfect\n");
    }
}