#include <stdio.h>
#define N 3

// 과목 3 kor eng mat
// 학생 3명
// max min total ave
// 함수


void sungjuk();
int fined_ave(int k,int e,int m);


int fined_ave(int k,int e,int m){
	
	int a=(k+e+m)/3;

	return a;
}

void sungjuk(){		//함수 정의
	int i;
	int kor[N],eng[N],mat[N];
	int ave[N]={ 0,0,0},tot[N];
	int sel;


	// 입력
	printf("-----성적 입력-----\n");
	for(i=0;i<N;i++){
		printf("[%d]번째 학생\n",i+1);

		printf("kor : ");
		scanf(" %d",&kor[i]);

		printf("eng : ");
		scanf(" %d",&eng[i]);
	
		printf("mat : ");
		scanf(" %d",&mat[i]);
	
		ave[i] = fined_ave(kor[i],eng[i],mat[i]);
	}

	for (i=0;i<N;i++){
		printf("[%d]번째 학생\n",i+1);

		printf("%4d %4d %4d %4d\n",kor[i],eng[i],mat[i],ave[i]);
	}
}



void main(){
	int i;
	int kor[N],eng[N],mat[N];
	int ave[N]={ 0,0,0},tot[N];
	int sel;
	
	while(1){
		printf(" 1: 성적 2: 함수연습 ... 5: 종료\n");
		printf(" you select : ");
		scanf("%d",&sel);
		if(sel == 1){
			sungjuk();	//함수호출
		}else 
			break;

	}
	
}


