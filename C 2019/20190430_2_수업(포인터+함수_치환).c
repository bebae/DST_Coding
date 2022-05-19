#include <stdio.h>

void swap(int*,int*);
void main(){
	
	// X ~ Y 까지 합 구하기
	// X < Y

	int x=0,y=0;
	int i;
	int sum=0;

	printf("X: ");
	scanf("%d",&x);

	printf("Y: ");
	scanf("%d",&y);
	
	if(x>y){	
	// 스왑 할 때 필요한 것이 포인터!
		swap(&x,&y);
	}

	
	for(i=x;i<y;i++){
		sum += i;
	}
	printf("sum = %d\n",sum);

}
// 스왑 할 때 필요한 것이 포인터!
// 포인터를 쓰지 않으면 swap함수 안에서만 바꾸고 main으로 반환되지 않는다
void swap(int *x, int *y){
			// x=7  y=3
	*x=*x+*y;	// 7+3  = x=10
	*y=*x-*y;	// 10-3 = y=7
	*x=*x-*y;	// 10-7 = x=3
}