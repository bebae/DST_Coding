#include <stdio.h>
#define N 3

// 과목 3 kor eng mat
// 학생 3명
// max min total ave
// 함수

void sungjuk();
int fined_ave(int k,int e,int m);

struct sung{
	int kor;
	int eng;
	int mat;
	int ave;
};
struct sung s[N];

void main(){
	int sel;
	
	while(1){
		printf("┌─────────────────┐\n");
		printf("│  1: 성적 2: 함수연습 ... 0: 종료 │\n");
		printf("│           you select :           │\n");
		printf("└─────────────────┘\n");
		scanf("%d",&sel);
		if(sel == 1){
			sungjuk();	//함수호출
		}else 
			break;

	}
	
}

void sungjuk(){		//함수 정의
	int i;


	// 입력
	printf("     성적 입력\n");
	for(i=0;i<N;i++){
		printf("───────────────\n");
		printf("[%d]번째 학생\n",i+1);
		printf("───────────────\n");

		printf("kor : ");
		scanf(" %d",&s[i].kor);
		printf("eng : ");
		scanf(" %d",&s[i].eng);
		printf("mat : ");
		scanf(" %d",&s[i].mat);
	
		s[i].ave = fined_ave(s[i].kor,s[i].eng,s[i].mat);
	}

	for (i=0;i<N;i++){
		printf("───────────────────\n");
		printf("  [%d]번째 학생\n",i+1);
		printf(" kor  eng  mat  ave\n");
		printf("%4d %4d %4d %4d\n",s[i].kor,s[i].eng,s[i].mat,s[i].ave);
		printf("───────────────────\n");
	}
}

int fined_ave(int k,int e,int m){	
	int a=(k+e+m)/3;

	return a;
}
