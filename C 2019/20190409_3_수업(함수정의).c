// 3명 is db sys ic ca
// 평균 60 합격 else 불합격
// 과락 60
#include <stdio.h>

struct kisa{
	int os;
	int db;
	int sys;
	int ic;
	int ca;
	int ave;
	char* pass; //"pass" "nonpass"
};
struct kisa k[3];

void main(){
	int i;
	int ave;

	printf("┌───────────┐\n");
	printf("│ os  db  sys  ic  ca  │\n");
	printf("└───────────┘\n");

	for (i=0;i<3;i++){
		
		printf("────────────────\n");
		printf("     [%02d]번째 학생 점수  \n",i+1);
		scanf(" %d %d %d %d %d",&k[i].os,&k[i].db,&k[i].sys,&k[i].ic,&k[i].ca);
	}

	//ave
	for (i=0;i<3;i++){
		
		ave = (k[i].os+k[i].db+k[i].sys+k[i].ic+k[i].ca)/5;
		if (ave>=60){
			k[i].pass = "pass";
		} else{
			k[i].pass = "nonpass";
		}

		//과락
		if (k[i].os<60||k[i].db<60||k[i].sys<60||k[i].ic<60||k[i].ca<60){
			k[i].pass = "drop";
		}
	}

	// 출력
	printf("┌────────────────────┐\n");
	printf("├    os   db  sys   ic   ca      result  ┤\n");
	for (i=0;i<3;i++){
		printf("├────────────────────┤\n");
		printf("│  %4d %4d %4d %4d %4d %10s   │\n",k[i].os,k[i].db,k[i].sys,k[i].ic,k[i].ca,k[i].pass);
		printf("├────────────────────┤\n");
	}
	printf("└────────────────────┘\n");

}



