#include <stdio.h>

struct BOOK

{

	char title[30];

	char auth[30];

	char publ[30];

	int num;

	char borr;

};

char book_search(char *book_info, char *search, int *result); //구조체 사용과 이전의 char 배열을 일일이 사용했을 때의 장점이 뭐냐하면, 문자열 내에서 문자열을 검색하는 함수 한개면 구조체의 성분을 다 처리할 수 있다는 것이다. 분명히 장점이 아닐 수 없다. 이전에 구조체 한 쓰고 만들었을 때는 제목용, 저자용, 출판사용 함수를 다 따로 넣어야 했다. 

int book_borrow(char *borr);

int book_return(char *borr);

char book_change(struct BOOK *book_list);

char book_default(char *book_list);

int main()

{

	struct BOOK book_list[100];

	int i, j, k,l,m,n;

	char a, search[100];

	m = 0;

	for(i=0;i<100;i++)

	{

		book_list[i].num = i+1;

		book_default(book_list[i].title);

		book_default(book_list[i].auth);

		book_default(book_list[i].publ);

	} //왜 그런지는 잘 모르겠는데 구조체는 만지가다 보니 그냥 아무것도 없는 구조체도 메모리 공간을 차지하고 있는 거 같다. 그래서 이렇게 초기화를 해서 각 구조체 성분 값으로 null  을 넣어주는 절차를 거쳐야 한다. 이거 때문에 많이 헤매었다. 뭐 글쎄. 최적화의 관점에서 보자면 이러지 않고도 쓸 수 있는 방법이 있긴 할 것 같다만.... 일단 이렇게 하지 뭐.

	printf("도서관에 오신 것을 환영합니다. \n");

	for(;;)

	{

		printf("수행하실 작업을 선택해 주십시오. \n");

		printf(" 1. 도서 검색 \n 2. 도서 대여 \n 3. 도서 반납 \n 4. 도서 교체\n 5. 나가기  ");

		scanf("%d", &i);

		if(i==1)

		{

			for(;;)

			{

				printf("다음 중 어떤 항목으로 검색하시겠습니까? 단, 검색은 영문 대소문자를 구분합니다. 띄어쓰기는 '_' 로 입력하십시오. \n");

				printf(" 1) 제목 \n 2) 저자\n 3) 출판사\n 4) 도서 번호  ");

				scanf("%d", &j);

				if(j==1)

				{

					printf("검색어를 입력해 주십시오. \n");

					scanf("%s", &search);

					printf("결과를 출력합니다. \n");

					for(l=0;l<100;l++)

					{	

						book_search(book_list[l].title, search, &m);

						if(m == 1)

						{

							printf("  제목 : %s\n  저자 : %s\n  출판사 : %s\n  도서 번호 : %d\n", book_list[l].title,book_list[l].auth,book_list[l].publ,book_list[l].num);

							printf("  대출 가능 여부 : %c\n", book_list[l].borr);

							m = 0;

						}

					}

				}

				else if(j==2)

				{

					printf("검색어를 입력해 주십시오. \n");

					scanf("%s", &search);

					printf("결과를 출력합니다. \n");

					for(l=0;l<100;l++)

					{	

						book_search(book_list[l].auth, search, &m);

						if(m == 1)

						{

							printf("  저자 : %s\n  제목 : %s\n  출판사 : %s\n  도서 번호 : %d\n", book_list[l].auth,book_list[l].title,book_list[l].publ,book_list[l].num);

							printf("  대출 가능 여부 : %c\n", book_list[l].borr);

							m = 0;

						}

					}

				}

				else if(j==3)

				{

					printf("검색어를 입력해 주십시오 : ");

					scanf("%s", &search);

					printf("결과를 출력합니다. \n");

					for(l=0;l<100;l++)

					{	

						book_search(book_list[l].publ, search, &m);

						if(m == 1)

						{

							printf("  출판사 : %s\n  제목 : %s\n  저자 : %s\n  도서 번호 : %d\n", book_list[l].publ,book_list[l].title,book_list[l].auth,book_list[l].num);

							printf("  대출 가능 여부 : %c\n", book_list[l].borr);

							m = 0;

						}

					}

				}	

				else if(j==4)

				{

					printf("몇 번 도서를 검색하시겠습니까? \n");

					scanf("%d", &k);

					printf("도서 번호 %d 의 정보입니다. \n", book_list[k].num);

					printf("  제목 : %s\n  저자 : %s\n  출판사 : %s\n", book_list[k].title, book_list[k].auth,book_list[k].publ);

				}

				else

				{

					printf("수행할 수 없는 작업입니다. \n");

				}

				printf("더 검색하시겠습니까? y/n :");

				scanf(" %c", &a);

				if(a=='n')

				{

					break;

				}

			}

		}

		else if(i==2)

		{

			printf("대출할 도서의 번호를 입력해 주십시오. ");

			scanf("%d", &k);

			book_borrow(&book_list[k].borr);

		}

		else if(i==3)

		{

			printf("반납할 도서의 번호를 입력해 주십시오. ");

			scanf("%d", &k);

			book_return(&book_list[k].borr);

		}

		else if(i==4)

		{

			printf("변경할 도서의 번호를 선택해 주십시오.  ");

			scanf("%d", &n);

			book_list[n-1].num = n;

			book_change(&book_list[n-1]);

		}

		else if(i==5)

		{

			printf("도서관을 이용해 주셔서 감사합니다. \n");

			break;

		}

		else

		{

			printf("수행할 수 없는 작업입니다. \n");

		}

	}

	return 0;

}

char book_search(char *book_info, char *search, int *result) //검색을 하는 부분이다. 읽다 보면 그렇구나 싶다. 원시적이긴 하지만 글자를 하나 하나 따서 비교하는 방식으로 만들었다. 나중에는 더 나은 방식으로 뭔가 할 수 있기를 바란다.

{

	int i, j;

	char a;

	i = 0;

	j = 0;

	while(*search)

	{

		if(*search == *book_info)

		{

			book_info++;

			search++;

			i++;

			j++;

		}

		else

		{

			search=search-i;

			if(*book_info == '\0')

			{

				break;

			}

			else

			{

				book_info++;

				j++;

			}

			i = 0;

		}

	}

	if(*search == '\0')

	{

		*result = 1;

		search = search - i;

	}

	book_info = book_info-j;

	i = 0;

	j = 0;

	return 0;

}

int book_borrow(char *borr)

{

	if(*borr == 'y')

	{

		*borr = 'n';

		printf("도서가 대출되었습니다. \n");

	}

	else

	{

		printf("대출할 수 있는 도서가 아닙니다. \n");

	}

	return 0;

}

int book_return(char *borr)

{

	if(*borr == 'n')

	{

		*borr = 'y';

		printf("도서가 반납되었습니다. \n");

	}

	else

	{

		printf("반납할 수 있는 도서가 아닙니다. \n");

	}

	return 0;

}

char book_change(struct BOOK *book_list)

{

	int i;

	char b;

	printf("이전에 저장되어 있던 도서의 정보는 사라집니다. 계속 하시겠습니까? y/n :");

	scanf(" %c", &b);

	if(b == 'y')

	{

		printf("새로운 도서의 정보를 입력해 주십시오. \n");

		printf("제목 : ");

		scanf("%s", &(*book_list).title);

		printf("저자 : ");

		scanf("%s", &(*book_list).auth);

		printf("출판사 : ");

		scanf("%s", &(*book_list).publ);

		(*book_list).borr = 'y';

	}

	else if(b == 'n')

	{

		printf("작업이 취소되었습니다. \n");

	}

	else

	{

		printf("잘못된 작업입니다. \n");

	}

	return 0;

}

char book_default(char *book_info)

{

	*book_info = '\0';

	return 0;


}
