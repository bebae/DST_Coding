//#2 3과목 점수를 읽고 계산 출력하기
// file 사용 read compute write
// array 데이터를 저장
// 모듈식 프로그래밍 (입력/계산/출력)
#include <stdio.h>
#define N 10
#define True 1
#define False 0

struct score{
	int kor;
	int eng;
	int mat;
	int tot;
	int ave;
	char *grade;
	int rank;
};
struct score s[N], tmp;
void main(){
	
	int i;
	FILE *in, *out;	// input, output
	int k_ave=0,e_ave=0,m_ave=0;

	int change = True;

	//open
	in = fopen("in.txt","r");
	out = fopen("out.txt","w");	
	
	// input
	for(i=0;i<N;i++){
		fscanf(in,"%d %d %d",&s[i].kor,&s[i].eng,&s[i].mat);
	}

	// compute
	for(i=0;i<N;i++){	
		
		s[i].tot = s[i].kor+s[i].eng+s[i].mat;
		s[i].ave = s[i].tot/3;

		k_ave += s[i].kor;
		e_ave += s[i].eng;
		m_ave += s[i].mat;

		if(s[i].ave >= 90) s[i].grade = "A";
		else if(s[i].ave>=80) s[i].grade = "B";
		else if(s[i].ave>=70) s[i].grade = "C";
		else if(s[i].ave>=60) s[i].grade = "D";
		else s[i].grade = "F";
	}
	k_ave = k_ave/N;
	e_ave = e_ave/N;
	m_ave = m_ave/N;

	// ranking sort	
	while(change){
	  change = False;

	  for(i=0;i<(N-1);i++){

		if(s[i].ave <s[i+1].ave){
			tmp = s[i];
			s[i] = s[i+1];
			s[i+1] = tmp;
			s[i].rank++;
			change = True;
		}		
	  }
	}
		

	// output procedure
	printf("kor eng mat  tot ave grade ranking\n");
	printf("----------------------------------------\n");
	for(i=0;i<N;i++){

		printf("%3d %3d %3d ",s[i].kor,s[i].eng,s[i].mat);
		printf(" %3d %3d %3s\n",s[i].tot,s[i].ave,s[i].grade);
		fprintf(out,"%3d %3d %3d  %3d %3d %3s %3d\n",s[i].kor,s[i].eng,s[i].mat,s[i].tot,s[i].ave,s[i].grade,s[i].rank);

	}
	printf("----------------------------------------\n");
	printf("kor_ave = %3d\neng_ave = %3d\nmat_ave = %3d\n",k_ave,e_ave,m_ave);
	printf("----------------------------------------\n");
	//close
	fclose(in);
	fclose(out);

	
	printf("\n");
}
