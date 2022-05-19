#include <stdio.h>


int Hanoi(int from, int to, int n){ // from번 기둥에서 to번 기둥으로 n개의 원반을 이동.
		if(n == 1){
			printf("%d번 기둥에서 %d번 기둥으로 이동\n", from, to);
			return 0;
		}
		Hanoi(from, 6-from-to, n-1);
		printf("%d번 기둥에서 %d번 기둥으로 이동\n", from, to);
		Hanoi(6-from-to, to, n-1);
		return 0;
	}
void hanoi_tower(int n, char from, char tmp, char to){
	if(n==1) printf("원판   1을 %3c 에서 %3c으로 이동.\n",from,to);
	else {
		hanoi_tower(n-1,from,to,tmp);
		printf("원판 %3d를 %3c 에서 %3c으로 이동.\n",n,from,to);
		hanoi_tower(n-1,tmp,from,to);
	}
}

void main(){

//	Hanoi();
	hanoi_tower(4,'A','B','C');	
}