#define N 10
#include <stdio.h>

void swap(int*,int*);
void main(){
	
	// 10개의 정수를 정렬
	// 100 5 70 3 90 55 40 1 77 99
	
	int i,j;
	int x[N] = {100,5,70,3,90,55,40,1,77,99};


	printf("──────────────\n");
	for(i=0;i<N;i++){
		printf("%d ",x[i]);
	}
	printf("\n──────────────\n");

	for(i=0;i<(N-1);i++){
		for(j=0;j<(N-1);j++){		// N-1 이유: 차례대로 비교할 때 9번하고 마지막 숫자는 굳이 비교하지 않아도 정렬이 되기때문이지만 N(10) 이여도 괜찮
			if(x[j]>x[j+1]){
				swap(&x[j],&x[j+1]);
			}
		}
	}

	printf("──────────────\n");
	for(i=0;i<N;i++){
		printf("%d ",x[i]);
	}
	printf("\n──────────────\n");

}

void swap(int *x, int *y){
			// x=7  y=3
	*x=*x+*y;	// 7+3  = x=10
	*y=*x-*y;	// 10-3 = y=7
	*x=*x-*y;	// 10-7 = x=3
}
