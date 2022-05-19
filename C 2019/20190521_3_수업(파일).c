//#2 3과목 점수를 읽고 계산 출력하기
// file 사용 read compute write
// array 데이터를 저장
// 모듈식 프로그래밍 (입력/계산/출력)
#include <stdio.h>
#define N 10

void main(){
	
	int i;
	FILE *in;	// input
	int kor[N],eng[N],mat[N];
	int k_ave=0,e_ave=0,m_ave=0;
	int tot[N]={0, },ave[N]={0, };
	char *grade[N]={"F"};


	//open
	in = fopen("in.txt","r");
	
	// input
	for(i=0;i<N;i++){
		fscanf(in,"%d %d %d",&kor[i],&eng[i],&mat[i]);
	}

	// compute
	for(i=0;i<N;i++){	
		
		tot[i] = kor[i]+eng[i]+mat[i];
		ave[i] = tot[i]/3;

		k_ave += kor[i];
		e_ave += eng[i];
		m_ave += mat[i];

		if(ave[i] >= 90) grade[i] = "A";
		else if(ave[i]>=80) grade[i] = "B";
		else if(ave[i]>=70) grade[i] = "C";
		else if(ave[i]>=60) grade[i] = "D";
		else grade[i] = "F";
	}
	k_ave = k_ave/N;
	e_ave = e_ave/N;
	m_ave = m_ave/N;
	
	// output procedure
	printf("kor eng mat  tot ave grade rank\n");
	printf("-------------------------------------\n");
	for(i=0;i<N;i++){

		printf("%3d %3d %3d ",kor[i],eng[i],mat[i]);
		printf(" %3d %3d %3s\n",tot[i],ave[i],grade[i]);

	}
		printf("-------------------------------------\n");
		printf("kor_ave = %3d\neng_ave = %3d\nmat_ave = %3d\n",k_ave,e_ave,m_ave);
		printf("-------------------------------------\n");
	//close
	fclose(in);
	
	printf("\n");
}
