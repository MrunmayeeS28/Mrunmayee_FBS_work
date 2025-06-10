#include <stdio.h>

void main(){
    int num,sum;
    printf("enter the range:");
    scanf("%d",&num);

    for(int start=1;start<=num;start++){
        sum = 0;
        for(int i=1;i<start;i++){ 
            if(start%i==0){
               sum = sum + i;
            }   
        }
        if(start==sum)
            printf("%d ",start);
    }
}                  
















    
