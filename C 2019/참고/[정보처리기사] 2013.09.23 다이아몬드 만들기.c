#include <stdio.h>

//다이아몬드의 크기를 지정
//"홀수"만 입력하되 19미만이 보기 좋음
#define MAX 13

int main()
{
	int row, col, k(0);		//row=행, col=열
	int begin(0), end(0);
	int center=MAX⁄2;
	int arr[MAX][MAX]={0};

	//대입
	for( row=0 ; row<MAX ; row++ )
	{
		//상
		if(row <= center)
		{
			begin = center -row ;
			end = row+center ;
		}
		
		//하
		if(row > center)
		{
			begin = row-center ;
			//끝 값이 MAX의 크기에 비례하여 대입
			end = (MAX+center-1)-row ;
		}

		//상하에 따라 대입
		for( col=begin ; col<=end ; col++ )
		{
			++k;
			arr[row][col] = k;
		}
	}

	//출력
	for( row=0 ; row<MAX ; row++ )
	{
		for( col=0 ; col<MAX ; col++ )
		{
			printf( "%4d", arr[row][col]);
		}
		printf( "\n" );
	}

	printf( "\n" );

	return 0;
}