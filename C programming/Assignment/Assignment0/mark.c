#include <stdio.h>
void main(){
    int sub1 = 89,sub2 = 77,sub3 = 93,sub4 = 91,sub5 = 84,total =500;
    float per;
   
    int obt_marks = sub1 + sub2 + sub3 + sub4 + sub5;
    printf("Total marks obtained is %d",obt_marks);
    per = obt_marks * 100.0 / total ;
    printf("\nTotal percentage is %.2f%%",per);
}