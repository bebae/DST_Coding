#include <stdio.h>
#define N 3

void main(){
	/*	3명 3과목
		array -> p+array -> struct -> p+struct
	
	*/
	
	int i;
	int x[5] = {1,2,3,4,5};
				// x[0]=1,x[1]=2 ... x[4]=5
	int *p;		// 인구 조사원
	
	p = &x[0];	// 주소위치 이동
				// *p = 1
	// p = p+2;	// *p = 3
	// p = p+3;	// *p = 3 = x[2] -> +3 -> *p = null = x[5] 
	

	// if(p != null)
	// while(p != null)

// #1

	for(i=0;i<5;i++){
		printf("%d ",x[i]);
	}
	printf("\n────────────\n");


// #2

	for(i=0;i<5;i++){			// 포인터에선 잘 쓰지 않음
		printf("%d ",*(p+i));
		// p += 1; 불러올땐 *p
	}
	printf("\n────────────\n");
	

// #3	가장 많은 error가 발생하는 부분

	while(p != NULL){			// 포인터에선 주로 씀 'p != null'
		printf("%d ",*(p++));
	}
	printf("\n────────────\n");
	p = 0;

}
