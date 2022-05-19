#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define N 10
#define True 1		// sort 사용시 
#define False 0		// sort 사용시

void bubble_sort(int x[]);
void main(){
	// 10개 정수
	// 배열,포인터,정렬,구조체,랜덤 var

	// #1	불필요한 메모리 확보로 성능저하 일어남
	int x[N];
	int i;

	srand(time(NULL));

	for(i=0;i<N;i++){
		x[i] = rand()%50+1;		// 1~50
		printf("%d ",x[i]);

	}
	printf("\n");
	bubble_sort(x);
	
	printf("----------정렬값----------\n");
	for(i=0;i<N;i++){
		printf("%d ",x[i]);
	}
	printf("\n\n");
}

void bubble_sort(int x[]){
	// 50 30 2 12 1
	int change;
	int i, tmp;
	
	change = True;	// 실수잦음
	while(change){
		change = False;
		for(i=0;i<N-1;i++){
			if(x[i]>x[i+1]){
			  tmp = x[i];
			  x[i] = x[i+1];
			  x[i+1] = tmp;
				
				
			  change = True;
			}	// if

		}	// for4

	}	//while

}

