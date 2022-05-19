#include <stdio.h>

void main(){
	
	int x=10;
	int y=9;
	int *z,i;
	int *px, *py;		//변수명 주소

	z = &x;
	printf(" X : %d \n&X : %d \n Z : %d \n*Z : %d\n&z : %d\n\n",x,&x,z,*z,&z);
	
	z = &y;
	printf(" Y : %d \n&Y : %d \n Z : %d \n*Z : %d\n\n",y,&y,z,*z);

	px = &x;
	py = &y;

	// (*px)++; x += 1;
	// *px++;	주소값++ ? 오류


	// 포인터 연산
	i = *px + *py;
	printf("*px : %d\n*py : %d\nsum : %d\n\n",*px,*py,i);

}
 