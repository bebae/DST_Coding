#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define N 3

// 3명 3과목
struct score{
	int kor;
	int eng;
	int mat;
};
struct score s[N],*t,*tt; // *t struct 둘다 같은 타입이여야 함 'int *t'는 불가능

void main(){
//	int kor[N],eng[N],mat[N];
//	int *k,*e,*m;
	int i;
	
	srand(time(NULL));

	
	printf("kor eng mat\n");

/*
	k = &kor[0]; e = &eng[0]; m = &mat[0];

	for(i=0;i<N;i++){
		kor[i] = rand()%50+51;
		eng[i] = rand()%50+51;
		mat[i] = rand()%50+51;

		printf("%3d %3d %3d\n",kor[i],eng[i],mat[i]);
	}
*/ 

	// 포인터 형식으로 변환
/*
	k = &kor[0]; e = &eng[0]; m = &mat[0];

	for(i=0;i<N;i++){
		*k = rand()%50+51;
		*e = rand()%50+51;
		*m = rand()%50+51;

		printf("%3d %3d %3d\n",*(k++),*(e++),*(m++));
	}
*/

	// 일반 구조체 형식
/*
	k = &kor[0]; e = &eng[0]; m = &mat[0];

	for(i=0;i<N;i++){
		s[i].kor = rand()%50+51;
		s[i].eng = rand()%50+51;
		s[i].mat = rand()%50+51;

		printf("%3d %3d %3d\n",s[i].kor,s[i].eng,s[i].mat);
	}
*/

	// 포인터+구조체 형식

//#1	
	// 아파트 3개를 미리 짓어놈
	t = &s[0];

	for(i=0;i<N;i++){	
		t->kor = rand()%50+51;
		t->eng = rand()%50+51;
		t->mat = rand()%50+51;
		// kor,eng,mat 방에서 t(=&s[0])번째 값을 불러옴
		
		printf("%3d %3d %3d\n",t->kor,t->eng,t->mat);
		t++;	//t(=&s[0])번째 값을 증가시켜 &s[1]번 방 값으로 넘어감
	}
	printf("-------------------\n");
	
//#2
	// 아파트를 딱 그만큼만 확보함
	tt = (struct score *)malloc(sizeof(struct score));

	for(i=0;i<N;i++){	
		tt->kor = rand()%50+51;
		tt->eng = rand()%50+51;
		tt->mat = rand()%50+51;
		
		printf("%3d %3d %3d\n",tt->kor,tt->eng,tt->mat);
		tt++;
	}
}
