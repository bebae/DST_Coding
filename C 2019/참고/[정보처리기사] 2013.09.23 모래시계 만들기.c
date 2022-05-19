#include <stdio.h>

//모래시계의 크기를 지정
//"홀수"만 입력하되 19미만이 보기 좋음
#define MAX 13

int main()
{
	int row, col, k(0);		//row=행, col=열
	int begin(0), end(0);
	int center=MAX⁄2;
	int arr[MAX][MAX]={0};

	//상하로 나누어 모래시계 모양으로 대입
	for(row=0 ; row<MAX ; row++)
	{
		//상
		if(row <= center)
		{
			begin = row; 
			end = MAX-row;
		}

		//하
		if(row > center)
		{
			begin = (MAX-1)-row; 
			end = row+1;		
		}

		//if문에 따라 대입되는 값이 변함
		for(col=begin ; col<end ; col++)
		{
			++k;
			arr[row][col] = k;
		}
	}

	//출력
	for(row=0 ; row<MAX ; row++)
	{
		for(col=0 ; col<MAX ; col++)
		{
			printf("%4d", arr[row][col]);
		}
		printf("\n");
	}

	printf("\n");

	return 0;
}