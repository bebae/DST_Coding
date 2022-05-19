#include <stdio.h>
#include <stdlib.h>
#include <time.h>

struct sexual{
		int num;
		int mid;
		int high;
		int chul;
		int repo;
		int sum;
};
void result1(){			// 성적처리
	
	struct sexual s1[3];
	int i;
	int ave[5]={ 0,};
	int selet=0;
	
	for(;;){
		for(i=0;i<3;i++){
			printf("┌──────────────────────┐\n");
			printf("│   %02d번째 학생의 학번과 성적을 입력하세요   │\n",i+1);
			printf("├──────────────────────┤\n");
			printf("│     학번/중간30/기말40/출석10/리포트20     │\n");
			printf("└──────────────────────┘\n");

			scanf(" %d %d %d %d %d",&s1[i].num,&s1[i].mid,&s1[i].high,&s1[i].chul,&s1[i].repo);
			
			s1[i].sum = s1[i].mid+s1[i].high+s1[i].chul+s1[i].repo;
			ave[0] += s1[i].mid;
			ave[1] += s1[i].high;
			ave[2] += s1[i].chul;
			ave[3] += s1[i].repo;
			ave[4] += s1[i].sum;
		}
		for(i=0;i<5;i++){
			ave[i]=ave[i]/3;
		}

		
		
		printf("┌──────────────────────┐\n");
		printf("├──────────────────────┤\n");
		printf("│                     합계                   │\n");
		printf("├──────────────────────┤\n");
		printf("│    학번     중간  기말  출석 리포트  총점  │\n");
		printf("├──────────────────────┤\n");

		for(i=0;i<3;i++){
			printf("│ %9d ",s1[i].num);
			printf(" %4d  %4d  %4d   %4d ",s1[i].mid,s1[i].high,s1[i].chul,s1[i].repo);
			printf(" %4d   │\n",s1[i].sum);
			printf("├──────────────────────┤\n");
		}
		printf("│    평균   ");
		for(i=0;i<5;i++){
			if(i==3) printf(" ");		// 자리맞춤용
			printf(" %4d ",ave[i]);
		}
		printf("  │\n");
		printf("├──────────────────────┤\n");
		printf("└──────────────────────┘\n");

		printf("┌──────────────────────┐\n");
		printf("│               계속하시곘습니까?            │\n");
		printf("│                 1.계속 2.종료              │\n");
		printf("└──────────────────────┘\n");
		scanf("%d",&selet);
		
		if(selet==2) break;
	}
}

void result2(){			// 주사위게임
	int user,com;
	int selet=0;

	srand(time(NULL));
	

	for(;;){
		com = (rand() % 3)+1;
		user = (rand() % 3)+1;

		printf("┌──────────┐\n");
		printf("│        결과        │\n");
		printf("│   컴퓨터    유저   │\n");
		printf("│  %6s ",(com==1?"가위":com==2?"바위":com==3?"보":"error"));
		printf("  %6s   │\n",(user==1?"가위":user==2?"바위":user==3?"보":"error"));
		printf("└──────────┘\n");


		printf("┌──────────┐\n");
		if(user == com){
			printf("│        DWOR        │\n");
		} else if(((user==1)&&(com==2))||((user==2)&&(com==3))||((user==3)&&(com==1)) ){
			printf("│        LOSE        │\n");
		} else if(((user==1)&&(com==3))||((user==2)&&(com==1))||((user==3)&&(com==2)) ){
			printf("│         WIN        │\n");
		} else 
			printf("│       ERROR        │\n");
		printf("└──────────┘\n");
		
		printf("┌──────────┐\n");
		printf("│ 계속하시곘습니까?  │\n");
		printf("│   1.계속 2.종료    │\n");
		printf("└──────────┘\n");
		scanf("%d",&selet);
		
		if(selet==2) break;
	}
}

void result3(){			// 사칙연산
	int selet=0;
	int x,y;
	float num;
	
	

	for(;;){
		x = (rand() % 100)+1;
		y = (rand() % 100)+1;

		printf("┌───────────┐\n");
		printf("│   2개의 정수(1~100)  │ \n");
		printf("└───────────┘\n");


		num = x/y;

		printf(" ────────────\n");
		printf("           결과         \n");
		printf(" ────────────\n");
		printf("   %3d + %d = %5d   \n",x,y,x+y);
		printf("   %3d - %d = %5d   \n",x,y,x-y);
		printf("   %3d * %d = %5d   \n",x,y,x*y);
		printf("   %3d / %d = %7.1f \n",x,y,num);
		printf(" ────────────\n");
			
		printf("┌───────────┐\n");
		printf("│  계속하시곘습니까?   │\n");
		printf("│    1.계속 2.종료     │\n");
		printf("└───────────┘\n");
		scanf("%d",&selet);
		
		if(selet==2) break;
	}
}


void main(){
	int x=-1;
	
	while(x!=4){

		printf("┌────────────┐\n");
		printf("│          Muen          │\n");
		printf("│  1. 성적처리 프로그램  │\n");
		printf("│  2. 주사위게임         │\n");
		printf("│  3. 랜덤사칙연산       │\n");
		printf("│  4. 종료               │\n");
		printf("└────────────┘\n");

		printf("┌────────────┐\n");
		printf("│   메뉴 다시보기 5번    │\n");
		printf("└────────────┘\n");
		printf("메뉴를 선택하세오 : ");
		scanf("%d",&x);

		
		switch(x){
			case 4:
				printf("      ┌────┐\n");
				printf("      │  종료  │\n");
				printf("      └────┘\n");
				break;
			case 1:		// 성적처리
				result1();
				break;
			case 2:		// 주사위게임
				result2();
				break;
			case 3:		// 사칙연산
				result3();
				break;
			case 5:		// 메뉴 다시보기
				break;
			default:
				printf("ERROR\n");
				break;
		};
	}

}
// 정범진_201903298