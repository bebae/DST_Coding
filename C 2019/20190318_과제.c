#include <stdio.h>

void main(){
	
	int kor, eng, mat;
	int tot=0;
	int ave;
	int i=0;

	char* grade="";		
	char yn ;
	
	for(;;){
		
	
		printf("go ??? y or n\n");

		if(i!=0) getchar();
		yn = getchar();
		if(i==0) getchar();
		
		if(yn == 'y')
			i++;
		else break;

		printf("%d번 학생 처리를 시작합니다\n",i);
		printf("국어 점수 입력 :");
		scanf("%d",&kor);
		printf("영어 점수 입력 :");
		scanf("%d",&eng);
		printf("수학 점수 입력 :");
		scanf("%d",&mat);

		tot=kor+eng+mat;
		ave = tot/3;
		
		if(ave >= 90){
			grade = "A";
		}else if(ave >= 80){
			grade = "B";
		}else if(ave >= 70){
			grade = "C";
		}else {
			grade = "F";
		}

		printf("\n------------------------------------\n");
		printf(" %d번 학생의 결과 \n",i);
		printf(" 3과목의 성적 처리       \n");
		printf(" 국어 : %d\n 영어 : %d\n 수학 : %d\n",kor,eng,mat);
		printf(" 총점 : %d  평균 : %d  학점 : %s\n",tot,ave,grade);
		printf("--------------------------------------\n");
		

	}

}
// appod@naver.com