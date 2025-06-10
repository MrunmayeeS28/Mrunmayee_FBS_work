#include <stdio.h>
#include <stdlib.h>
void store(int*,int);
void display(int*,int);
void sumarray(int*,int);
void main(){
    int size;
    printf("Enter the size of array:");
    scanf("%d",&size);
    int* arr=(int*)malloc(sizeof(int)*size);
    store(arr,size);
    display(arr,size);
    sumarray(arr,size);
}
void store(int*arr,int size){
    printf("enter the elements:");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
}    
void display(int*arr,int size){
    printf("Array is:");
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
}
void sumarray(int*arr,int size){
    int sum=0;
    for(int i=0;i<size;i++){
        sum = sum + arr[i];
    }
    printf("Addition of array is %d",sum);
}