#include <stdio.h>

void main(){
    int num,first=0,second=1,next;
    printf("enter the number terms:");
    scanf("%d",&num);

    for(int i = 0;i<num;i++){
        if(i<=1){
            next = i;
        }
        else{
            next = first + second;
            first = second;
            second = next;
        }
        printf("%d ",next);
    }
}