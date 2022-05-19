#include <stdio.h>
#include <string.h>		// strtok 함수가 선언된 헤더 파일
#include<process.h>		// exit 함수
#define _CRT_SECURE_NO_WARNINGS
#define N 10


struct book{
	int number;			//  목록번호
	char *tit[30];		//	책 제목
	char *name[10];		//	저자
	char *chu[10];		//	출판사
	int year;			//	발행연도
	char *conent[50];	//	책 요약
	int num;			//  책 권수

	struct book *next;
};
struct book b[N], *head,*p,*node,*q;
//   *head=첫번째 *p=다음데이터 *node=새로운데이터 *q=출력용포인터


void book_list();
void book_search();
void result1();
void result2();

void result1(){			// 책 입고	========== case 1
	FILE *book;
	char buf[200];
	int i;
	int count=0;									// 새로 입고할 책의 정보를 라인 마지막부터 하기 위한 라인 수
	int len=0;										// 실시가능로 버퍼길이를 재어준다
	int select = 0;									// 신규 입고와 기존 입고 중 선택 변수
	int num=0,n=0,plus_n=0;						// 책의 번호,책의 권수, 입고된 책의 권수


	book = fopen("book.txt","r");
	
	// 파일의 줄의 최대값
	while( fgets(buf, sizeof(buf), book)){			// 파일의 총 줄의 갯수를 세어서 그 만큼의 줄을 출력
		len  = strlen(buf);							// buf의 길이수를 센다
		if(len==0)									// 라인 수가 0이면 브레이크
		  break;	
		count++;									// 라인수 증가
		buf[0]= '\0';								// 버퍼 초기화	
	}												// 파일내용의 줄 갯수 확인. 포인터는 마지막에서 끝남
	fseek(book, 0L,SEEK_SET);						// 포인터를 처음으로 리셋
	fclose(book);

		printf("┌─────────────┐\n");
		printf("│     1. 신규 입고         │\n");
		printf("│     2. 기존 입고         │\n");
		printf("└─────────────┘\n");
		printf(" 번호를 입력하세요 : ");
		scanf("%d",&select);

	if (select == 1){		// 신규 입고 선택 시

		book = fopen("book.txt","a");				// 파일 오픈 포인터는 기존내용 끝에서 계속	

		printf("┌─────────────┐\n");
		printf("│        신규 입고         │\n");
		printf("│  입력을 시작하겠습니다!  │\n");
		printf("└─────────────┘\n");
		// 입고 입력
		
		i = count;
		printf("제목   : ");
		scanf("%s",&b[i].tit);
		printf("저자   : ");
		scanf("%s",&b[i].name);
		printf("출판사 : ");
		scanf("%s",&b[i].chu);
		printf("연도   : ");
		scanf("%d",&b[i].year);
		printf("요약   : ");
		scanf("%s",&b[i].conent);
		printf("권수   : ");
		scanf("%d",&b[i].num);
		
		
		
		fgets(buf,sizeof(buf),book);

		b[i].number = count+1;	
		fprintf(book,"%d %s %s %s %d %s %d\n",b[i].number,b[i].tit,b[i].name,b[i].chu,b[i].year,b[i].conent,b[i].num);

		fclose(book);
	}						// select 1 if 닫기

	if(select == 2){		// 기존 입고 선택 시

		book = fopen("book.txt","r");

		printf("\n");
		for(i=0;i<count;i++){							// 책 목록의 번호와 제목만 출력
		
			b[i].number = i+1;
			fscanf(book,"%d %s %s %s %d %s %d",&b[i].number,b[i].tit,b[i].name,b[i].chu,&b[i].year,b[i].conent,&b[i].num);
			fgets(buf,sizeof(buf),book);

			
			printf("│ 번호 : %3d │  제목 : %8s  │  권수 : %3d  │\n",b[i].number,&b[i].tit,b[i].num);
		}
		fclose(book);


		while(1){
			printf("\n입고할 책의 번호를 입력해주세요 : ");
			scanf("%d",&n);
			if(n > count) {	// 목로에 있는 번호인지 확인
					printf("목록에 없는 번호 입니다. 다시 선택하세요\n");
			} else break;
		}
		printf("입고할 책의 권수를 입력해주세요 : ");
		scanf("%d",&num);
		
		fopen("book.txt","w");

		fseek(book, 0L,SEEK_SET);							// 포인터를 처음으로 리셋. 처음에서 0부터 = 파일의 시작부분 
		fgets(buf,sizeof(buf),book);

		for(i=0;i<count;i++){								
			if((i+1) == n){				// 목록에서 선택한 번호라면
				plus_n = b[i].num;							// 실제로 입고된 책의 권수 변수에 따로 저장
				b[i].num = b[i].num+num;					// 입력한 권수 만큼 더하기

				fprintf(book,"%d %s %s %s %d %s %d\n",i+1,b[i].tit,b[i].name,b[i].chu,b[i].year,b[i].conent,b[i].num);	
				printf("남은 책의 권수 : %3d \n",b[i].num);
				
			} else {				// 선택한 번호가 아니라면
				fprintf(book,"%d %s %s %s %d %s %d\n",i+1,b[i].tit,b[i].name,b[i].chu,b[i].year,b[i].conent,b[i].num);
			}
		}													// 출고한 목록 for문 닫기
		fclose(book);
	}						// select 2 if 닫기
		printf("┌─────────────┐\n");
		printf("│  입력이 완료되었습니다!  │\n");
		printf("└─────────────┘\n");

}
void result2(){				// 책 출고 ============ case 2
	FILE *book;
	char buf[200];
	int i,j;
	int len=0,count=0;								// 파일 줄의 최대값 구할 때 필요한 변수
	int num=0,n=0,minus_n=0;						// 책의 번호,책의 권수, 출고된 책의 권수
	
	book = fopen("book.txt","r");

	// 파일의 줄의 최대값
	while( fgets(buf, sizeof(buf), book)){			// 파일의 총 줄의 갯수를 세어서 그 만큼의 줄을 출력
		len  = strlen(buf);							// buf의 길이수를 센다
		if(len==0)									// 라인 수가 0이면 브레이크
		  break;	
		count++;									// 라인수 증가
		buf[0]= '\0';								// 버퍼 초기화
	}
	fseek(book, 0L,SEEK_SET);						// 포인터를 처음으로 리셋

	// 책 목록에서 번호와 제목만 표시한 뒤 번호 선택 후 출고할 권수 입력하여 기존 권수에서 빼기

	printf("\n");
	for(i=0;i<count;i++){							// 책 목록의 번호와 제목만 출력
	
		b[i].number = i+1;
		fscanf(book,"%d %s %s %s %d %s %d",&b[i].number,b[i].tit,b[i].name,b[i].chu,&b[i].year,b[i].conent,&b[i].num);
		fgets(buf,sizeof(buf),book);

		
		printf("│ 번호 : %3d │  제목 : %8s  │  권수 : %3d  │\n",b[i].number,&b[i].tit,b[i].num);
	}

	fclose(book);

	printf("\n");
	while(1){
		printf("출고할 책의 번호를 입력해주세요 : ");
		scanf("%d",&n);
		if(n > count) {	// 목로에 있는 번호인지 확인
				printf("목록에 없는 번호 입니다. 다시 선택하세요\n");
		} else break;
	}
	printf("출고할 책의 권수를 입력해주세요 : ");
	scanf("%d",&num);
	
	fopen("book.txt","w");

	fseek(book, 0L,SEEK_SET);							// 포인터를 처음으로 리셋. 처음에서 0부터 = 파일의 시작부분 
	fgets(buf,sizeof(buf),book);

	for(i=0;i<count;i++){								
		if((i+1) == n){				// 목록에서 선택한 번호라면
			minus_n = b[i].num;							// 실제로 출고된 책의 권수 변수에 따로 저장
			b[i].num = b[i].num-num;					// 입력한 권수 만큼 빼기

			if(b[i].num <= 0){							// 권수가 0 이하가 되면 목록 생성에서 제외
				printf("책이 모두 출고 되었습니다!\n");
				printf("출고된 책의 권수 : %3d\n",minus_n);
			} else {									// 권수가 0 이하가 아니라면 목록 생성
				fprintf(book,"%d %s %s %s %d %s %d\n",i+1,b[i].tit,b[i].name,b[i].chu,b[i].year,b[i].conent,b[i].num);	
				printf("남은 책의 권수 : %3d \n",b[i].num);
			}
		} else {				// 선택한 번호가 아니라면
			fprintf(book,"%d %s %s %s %d %s %d\n",i+1,b[i].tit,b[i].name,b[i].chu,b[i].year,b[i].conent,b[i].num);
		}
		
	}													// 출고한 목록 for문 닫기

	printf("┌─────────────┐\n");
	printf("│  수정이 완료되었습니다!  │\n");
	printf("└─────────────┘\n");


	fclose(book);
	
}

void book_search(){				// 책 검색	============ case 4
	 FILE *book;
	 char buffer[300],word[20];
	 int count=0;										// 라인 수

	 printf("───────────────\n");
	 printf("검색할 단어 : ");
	 scanf("%s", word);
	 printf("───────────────\n");

	 book = fopen("book.txt","r");
	 if( book==NULL){
		printf("File open error \n");
		exit(1);
	 }

	
	 while( fgets(buffer, 300, book)){
	  count++;										// 라인수
	  if(strstr(buffer,word))							//문자열 찾아주는 함수
	   printf(" %d번째 %s을(를) 검색! \n",count,word);
	  else
	   printf(" %d번째 검색결과 없음 \n",count);
	 }
	 fclose(book);
	 printf("───────────────\n");
	 printf("┌─────────────┐\n");
	 printf("│  검색이 완료되었습니다!  │\n");
	 printf("└─────────────┘\n");

}

														// 목록 출력
void book_list(){
	FILE *book;
	int i;
	char buf[200];										// 한 줄을 저장하는 문자열
	int len;											// 실시가능로 버퍼길이를 재어준다
	char *token = NULL;									// 검색에 사용하며, 개별 저장용
//	char str[150];										//버퍼에서 넘겨받을 값을 저장할 변수	
	int count = 0;										// 라인수를 세어 주는 변수
	

	book = fopen("book.txt","r");						// 파일 오픈
	
	if(book == NULL){									// 파일 유무 확인
		printf("FILE OPEN ERROR!!\n\n");
		exit(1);
	} else {
		printf("파일 있음\n");
	}
	 
	// 파일의 줄의 최대값
	 while( fgets(buf, sizeof(buf), book)){			// 파일의 총 줄의 갯수를 세어서 그 만큼의 줄을 출력
		len  = strlen(buf);							// buf의 길이수를 센다
		if(len==0)									// 라인 수가 0이면 브레이크
		  break;	
		count++;									// 라인수 증가
		buf[0]= '\0';								// 버퍼 초기화
	}												// 파일내용의 줄 갯수 확인. 포인터는 마지막에서 끝남
	fseek(book, 0L,SEEK_SET);						// 포인터를 처음으로 리셋. 처음에서 0부터 = 파일의 시작부분 


	printf("───────────────\n");

	for(i=0;i<count;i++){
		
		fscanf(book,"%d %s %s %s %d %s %d",&b[i].number,b[i].tit,b[i].name,b[i].chu,&b[i].year,b[i].conent,&b[i].num);

		fgets(buf,sizeof(buf),book);

		// 목록 결과값
		printf("번호   : %d \n",b[i].number);
		printf("제목   : %s \n",b[i].tit);
		printf("저자   : %s \n",b[i].name);
		printf("출판사 : %s \n",b[i].chu);
		printf("연도   : %d \n",b[i].year);
		printf("요약   : %s \n",b[i].conent);
		printf("권수   : %d \n",b[i].num);
	printf("───────────────\n");
		buf[i]= '\0';	

	}												// 출력 for 문 닫기

	fclose(book);										// 파일 닫기
}

void main(){

	int x=-1;											// 선택값을 저장하는 변수


	head = p = NULL;


	while(x!=5){
			// 목록 출력
		printf("\n───────────────\n");
		printf("    도서관리 프로그램 \n");
		printf("     1. 책 입고\n");
		printf("     2. 책 출고\n");
		printf("     3. 목록 출력\n");
		printf("     4. 도서 검색\n");
		printf("     5. 종료\n");
		printf("───────────────\n");
		printf("메뉴 선택 : ");
		scanf("%d",&x);

		switch(x){
			case 1:										//입고
				result1();		
				break;
			case 2:										//출고
				result2();
				break;
			case 3:										//목록
				book_list();	
				break;
			case 4:										//검색
				book_search();
				break;
			case 5:
				printf("┌─────────────┐\n");
				printf("│      종료되었습니다.     │\n");
				printf("└─────────────┘\n");
				break;
			default:
				printf("예상치 못한 error가 발생했습니다\n");
				break;
		};

	}
	

	printf("\n");
}
/* 
			소감문
	
	일단 
	시간이 없어서 못 했다는 건 변명이 되지 않겠죠 프로그래머는 항상 시간이 아무리 있어도 부족한 직업이니까요
	한정된 시간 안에 제가 할 수 있는 최선을 다하였지만 역시 아쉬움은 남습니다

	포인터에 대하여 모르는 부분이 많아서 포인터는 결국 적용시키지 못하였고 
	출고할 때 배열에 중간 부분을 삭제되었으면 배열을 앞으로 채우고 마지막 열을 초기화 하려고 했는데 제 능력이 부족하여 하지 못하고
	하면서 모르는 부분이 많아서 코드에 불필요한 부분이 가독성이 부족하 부분이 많이 있어서 여러모로 아쉽습니다
	
	

	도와준 친구들은 
	학과에서 C언어를 가장 잘 하는 우진이가 있지만 우진이는 포인터로 코딩을 하였기에 직접적인 도움은 받지 못 했지만 구조적 부분에서 참고하였습니다.
	동엽이는 줄 읽어 오는 걸 i=10을 고정하여 구조적인 문제보단 오류가 나온 것의 조언 몇마디만 도와주었습니다.

	이 과제를 통해 파일에 대해선 많이 알게 되었고 날깂이 언제 생기며 그로인한 오류를 해결하는 법을 알았습니다.
	또한 저에게 부족한 점인 포인터를 알고 포인터에 대해 공부하여 언젠간 이 소스에 적용시키도록 노력하겠습니다.

	모자란 글 읽어주셔서 감사합니다.
	
	2019/06/14  프로그램 기초 1학년 1학기 최종 과제
*/