#include <stdio.h>

void main(){
    int age;
    printf("enter your age:");
    scanf("%d",&age);
    if(age>=18)
        printf("Your are eligible for voting");
    else
    printf("Your are not eligible for voting");

}