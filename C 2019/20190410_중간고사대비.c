#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void result1(){
	printf("대전과학기술대학교\n컴퓨터정보학&스마트폰과입니다.\n잘부탁드립니다.\n");
}

void result2(){
	int user,com;


	srand(time(NULL));

	com = (rand() % 3)+1;

	for(;;){

		printf("┌────────────────┐\n");
		printf("│  가위바위보를 선택하세요.      │\n");
		printf("│     1.가위 2.바위 3.보 4.종료  │\n");
		printf("└────────────────┘\n");
		scanf("%d",&user);
		
		if(user==4) break;
		
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
			printf("ERROR\n");
		printf("└──────────┘\n");
		
	}
}


void main(){
	int x=-1;
	
	while(x!=0){

		printf("┌──────────┐\n");
		printf("│        Muen        │\n");
		printf("│   1. 자기소개      │\n");
		printf("│   2. 가위바위보    │\n");
		printf("│   0. 종료          │\n");
		printf("└──────────┘\n");

		printf("메뉴를 선택하세요 : ");
		scanf("%d",&x);

		
		switch(x){
			case 0:
				printf("┌────┐\n");
				printf("│  종료  │\n");
				printf("└────┘\n");
				break;
			case 1:
				result1();
				continue;
				break;
			case 2:
				result2();
				continue;
				break;
			default:
				printf("ERROR\n");
				continue;
				break;
		};
	}

}
