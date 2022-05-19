
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

struct sexual{
		int num;
		int os;
		int db;
		int ca;
		int ic;
		int sys;
		int sum;
		int ave;
		int rank;

};
struct sexual *s,*head,*p,*node,*q;


void result1(){			// 성적 구하기
	
	struct sexual s1[3] = { 0,};	// 구조체 초기화
	int i,j;
	int selet=0;		// 메뉴 선택 변수
	char gra[5];
	int num=0;			// 학생 수
	FILE *in,*out;			// 파일
	char yn[10];
	int pass[3]={ 1,};	// 과락 여부
	char *np = "NonPass", *yp = "Pass";

	srand(time(NULL));
	head = p = NULL;

	
	
	printf("학생 수를 입력하세요 : ");
	scanf("%d",&num);

	in = fopen("in.txt","r");	// 파일 읽어오기
	out = fopen("out.txt","w+");	// 파일 쓰기
	
	for(;;){
		printf("┌──────────────────────────┐\n");
		printf("│                    학생 성적처리                   │\n");
		printf("└──────────────────────────┘\n");

		
		for(i=0;i<num;i++){
			pass[i]=1;		// 과락 초기화
		

		// 랜덤값 설정
			s1[i].os = (rand() % 50)+50;
			s1[i].db = (rand() % 50)+50;
			s1[i].ca = (rand() % 50)+50;
			s1[i].ic = (rand() % 50)+50;
			s1[i].sys = (rand() % 50)+50;
		
			s1[i].sum = s1[i].os+s1[i].db+s1[i].ca+s1[i].ic+s1[i].sys;
			s1[i].ave = s1[i].sum/5;
			if(s1[i].ave >= 90){
				gra[i] = 'A';
			}else if(s1[i].ave  >= 80){
				gra[i] = 'B';
			}else if(s1[i].ave  >= 70){
				gra[i] = 'C';
			}else if(s1[i].ave  >= 60){
				gra[i] = 'D';
			}else {
				gra[i] = 'F';
			}

					// 드랍 여부
//			printf("─────────────────────\n");
			if(s1[i].os<60){
//				printf("OS 미달\n");
				pass[i]=0;
			}
			if(s1[i].db<60){
//				printf("DB 미달\n");
				pass[i]=0;
			}
			if(s1[i].ca<60){
//				printf("CA 미달\n");
				pass[i]=0;
			}
			if(s1[i].ic<60){
//				printf("IC 미달\n");
				pass[i]=0;
			}
			if(s1[i].sys<60){
//				printf("SYS 미달\n");
				pass[i]=0;
			}
//			printf("─────────────────────\n");
			
		}	// 계산 FOR 닫기

		// 석차 초기화
		for(i=0;i<num;i++){
			s1[i].rank=0;		
		}
		
		for(i=0;i<num;i++){
			for(j=0;j<num;j++){
				if(s1[i].sum < s1[j].sum){
					s1[i].rank++;
				}
			}
			s1[i].rank++;		// 0이므로 +1
		}
		
		
		printf("┌─────────────────────────────────┐\n");
		printf("│                                합계                              │\n");
		printf("├─────────────────────────────────┤\n");
		printf("│   os    db    ca    ic   sys  총점   평균  석차   Pass/Non  Drop │\n");
		printf("├─────────────────────────────────┤\n");

		for(i=0;i<num;i++){
			printf("│");
			printf(" %4d  %4d  %4d  %4d  %4d",s1[i].os,s1[i].db,s1[i].ca,s1[i].ic,s1[i].sys);
			printf("  %4d   %4d  %4d ",s1[i].sum,s1[i].ave,s1[i].rank);

			fprintf(out," %4d  %4d  %4d  %4d  %4d",s1[i].os,s1[i].db,s1[i].ca,s1[i].ic,s1[i].sys);
			fprintf(out,"  %4d   %4d  %4d ",s1[i].sum,s1[i].ave,s1[i].rank);

			if(s1[i].ave>=60){
				printf("%9s ",yp);
				fprintf(out,"%9s ",yp);
			} else{
				printf("%9s ",np);
				fprintf(out,"%9s ",np);
			}

			if(pass[i]==1){
				yn[i] = 'N';
				printf(" %3c ",yn[i]);
				fprintf(out," %3c ",yn[i]);
			} else{
				yn[i] = 'Y';
				printf(" %3c ",yn[i]);
				fprintf(out," %3c ",yn[i]);
			}
			printf("  │\n");
			fprintf(out,"\n");
		}

		printf("└─────────────────────────────────┘\n");

		printf("┌────────────────┐\n");
		printf("│       계속하시곘습니까?        │\n");
		printf("│         1.계속 2.메뉴          │\n");
		printf("└────────────────┘\n");
		scanf("%d",&selet);
		
		if(selet==2){
			fclose(in);			//	in 파일 닫기
			fclose(out);		//	out 파일 닫기		
			break;
		}
	}	// 무한 for

	fclose(in);			//	in 파일 닫기
	fclose(out);		//	out 파일 닫기
}


void result2(){			// 10개의 정수
	int i,j;
	int selet=0;
	int num[10]={ 0,};
	int max=-1000,min=1000;		// 최솟값/최대값
	int ave,sum=0;
	int chr,chr_min=100;		//평균 유사값
	int tmp;					// 정렬시 필요변수
	int *p;				// 포인터

	srand(time(NULL));
	p = &num[0];		// 포인터 초기화

	
	for(;;){

		sum = 0;

		printf("┌─────────────────────┐\n");
		printf("│            10개의 정수(1~100)            │ \n");
		printf("├─────────────────────┤\n");
		printf("┌─────────────────────┐\n");
		printf("│                  정렬前                  │\n");
		printf("├─────────────────────┤\n");
		printf("│ ");
		for(i=0;i<10;i++){		// 최대값/최소값
			num[i] = (rand() % 100)+1;		//랜덤한 정수를 배열에 선언
			
			
			printf(" %3d",*(p+i));

			if(*(p+i)>max){
				max=*(p+i);
			}
			if(num[i]<min){
				min=*(p+i);
			}
			sum += *(p+i);
		}
		ave = sum/10;
		
		printf(" │\n");

		for(i=0;i<10;i++){	// 정렬
			for(j=0;j<10;j++){
				if(num[i] > num[j]){	// 내림차순
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		

		printf("└─────────────────────┘\n");
		
		printf("┌─────────────────────┐\n");
		printf("│          최대값  최소값  평균값          │\n");
		printf("│           %4d   %4d    %4d            │\n",max,min,ave);
		printf("└─────────────────────┘\n");

		printf("┌─────────────────────┐\n");
		printf("│                  정렬後                  │\n");
		printf("├─────────────────────┤\n");
		printf("│ ");
		for(i=0;i<10;i++){
			printf(" %3d",*(p+i));
		}
		printf(" │\n");
		printf("└─────────────────────┘\n");

			
		printf("┌────────────────┐\n");
		printf("│       메뉴로 가시겠습니까?     │\n");
		printf("│            1.메뉴              │\n");
		printf("└────────────────┘\n");
		scanf("%d",&selet);
		
		if(selet==1) break;
		else break;
	}
}
void result3(){
	printf(" 프로그램기초 기말고사를 하면서...\n\n");
	printf(" 아쉬운 점\n");
	printf(" 1. 일단 포인터를 정확하게 이해하지 못해서 1번문제에 적용하지 못 하였고\n 2번 문제에도 정말 기초만 넣은 게 아쉽습니다.\n\n");
	printf(" 2. 파일을 읽어오는 것도 저의 이해와 시간이 부족하여 적용시키지 못 하였습니다.\n\n");
	printf("==========종합==========\n\n");
	printf(" 기존에 했었던 소스를 고쳐서 사용하였지만 역시 포인터와 구조체, \n\n파일을 정확히 이해하지 못한 상태라 적용시키지 못한 게 \n\n");
	printf("굉장히 아쉽고 기말고사가 끝나더라도 계속해서 공부하여 이해하여 \n\n제 것으로 만들기 위해 더욱 정진하겠습니다!\n\n");
}


void main(){
	int x=-1;
	
	while(x!=4){

		printf("┌────────────────┐\n");
		printf("│          Muen                  │\n");
		printf("│  1. 성적구하기                 │\n");
		printf("│  2. 10개의 랜덤정수 정렬       │\n");
		printf("│  3. 쓸데없는 말                │\n");
		printf("│  4. 종료                       │\n");
		printf("└────────────────┘\n");

		scanf("%d",&x);

		
		switch(x){
			case 4:
				printf("          ┌────┐\n");
				printf("          │  종료  │\n");
				printf("          └────┘\n");
				break;
			case 1:		// 성적구하기
				result1();
				break;
			case 2:		// 10개 정수
				result2();
				break;
			case 3:
				result3();
				break;
			default:
				printf("ERROR\n");
				break;
		};
	}

}
// 정범진_201903298