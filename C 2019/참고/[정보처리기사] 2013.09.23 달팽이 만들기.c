#include<stdio.h>

//달팽이의 크기를 지정
//홀수를 입력하되 19미만이 보기 좋음
#define MAX 7

int main()
{
	int i(0), j(-1), k(0), p, n(MAX);		//i=행, j=열, k=대입값
	int sw(1);
	int arr[MAX][MAX]={0};

	//달팽이 모양으로 대입
	while( n>0 )
	{
		//열 증가 및 감소
		for( p=0 ; p<n ; p++ )
		{
			j = j + sw;
			arr[i][j] = ++k;
		}
		
		//달팽이를 채워감에 따라 감소하는 수
		--n;
		
		//행 증가 및 감소
		for( p=0 ; p<n ; p++ )
		{
			i = i + sw;
			arr[i][j] = ++k;
		}

		//sw값이 1, -1을 반복
		sw = sw*(-1);
	}

	//출력
	for( i=0 ; i<MAX ; i++ )
	{
		for( j=0 ; j<MAX ; j++ )
		{
			printf("%4d", arr[i][j]);
		}
		printf("\n");
	}
	
	printf("\n");

	return 0;
}