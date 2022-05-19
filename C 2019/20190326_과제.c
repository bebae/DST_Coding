// looping
//	#1 3명의 학생 기사 OS, DB, SYS, IC, CS
//	합격 ave >= 60,	과락 <60
//	#define, for, -> array

#define N 3
#include <stdio.h>

void main(){
	

	int i;
	int os[N],db[N],sys[N],ic[N],cs[N];
	int pass[N]={ 1};
	int tot[N]={ 0}, ave[N]={ 0};
	char yn[N];
	char *np = "NonPass", *yp = "Pass";


	for (i=0;i<N;i++){
		pass[i]=1;
		
		// 입력값 설명
			printf("산업기사과목 점수 입력\n");
			printf("운영체제/데이터베이스/시스템분석/정보통신/컴퓨터개론\n");

		// 입력값 설정
		// 입력
		while(1){
			scanf(" %d %d %d %d %d",&os[i],&db[i],&sys[i],&ic[i],&cs[i]);
			if(os[i]<0||os[i]>100||db[i]<0||db[i]>100||sys[i]<0||sys[i]>100||ic[i]<0||ic[i]>100||cs[i]<0||cs[i]>100)
				printf("입력범위를 벗었났습니다. 다시 입력해주세요.\n");
			else break;
		}
		
		// 드랍 여부
		printf("─────────────────────\n");
		if(os[i]<60){
			printf("운영체제 미달\n");
			pass[i]=0;
		}
		if(db[i]<60){
			printf("데이터베이스 미달\n");
			pass[i]=0;
		}
		if(sys[i]<60){
			printf("시스템분석 미달\n");
			pass[i]=0;
		}
		if(ic[i]<60){
			printf("정보통신 미달\n");
			pass[i]=0;
		}
		if(cs[i]<60){
			printf("컴퓨터개론 미달\n");
			pass[i]=0;
		}
		printf("─────────────────────\n");
		
		// 계산
		tot[i] = os[i]+db[i]+sys[i]+ic[i]+cs[i];
		ave[i] = tot[i]/5;
	}
	

	// 출력
	printf("\n");
	printf("─────────────────────\n");
	printf(" OS  DB SYS  IC  CS  AVE   Pass/Non Drop\n");
	printf("─────────────────────\n");

	for(i=0;i<N;i++){
		printf("%3d %3d %3d %3d %3d %4d",os[i],db[i],sys[i],ic[i],cs[i],ave[i]);
		
		if(ave[i]>=60){
			printf(" %10s",yp);
		} else{
			printf(" %10s",np);
		}

		if(pass[i]==1){
			yn[i] = 'N';
			printf(" %3c\n",yn[i]);
		} else{
			yn[i] = 'Y';
			printf(" %3c\n",yn[i]);
		}
		
	}	//for
	printf("─────────────────────\n\n");
}

/*
 --------------------
 os db sys is cs ave	pass/non  drop
 90 90  90 90 90 90		pass	   n
 50 90  90 90 90 90		pass	   y
 50 50  50 50 50 50		nonpass	   y
*/

// appod@naver.com