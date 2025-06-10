#include <stdio.h>
void main(){
    int num,res,i = 1;
    printf("enter the number:");
    scanf("%d",&num);
    while(i<=10){
        res = num * i;
        printf("%d * %d = %d\n",num,i,res);
        i++;
    }
    
}