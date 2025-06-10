#include <stdio.h>
//  void main(){
//     char ch, a ,e,i ,o ,u;
//     printf("enter the charater:");
//     scanf("%c",&ch);
//     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'|| ch =='I' || ch =='O' || ch == 'U')
//        printf("Given charater is vowel");
//     else if(ch >= 'A' && ch <= 'z')
//        printf("Given charater is consonent");
//     else
//        printf("it not alphabet");
//  }  

 //MAKE CAPITAL TO SMALL AND SMALL TO CAPITAL.
 void main(){
     char ch;
     printf("Enter the character:");
     scanf("%c",&ch);
     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'|| ch =='I' || ch =='O' || ch == 'U')
         printf("Given charater is vowel\n");
     else
         printf("It is consonent\n");
         
      if(ch>=97 && ch<=122){
            ch = ch - 32;
            printf("%c It is converted into uppercase",ch);
         }
      else if(ch>=65 && ch<=90) {
            ch = ch + 32;
            printf("%c It is converted into lowercase",ch);
         }
      else if(ch>='0' && ch<='9'){
            printf("It is a digit");
         }
      else
               printf("It is a special symbol. ");
}