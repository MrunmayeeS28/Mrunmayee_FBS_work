#include <stdio.h>

void operation(int*);
void main(){
    int num;
    printf("Enter the number:");
    scanf("%d",&num);
    operation(num);
}
void operation(int num){
    int last,first,sum,temp;

    temp = num;
    last = num % 10;
    
    while(temp>10){
        temp = temp / 10;
    }

    first = temp;
    sum = first+last;
    printf("Addition of first and last number is %d",sum);
}