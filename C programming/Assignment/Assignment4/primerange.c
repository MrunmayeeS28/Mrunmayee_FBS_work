#include <stdio.h>
 void main(){
    int n,start,flag;
    printf("enter the number:");
    scanf("%d",&n);

    for(int start = 2;start<=n;start++){
        int flag = 0;
        for(int i =2;i<start;i++){
            if(start%i==0){
                flag=1;
                break;
            }
        }    
        if(flag==0){
            printf("%d ",start);
        }
    }
 } 