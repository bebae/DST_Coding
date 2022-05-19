//#2 3과목 점수를 읽고 계산 출력하기
// file 사용 read compute write
// array -> structure -> pointer 순으로 고난이도
#include <stdio.h>

void main(){
	
	FILE *in;	// input
	int kor,eng,mat;
	int i;
	int tot=0,ave=0;
	char *grade="F";


	//open
	in = fopen("in.txt","r");


	printf("kor eng mat  tot ave grade\n");
	for(i=0;i<10;i++){		//10명
		fscanf(in,"%d %d %d",&kor,&eng,&mat);
		tot = kor+eng+mat;
		ave = tot/3;

		if(ave >= 90) grade = "A";
		else if(ave>=80) grade = "B";
		else if(ave>=70) grade = "C";
		else if(ave>=60) grade = "D";
		else grade = "F";

		printf("%3d %3d %3d ",kor,eng,mat);
		printf(" %3d %3d %3s\n",tot,ave,grade);
		printf("-------------------------\n");
		

	}
	

	//close
	fclose(in);

	// 희망 출력값
	// kor eng mat  tot ave grade
	// ---------------------------
	//  90  90  90  270  90  A
	
	printf("\n");
}
