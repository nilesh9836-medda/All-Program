#include<stdio.h>

int main() {
	int r;
	printf("Enter numbers of rows:");
	scanf("%d", &r);
	for(int i=1; i<=r; i++){
		for(int k=r-1; k>=i; k--){
			printf(" ");
		}
		for(int j=1; j<=(2*i)-1; j++){
			printf("*");
		}
		printf("\n");
	}

	return 0;
}
