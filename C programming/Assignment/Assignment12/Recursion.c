#include<stdio.h>
void fun(int);

int main(){
	
	int n=1;
	fun(n);
	printf("\n %d",n);
}

void fun(int n){
	if(n==10){
		printf("\n %d",n);
		return;
	}
	
	printf("\n %d",n);
	n++;
	fun(n);
	printf("\n %d",n);
	
}