#include <stdio.h>

void opearation();
void main(){
    opearation();
}
void operation(){
    int num,last,first,sum,temp;
    printf("Enter the number:");
    scanf("%d",&num);

    temp = num;
    last = num % 10;
    
    while(temp>10){
        temp = temp / 10;
    }

    first = temp;
    sum = first+last;
    printf("Addition of first and last number is %d",sum);
}