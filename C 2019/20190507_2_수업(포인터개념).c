#include <stdio.h>

void main(){
	
	int x[5] = {1,2,7,4,5};

	int *y,*z;		// 정수형 포인터 변수
	int *front,*real;
	int *f,*r,*p;
	
	// *y -> y 되기 위해서는
	// 메모리를 할당 
//	y = (int  *)malloc(sizeof(int));  // os가 처리=그만큼 처리부담
	// 처음부터 너무 큰 메모리를 확보하면 문제점이 많음
	// 그래서 메모리를 확장하는 방법 save 메모리 관리
	// 그것이 포인터 *p 값을 직접이 아닌 주소값만 가져와 메모리 부담을 줄임

	//	y = &x[0];	// y -> &x[0]	같다 보다는 가르키는 느낌
	//	z = y;		// z -> y		
	
	// front = &x[0];	//front : 배열 중 가장 첫번째 보통 움직이지 않음
	// real = front;	//real	: 배열 중 가장 마지막 주로 많이 움직임


// for문 보다 효율적인 구조
	f = &x[0];
	r = &x[4];

	p = f;
	while(p != r){
		if(*p == 7){
		  *p = -1;	
		}
		p++;
	}

}
