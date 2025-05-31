#include <stdio.h>
void main(){
    int given_min = 568,hr,min;
    hr = given_min / 60;
    min = given_min % 60;
    printf("Given minutes converted into %d hours and %d minutes.",hr,min);
}
