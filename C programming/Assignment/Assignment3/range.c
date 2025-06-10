// #include <stdio.h>

// void main(){
//     int num,rev,mod,sum,count;
//     char ch;
//     printf("Enter the number:");
//     scanf("%d",&num);
//     printf("In which range you want addition (o for odd and e for even)?\n");
//     printf("Enter your choice:");
//     scanf(" %c",&ch);

//     rev = 0;
//     while(num!=0){
//         mod = num % 10;
//         rev = rev * 10 + mod;
//         num = num / 10;
//     }
    
//     sum = 0;
//     count = 0;
//     if(ch == 'o'){
//         while(rev != 0){
//             if(count%2 == 0){
//                 sum = sum + (rev % 10);
//             }
//             count++;
//             rev = rev / 10;
//         }
//         printf("Addition of odd number is %d",sum);
//     }
//     else if(ch == 'e'){
//         while(rev != 0){
//             if(count%2!=0){
//                 sum = sum + (rev % 10);
//             }
//             count++;
//             rev = rev / 10;
//         }
//         printf("Addition of even number is %d",sum);
//     }
//     else{
//         printf("Please enter the valid choice!!!");
//     }
// }   



#include <stdio.h>

void main(){
    int i,start,end,sum=0;
    printf("Enter the start number:");
    scanf("%d",&start);
    printf("Enter the end number:");
    scanf("%d",&end);
    
    for(i=start;i<=end;i++){
        sum = sum + i;
    }
    printf("%d",sum);
}