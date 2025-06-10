#include <stdio.h>
#include <stdlib.h>

void store(int*,int);
void display(int*,int);
void merge(int*,int,int*,int,int*,int);
void main(){
    // int arr[10],brr[10];
    int size1,size2;
    printf("enter the size of array 1:");
    scanf("%d",&size1);
    printf("enter the size of array 2:");
    scanf("%d",&size2);
    int size3 = size1+size2;
    int* arr=(int*)malloc(sizeof(int)*size1);
    int* brr=(int*)malloc(sizeof(int)*size2);
    int* crr=(int*)malloc(sizeof(int)*size3);
    store(arr,size1);
    display(arr,size1);
    store(brr,size2);
    display(brr,size2);
    merge(arr,size1,brr,size2,crr,size3);
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
void merge(int*arr,int size1,int*brr,int size2,int*crr,int size3){
	
//    for(int i=0;i<size;i++){
//        crr[i]=arr[i];
//    }
//    for(int i=size1,j=0;i<size2;i++,j++){
//    	crr[i]=brr[j];
//	}
	for(int i=0;i<size1;i++){
			crr[i]=arr[i];
	}
	for(int i=0;i<size3;i++){
			crr[size1+i]=brr[i];
	}
	
    printf("elements of merge array:");
    for(int i=0;i<size3;i++){
        printf("%d ",crr[i]);
    }

}