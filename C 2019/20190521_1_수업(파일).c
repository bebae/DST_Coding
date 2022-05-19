#include <stdio.h>

void main(){
	
	FILE *in;  // input
	int a,b;
	int i;

	//open
	in = fopen("in.txt","r");	// 파일을 열 떄는 포인터로 불러와 ("경로","목적") in 파일 필요!

	for(i=0;i<10;i++){
		fscanf(in,"%d %d",&a,&b);
		// fscanf : 개방된 파일에서 변수 단위로 입력을 받는다.
		printf("a = %d b = %d\n",a,b);
	}

	//close
	fclose(in);

}
