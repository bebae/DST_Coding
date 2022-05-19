#include <stdio.h>
#define N 5

void main(){
	
	// 5개 정수

	int i,j;
	int x[5] = {100,1,5,30,77};
	int *p;

	//for(i=0;i<N;i++){
	//	printf("%d ",x[i]);
	//}
	//printf("\n");

	p = &x[0];
	for(i=0;i<N;i++){
		printf("%d ",*(p+i));	
	//	p++;	//next 주소값	// 2개 중 상관없음
	}
	printf("\n\n");

}
