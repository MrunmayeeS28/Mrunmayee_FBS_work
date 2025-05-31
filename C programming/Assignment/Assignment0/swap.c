#include <stdio.h>
 void main(){
    int a = 100, b =200 ,c;
    c = a - b; // 100 - 200 = -100
    b = b + c; // 200 + (-100) = 100
    a = a - c; // 100 - (-100) = 200
    printf("Given are a=100 and b=200 after swapping a=%d and b=%d",a,b);

 }