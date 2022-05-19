#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define N 3

void main(){
	
	int num;
	int i;
	int luck[N];
	int count=3;	//선물 수
	int yn;		// 당첨여부
	int su=0;	// 손객 수

/*
	int sum=0,ave=0;
	int max=0,min=1000;
*/
	
	srand(time(NULL));

/*
	for (i=0;i<N;i++){

		x[i] = rand() % 100+1;
		printf("X[%02d] : %d\n",i+1,x[i]);


	}
	
	// 평균, 최대, 최소
	
	for (i=0;i<N;i++){
		sum += x[i];
	}
	ave  = sum/N;
	
	printf("---------------\n");
	printf("sum = %d\n",sum);
	printf("ave = %d\n",ave);
	
	//max,min
	for (i=0;i<N;i++){
		if (max<x[i]){
			max = x[i];
		}
		if (min>x[i]){
			min = x[i];
		}
	}
	printf("---------------\n");
	printf("max = %d\n",max);
	printf("min = %d\n",min);
*/


	printf("행운의 숫자 입력\n");
	for (i=0;i<N;i++){
		printf("[%d] :",i+1);
		scanf("%d",&luck[i]);
	}

	count=3;
	while (1){
		yn=0;
		su++;
		num = rand() % 101;		///////////////////////// 핵심///////////////////////////
		for (i=0;i<N;i++){		// 랜덤 숫자와 당첨번호 확인
			if (num==luck[i]){
				yn = 1;
				printf("congratulation!\n");
				count--;
				break;
			} 
		}
		if (yn == 0) {
			printf("꽝! ");
			if(su%10 == 0) printf("\n");
		}
		if (count <= 0) break;
	}
	printf("방문한 고객 수 : %d\n",su);

	





}
