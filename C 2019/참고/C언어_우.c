#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>
#define _CRT_SECURE_NO_WARNINGS

//info 구조체 선언
struct info {
	char sub[30];	//제목 
	char wri[15];	//글쓴이 
	char cpn[10];	//출판사 
	int day;		//춢판일 
	char com[50];	//요약 
	int num;		//갯수 
};

//사용할 함수 정의
int book_in();		//책 입고 
void book_out();	//책 출고 
void book_list();	//책 목록 
void book_search();	//책 검색 


// ******************************************************************************** 메인
int main()
{
	while(1){
		char buf[150];													//1줄을 저장할 버퍼 선언
		char str[150];													//버퍼에서 넘겨받을 값을 저장할 변수
		char search[30];												//책 검색에 사용할 변수 선언
		char* token = NULL;												//1줄을 읽어들였을때 "|" 을 기준으로 나누는 과정이 필요하므로 그에 필요한 변수 선언
		int i, max, input, j;											//필요한 변수들 선언 
		struct info* b[20];												//info구조체 b 선언 

		FILE* fp = fopen("book.txt", "r+");								// book.txt 파일을 읽기(r) 모드로 열기.

		if( fp == NULL ) {												//파일이 없을 경우 
			printf("파일이 비어있습니다.\n");
			system("pause");
			return 0;
		}

		for (i = 0; i <  sizeof(b) / sizeof(struct info*); i++) {		// b 구조체 전채 크기에서 구조체 info 의 크기만큼 나눠서 b 구조체가 가지고 있는 요소의 갯수만큼 반복
			b[i] = malloc(sizeof(struct info));							//각 요소에 구조체 크기만큼 메모리 할당
		}

		i = 0;
		while (!feof(fp)) {												//읽어들인 txt의 줄 끝까지 반복

			if(fgets(buf, 150, fp) != 1 ) {
				continue;
			}

			if(sscanf(buf,"%[^\n]", str) != 1 ) {
				continue;
			}

			/*
				버퍼에 개행문자("\n") 만 있을경우 fgets 함수는 0을 반환한다
				위에서 생성한 buf 버퍼에 fgets  함수로 txt 파일의 \n 가 나오기 전까지의 문자열을 저장하고 버퍼의 값을 str로 넘겨준다.
				sscanf 함수로 버퍼로부터 str로 값을 넘겨줄때 개행문자("\n") 만 있을경우 버퍼로부터 값을 넘겨받지 않고 0을 반환한다
				버퍼와 str 둘중 하나라도 1이 아니면 txt에서 정상적으로 값을 받아오지 못했다 판단하여 continue 함수를 이용해 루프를 다음으로 넘겨버린다.
			*/
								
			token = strtok(str, "|");									//buf에 담긴 문자열을 "|" 기준으로 나눠서 각 구조체에 저장
			strcpy(b[i]->sub, token);

			token = strtok(NULL, "|");
			strcpy(b[i]->wri, token);

			token = strtok(NULL, "|");
			strcpy(b[i]->cpn, token);

			token = strtok(NULL, "|");
			b[i]->day = atoi(token);

			token = strtok(NULL, "|");
			strcpy(b[i]->com, token);

			token = strtok(NULL, "|");
			b[i]->num = atoi(token);
			i++;														//1줄씩 읽을때마다 i에 1씩 누적
		}
		max = i;														//입력되어있는 책의 갯수를 max 에 저장한다.
		fclose(fp);

		//Menu GUI
		system("cls");
		printf("\n");
		printf("  ┌──────────────────┐\n");
		printf("  │      ┌──────────┐      │\n");
		printf("  │      │ ");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
		printf("도서 관리 프로그램");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
		printf(" │      │\n");
		printf("  │      └──────────┘      │\n");
		printf("  │           1. 책 입고               │\n");
		printf("  │           2. 책 출고               │\n");
		printf("  │           3. 목록 출력             │\n");
		printf("  │           4. 도서 검색             │\n");
		printf("  │           5. 종료                  │\n");
		printf("  └──────────────────┘\n");
		fflush(stdin);
		printf("   숫자를 입력하세요 : ");
		scanf("%d", &input);
		
		if (input == 1) {
			system("cls");
			book_in(b, max);
			system("pause > nul");
		} else if (input == 2) {
			system("cls");
			//도서 종류가 1개 이하일때는 txt파일의 내용이 없어지는 것을 방지하기 위해 출고를 못하게 한다. 
			if (max <= 1) {
				printf("\n");
				printf("  ┌───────────────────────────┐\n");
				printf("  │  ");
				SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 12);
				printf("도서 종류가 1종류 이하일때는 출고하실 수 없습니다.");
				SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
				printf("  │\n");
				printf("  └───────────────────────────┘\n");
				system("pause > nul");
			} else {
				book_out(b, max);
				system("pause > nul");
			}
		} else if (input == 3) {
			system("cls");
			if (max < 1) {
				printf("\n");
				printf("  ┌──────────┐\n");
				printf("  │  ");
				SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 12);
				printf("도서가 없습니다.");
				SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
				printf("  │\n");
				printf("  └──────────┘\n");
				system("pause > nul");
			} else {
				book_list(b, max);
				printf("   Enter키를 눌러 돌아갑니다.");
				system("pause > nul");
			}
		} else if (input == 4) {
			system("cls");
			book_search(b, max);
			printf("\n   Enter키를 눌러 돌아갑니다.");
			system("pause > nul");
		} else {
			return 0;
		}
	}
}



// ******************************************************************************** 책 입고
int book_in(struct info *b_in[],int max) {
	int input, i;
	char sub[30];
	char wri[30];
	char cpn[30];
	int day;
	char com[50];
	int num; //증가시킬 책의 갯수 
	FILE* fr = fopen("book.txt", "w");

	printf("\n");
	printf("  ┌──────────┐\n");
	printf("  │  ");
	SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
	printf("1. 신규 책 입고");
	SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
	printf("   │\n");
	printf("  │  ");
	if( max < 1 ) {
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 12);
		printf("2. 기존 책 입고");
	} else {
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
		printf("2. 기존 책 입고");
	}
	SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
	printf("   │\n");
	printf("  └──────────┘\n");
	fflush(stdin);
	printf("   입력 : ");
	scanf("%d", &input);
	
	system("cls");

	// ********************************** 신규 책 입고
	if (input == 1) {

		system("cls");
		fflush(stdin);
		
		printf("\n");
		printf("  ┌───────────────────┐\n");
		printf("  │  ");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
		printf("입고할 도서의 제목을 입력해주세요.");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
		printf("  │\n");
		printf("  └───────────────────┘\n   입력 : ");
		scanf("%[^\n]", &sub);
		fflush(stdin);

		system("cls");
		printf("\n");
		printf("  ┌────────────────────┐\n");
		printf("  │  ");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
		printf("입고할 도서의 글쓴이를 입력해주세요.");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
		printf("  │\n");
		printf("  └────────────────────┘\n   입력 : ");
		scanf("%[^\n]", &wri);
		fflush(stdin);
		
		system("cls");
		printf("\n");
		printf("  ┌────────────────────┐\n");
		printf("  │  ");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
		printf("입고할 도서의 출판사를 입력해주세요.");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
		printf("  │\n");
		printf("  └────────────────────┘\n   입력 : ");
		scanf("%[^\n]", &cpn);
		fflush(stdin);

		system("cls");
		printf("\n");
		printf("  ┌─────────────────────┐\n");
		printf("  │  ");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
		printf("입고할 도서의 출판연도를 입력해주세요.");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
		printf("  │\n");
		printf("  └─────────────────────┘\n   입력 : ");
		scanf("%d", &day);
		fflush(stdin);
		
		system("cls");
		printf("\n");
		printf("  ┌───────────────────┐\n");
		printf("  │  ");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
		printf("입고할 도서의 요약을 입력해주세요.");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
		printf("  │\n");
		printf("  └───────────────────┘\n   입력 : ");
		scanf("%[^\n]", &com);
		fflush(stdin);
		
		system("cls");
		printf("\n");
		printf("  ┌───────────────────┐\n");
		printf("  │  ");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
		printf("입고할 도서의 갯수를 입력해주세요.");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
		printf("  │\n");
		printf("  └───────────────────┘\n   입력 : ");
		scanf("%d", &num);
		fflush(stdin);
		
		system("cls");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
		printf("\n제목: %s \n", sub);
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
		printf(" - 저  자: %s\n", wri);
		printf(" - 출판사: %s\n", cpn);
		printf(" - 연  도: %d\n", day);
		printf(" - 요  약: %s\n", com);
		printf(" - 갯  수: %d\n", num);
		printf("\n위의 입력된 도서를 입고합니다. (Enter)");
		
		//main 함수로 부터 받아온 도서 데이터들을 먼저 txt 파일에 입력을 한뒤에 새로운 내용을 아래에 쓴다.
		for(i=0; i<max; i++) {
			fprintf(fr,"%s|%s|%s|%d|%s|%d\n", b_in[i]->sub, b_in[i]->wri, b_in[i]->cpn, b_in[i]->day, b_in[i]->com, b_in[i]->num);
		}
		fprintf(fr,"%s|%s|%s|%d|%s|%d", sub, wri, cpn, day, com, num);

	// ********************************** 기존 책 입고
	} else if (input == 2) {

		if(max < 1) {
			printf("\n");
			printf("  ┌────────────────┐\n");
			printf("  │  ");
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 12);
			printf("입고 가능한 도서가 없습니다.");
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
			printf("  │\n");
			printf("  └────────────────┘\n");
			return 0;
		}

		printf("\n");
		printf("  ┌─────────────────────────┐\n");
		printf("  │   ");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
		printf("입고할 도서의 번호을 입력해주세요. (목록참조)");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
		printf("  │\n");
		printf("  └─────────────────────────┘\n\n");

		for( i = 0; i < max; i++ ) {
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
			printf("%02d. %s \n", i+1, b_in[i]->sub);
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
			printf(" - 저  자: %s\n", b_in[i]->wri);
			printf(" - 갯  수: %d\n", b_in[i]->num);
			printf("\n");
		}
		printf("   입력 : ");
		fflush(stdin);
		scanf("%d", &input);
		
		//입력받은 도서의 번호가 main에서 넘어온 도서의 번호보다 많은지 판 단 
		if((input > 0) && (input <= max)){
		
			system("cls");
			fflush(stdin);
			printf("\n");
			printf("  ┌───────────────────┐\n");
			printf("  │  ");
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
			printf("입고할 도서의 갯수를 입력해주세요.");
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
			printf("  │\n");
			printf("  └───────────────────┘\n   입력 : ");
			scanf("%d", &num);
			
			//입력받은 번호의 도서 갯수를 입력받은 수 만큼 증가 시킨다.
			b_in[input-1]->num = b_in[input-1]->num + num;

			for(i=0; i<max-1; i++) {
				fprintf(fr,"%s|%s|%s|%d|%s|%d\n", b_in[i]->sub, b_in[i]->wri, b_in[i]->cpn, b_in[i]->day, b_in[i]->com, b_in[i]->num);
			}
			//마지막줄에 Enter(\n)가 들어가지 않게 하기위해 마지막 -1번 까지만 실행하고 마지막은 \n를 붙이지 않은 채로 입력한다.
			fprintf(fr,"%s|%s|%s|%d|%s|%d", b_in[max-1]->sub, b_in[max-1]->wri, b_in[max-1]->cpn, b_in[max-1]->day, b_in[max-1]->com, b_in[max-1]->num);

			system("cls");
			printf("\n");
			printf("  ┌───────────────┐\n");
			printf("  │  ");
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 10);
			printf("해당 도서가 입고되었습니다.");
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
			printf(" │\n");
			printf("  └───────────────┘\n");

			
		} else {
			//입력된 도서의 번호가 잘못됬을 경우 main함수로 부터 넘겨받은 도서 데이터들을 다시 txt 파일에 기입한다. 
			//위와 같이 처리하는 이유는 FILE 함수로 txt 파일을 열때 w(쓰기) 모드로 열면 기존에 있던 내용을 파기하기 때문이다. 
			system("cls");
			printf("\n");
			printf("  ┌───────────────────┐\n");
			printf("  │  ");
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 12);
			printf("입력된 목록 번호가 잘못되었습니다.");
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
			printf("  │\n");
			printf("  └───────────────────┘\n");
			for(i=0; i<max-1; i++) {
				fprintf(fr,"%s|%s|%s|%d|%s|%d\n", b_in[i]->sub, b_in[i]->wri, b_in[i]->cpn, b_in[i]->day, b_in[i]->com, b_in[i]->num);
			}
			fprintf(fr,"%s|%s|%s|%d|%s|%d", b_in[max-1]->sub, b_in[max-1]->wri, b_in[max-1]->cpn, b_in[max-1]->day, b_in[max-1]->com, b_in[max-1]->num);
		}

	} else {
		exit;
	}
	fclose(fr);
}



// ******************************************************************************** 책 출고
void book_out(struct info *b_out[],int max) {
	int i, input, num;
	FILE* fr = fopen("book.txt", "w");
	
	printf("\n");
	printf("  ┌─────────────────────────┐\n");
	printf("  │   ");
	SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
	printf("출고할 도서의 번호을 입력해주세요. (목록참조)");
	SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
	printf("  │\n");
	printf("  └─────────────────────────┘\n\n");

	for(i=0; i<max; i++) {
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
		printf("%02d. %s \n", i+1, b_out[i]->sub);
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
		printf(" - 저  자: %s\n", b_out[i]->wri);
		printf(" - 갯  수: %d\n", b_out[i]->num);
		printf("\n");
	}
	printf("   입력 : ");
	fflush(stdin);
	scanf("%d", &input);
	
	//입력 
	if((input > 0) && (input <= max)){

		system("cls");
		printf("\n");
		printf("  ┌───────────────────┐\n");
		printf("  │  ");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
		printf("출고할 도서의 갯수를 입력해주세요.");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
		printf("  │\n");
		printf("  └───────────────────┘\n   입력 : ");
		fflush(stdin);
		scanf("%d", &num);


		//해당 도서의 갯수보다 적은 수를 입력했을 경우
		if(num < b_out[input-1]->num) {
			b_out[input-1]->num = b_out[input-1]->num - num;

			for(i=0; i<max-1; i++) {
				fprintf(fr,"%s|%s|%s|%d|%s|%d\n", b_out[i]->sub, b_out[i]->wri, b_out[i]->cpn, b_out[i]->day, b_out[i]->com, b_out[i]->num);
			}
			fprintf(fr,"%s|%s|%s|%d|%s|%d", b_out[max-1]->sub, b_out[max-1]->wri, b_out[max-1]->cpn, b_out[max-1]->day, b_out[max-1]->com, b_out[max-1]->num);

			system("cls");
			printf("\n");
			printf("  ┌───────────────┐\n");
			printf("  │  ");
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 10);
			printf("해당 도서가 출고되었습니다.");
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
			printf(" │\n");
			printf("  └───────────────┘\n");


		//해당 도서의 갯수랑 같거나 큰 수를 입력했을 경우에는 해당 도서를 전부 출고 한다고 판단, txt 목록에서 삭제한다 
		} else {
			
			//목록 마지막에 위치한 도서를 삭제할때에는 위에서 사용했던 쓰기 코드가 오작동을 일으키므로 다르게 처리한다. 
			if(input == max) {
				//목록의 마지막을 삭제할 경우 
				for(i=0; i<max-2; i++) {
					fprintf(fr,"%s|%s|%s|%d|%s|%d\n", b_out[i]->sub, b_out[i]->wri, b_out[i]->cpn, b_out[i]->day, b_out[i]->com, b_out[i]->num);
				}
				fprintf(fr,"%s|%s|%s|%d|%s|%d", b_out[max-2]->sub, b_out[max-2]->wri, b_out[max-2]->cpn, b_out[max-2]->day, b_out[max-2]->com, b_out[max-2]->num);

			} else {
				//목록의 마지막이 아닌것을 삭제할 경 우 
				for(i=0; i<input-1; i++) {
					fprintf(fr,"%s|%s|%s|%d|%s|%d\n", b_out[i]->sub, b_out[i]->wri, b_out[i]->cpn, b_out[i]->day, b_out[i]->com, b_out[i]->num);
				}

				for(i=input+1; i<max-1; i++) {
					fprintf(fr,"%s|%s|%s|%d|%s|%d\n", b_out[i]->sub, b_out[i]->wri, b_out[i]->cpn, b_out[i]->day, b_out[i]->com, b_out[i]->num);
				}
				fprintf(fr,"%s|%s|%s|%d|%s|%d", b_out[max-1]->sub, b_out[max-1]->wri, b_out[max-1]->cpn, b_out[max-1]->day, b_out[max-1]->com, b_out[max-1]->num);

			}
			system("cls");
			printf("\n");
			printf("  ┌───────────────┐\n");
			printf("  │  ");
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 10);
			printf("해당 도서가 출고되었습니다.");
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
			printf(" │\n");
			printf("  └───────────────┘\n");
		}

	} else {

		system("cls");
		printf("\n");
		printf("  ┌───────────────────┐\n");
		printf("  │  ");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 12);
		printf("입력된 목록 번호가 잘못되었습니다.");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
		printf("  │\n");
		printf("  └───────────────────┘\n");
		for(i=0; i<max-1; i++) {
			fprintf(fr,"%s|%s|%s|%d|%s|%d\n", b_out[i]->sub, b_out[i]->wri, b_out[i]->cpn, b_out[i]->day, b_out[i]->com, b_out[i]->num);
		}
		fprintf(fr,"%s|%s|%s|%d|%s|%d", b_out[max-1]->sub, b_out[max-1]->wri, b_out[max-1]->cpn, b_out[max-1]->day, b_out[max-1]->com, b_out[max-1]->num);
	}
	fclose(fr);
}



// ******************************************************************************** 책 목록
void book_list(struct info *b_list[],int max) {
	int i;
	printf("\n");
	printf("  ┌─────────────────┐\n");
	printf("  │");
	SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 10);
	printf("%3d개의 도서목록을 불러왔습니다.", max);
	SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
	printf("  │\n");
	printf("  └─────────────────┘\n\n");
	for(i=0; i<max; i++) {
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
		printf("%02d. %s \n", i+1, b_list[i]->sub);
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
		printf(" - 저  자: %s\n", b_list[i]->wri);
		printf(" - 출판사: %s\n", b_list[i]->cpn);
		printf(" - 연  도: %d\n", b_list[i]->day);
		printf(" - 요  약: %s\n", b_list[i]->com);
		printf(" - 갯  수: %d\n", b_list[i]->num);
		printf("\n");
	}
}



// ******************************************************************************** 책 검색
void book_search(struct info *b_search[], int max) {
	char search[20];
	int result[20];
	int j = -1; //검색 결과 갯수 
	int i;
	printf("\n");
	printf("  ┌───────────────────┐\n");
	printf("  │  ");
	SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
	printf("검색할 도서의 제목을 입력해주세요.");
	SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
	printf("  │\n");
	printf("  └───────────────────┘\n");
	printf("\n   입력 : ");
	scanf("%s", search);
	system("cls");
	
	//검색결과가 담겨진 index들이 저장될 배열을 -1로 초기화한다.
	//배열을 -1 로 초기화하는 이유는 배열의 index가 저장될 공간인데 index에는 0도 포함되어있기 때문 
	for(i=0; i<20; i++) {
		result[i] = -1;
	}
	
	//입력받은 문자열을 포함하고 있는 책 제목이 있는지 확인
	for(i=0; i<max; i++) {
		char *tmp = strstr(b_search[i]->sub, search);				//strstr함수를 이용해 입력받은 문자열을 포함하고있다면 포함한 문자열을 포함한 뒤의 문자열을 *tmp에 저장
		if (tmp != NULL) {											//책 제목이 입력받은 문자열을 포함하고 있었다면 *tmp는 NULL 값이 아닐것이고 검색결과를 찾았다 판단
			j++;													//검색된 책의 갯수에 1을 누적
			result[j] = i;											//result 배열에 책의 번호를 입력
		}
	}

	if (j < 0) {													//검색된 책의 갯수가 없다면 위의 과정에서 가산된 값이 없을테니 초깃값으로 설정해준 -1 일겄이므로 0 이하라면 검색결과가 없다 판단
		printf("\n");
		printf("  ┌────────────────┐\n");
		printf("  │  ");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 12);
		printf("검색결과를 찾을 수 없습니다.");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
		printf("  │\n");
		printf("  └────────────────┘\n");

	} else {														//검색된 책이 있다면 출력
		printf("\n");
		printf("  ┌────────────────┐\n");
		printf("  │");
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 10);
		printf("%3d개의 결과가 검색되었습니다.", j+1);
		SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
		printf("  │\n");
		printf("  └────────────────┘\n\n");
		for (i=0; i<=j; i++) {
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 14);
			printf("%02d. %s \n", result[i]+1, b_search[result[j]]->sub);
			SetConsoleTextAttribute( GetStdHandle( STD_OUTPUT_HANDLE ), 7);
			printf(" - 저  자: %s\n", b_search[result[j]]->wri);
			printf(" - 출판사: %s\n", b_search[result[j]]->cpn);
			printf(" - 연  도: %d\n", b_search[result[j]]->day);
			printf(" - 요  약: %s\n", b_search[result[j]]->com);
			printf(" - 갯  수: %d\n", b_search[result[j]]->num);
		}
	}
	fflush(stdin);
}
