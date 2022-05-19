#include <stdio.h>
#include <stdlib.h>  
#include <string.h>

int i;
 
typedef struct BOOK {
    char book_name[30];
    char auth_name[30];
    char publ_name[30];
    int borrowed;
}BOOK;
char search_str(char * dic, char * word);
int register_book(BOOK *book_list, int *nth);
int search_book(BOOK *book_list, int total_num_book);
int borrow_book(BOOK *book_list);
int return_book(BOOK *book_list);
int print_book_list(BOOK *book_list, int total_num_book);
int retrieve_book_info(BOOK **book_list, int *total_num_book);
 
int main() {
    int user_choice; /* 유저가 선택한 메뉴 */
    int num_total_book = 0; /* 현재 책의 수 */

 
    BOOK *book_list;
 
    printf("도서관의 최대 보관 장서 수를 설정해주세요 : ");
    scanf_s("%d", &user_choice);
    
    book_list = (BOOK *)malloc(sizeof(BOOK) * user_choice);
 
    while (1) {
        printf("도서 관리 프로그램 \n");
        printf("메뉴를 선택하세요 \n");
        printf("1. 책을 새로 추가하기 \n");
        printf("2. 책을 검색하기 \n");
        printf("3. 책을 빌리기 \n");
        printf("4. 책을 반납하기 \n");
        printf("5. 책들의 내용을 book_list.txt 에 출력 \n");
        printf("6. 책들의 내용을 book_list.txt 에서 불러옴\n");
        printf("7. 책들의 목록을 출력 \n");
        printf("8. 프로그램 종료 \n");
 
        printf("당신의 선택은 : ");
        scanf_s("%d", &user_choice);
 
        if (user_choice == 1) {
            /* 책을 새로 추가하는 함수 호출 */
            register_book(book_list, &num_total_book);
        }
        else if (user_choice == 2) {
            /* 책을 검색하는 함수 호출 */
            search_book(book_list, num_total_book);
        }
        else if (user_choice == 3) {
            /* 책을 빌리는 함수 호출 */
            borrow_book(book_list);
        }
        else if (user_choice == 4) {
            /* 책을 반납하는 함수 호출 */
            return_book(book_list);
        }
        else if (user_choice == 5) {
            print_book_list(book_list, num_total_book);
        }
        else if (user_choice == 6) {
            retrieve_book_info(&book_list, &num_total_book);
        }
        else if (user_choice == 7) {
            for (i = 0; i < num_total_book; i++) {
                printf("%s // %s // %s // ", book_list[i].book_name, book_list[i].auth_name, book_list[i].publ_name);
                if (book_list[i].borrowed == 0) printf("NO\n");
                else printf("YES\n");
            }
        }
        else {
            printf("/* 프로그램을 종료. */");
            break;
        }
    }
    free(book_list);
    return 0;
}
char search_str(char * dic, char * word) {
    int loc = 0;
    int search_loc = 0;
 
    while (*dic) {
        if (*dic == *word) {
            while (*word) {
                if (*dic != *word) {
                    word -= search_loc;
                    loc += search_loc;
                    search_loc = 0;
                    break;
                }
                dic++;
                word++;
                search_loc++;
                if (*word == 0) {
                    return loc;
                }
            }
        }
        dic++;
        loc++;
    }
    return -1;
}
int register_book(BOOK *book_list, int *nth) {
    printf("책의 이름 : ");
    scanf_s("%s", book_list[*nth].book_name, sizeof(book_list[*nth].book_name));
 
    printf("책의 저자 : ");
    scanf_s("%s", book_list[*nth].auth_name, sizeof(book_list[*nth].auth_name));
 
    printf("책의 출판사 : ");
    scanf_s("%s", book_list[*nth].publ_name, sizeof(book_list[*nth].publ_name));
 
    book_list[*nth].borrowed = 0;
    (*nth)++;
 
    return 0;
}
int search_book(BOOK *book_list, int total_num_book) {
    int user_input; /* 사용자의 입력을 받는다. */
    int i;
 
    char user_search[30];
    printf("어느 것으로 검색 할 것인가요? \n");
    printf("1. 책 제목 검색 \n");
    printf("2. 지은이 검색 \n");
    printf("3. 출판사 검색 \n");
    scanf_s("%d", &user_input);
 
    printf("검색할 단어를 입력해주세요 : ");
    scanf_s("%s", user_search, sizeof(user_search));
    printf("검색 결과 \n");
 
    if (user_input == 1) {
        for (i = 0; i < total_num_book; i++) {
            if (search_str(book_list[i].book_name, user_search) >= 0) {
                printf("번호 : %d // 책 이름 : %s // 지은이 : %s // 출판사 : %s \n", i, book_list[i].book_name, book_list[i].auth_name, book_list[i].publ_name);
            }
            else printf("그런 책 없음.\n");
        }
    }
    else if (user_input == 2) {
        for (i = 0; i < total_num_book; i++) {
            if (search_str(book_list[i].auth_name, user_search) >= 0) {
                printf("번호 : %d // 책 이름 : %s // 지은이 : %s // 출판사 : %s \n", i, book_list[i].book_name, book_list[i].auth_name, book_list[i].publ_name);
            }
            else printf("그런 책 없음.\n");
        }
    }
    else if (user_input == 3) {
        for (i = 0; i < total_num_book; i++) {
            if (search_str(book_list[i].publ_name, user_search) >= 0) {
                printf("번호 : %d // 책 이름 : %s // 지은이 : %s // 출판사 : %s \n", i, book_list[i].book_name, book_list[i].auth_name, book_list[i].publ_name);
            }
            else printf("그런 책 없음.\n");
        }
    }
    return 0;
}
int borrow_book(BOOK *book_list) {
    /* 사용자로 부터 책번호를 받을 변수*/
    int book_num;
 
    printf("빌릴 책의 번호를 말해주세요 \n");
    printf("책 번호 : ");
    scanf_s("%d", &book_num);
 
    if (book_list[book_num].borrowed == 1) {
        printf("이미 대출된 책입니다! \n");
    }
    else {
        printf("책이 성공적으로 대출되었습니다. \n");
        book_list[book_num].borrowed = 1;
    }
 
    return 0;
}
int return_book(BOOK *book_list) {
    /* 반납할 책의 번호 */
    int num_book;
 
    printf("반납할 책의 번호를 써주세요 \n");
    printf("책 번호 : ");
    scanf_s("%d", &num_book);
 
    if (book_list[num_book].borrowed == 0) {
        printf("이미 반납되어 있는 상태입니다\n");
    }
    else {
        book_list[num_book].borrowed = 0;
        printf("성공적으로 반납되었습니다\n");
    }
 
    return 0;
}
int print_book_list(BOOK *book_list, int total_num_book) {
    FILE *fp;
    errno_t err = fopen_s(&fp, "book_list.txt", "w");
    if (err == 0) {
        printf("success!! ");
    }
    else {
        printf("error");
        return 0;
    }
    fprintf(fp, "%d\n", total_num_book);
 
    for (i = 0; i < total_num_book; i++) {
        fprintf(fp, "%s\n%s\n%s\n", book_list[i].book_name, book_list[i].auth_name, book_list[i].publ_name);
        if (book_list[i].borrowed == 0) fprintf(fp, "NO\n");
        else fprintf(fp, "YES\n");
    }
 
    fclose(fp);
 
    return 0;
}
int retrieve_book_info(BOOK **book_list, int *total_num_book) {
    FILE *fp;
    errno_t err = fopen_s(&fp, "book_list.txt", "r");
    int total_book;
    char borrow[10];
    if (err == 0) {
        printf("success!! ");
    }
    else {
        printf("error");
        return 0;
    }
    fscanf_s(fp, "%d", &total_book);
    *total_num_book = total_book;
 
    free(*book_list);
    (*book_list) = (BOOK *)malloc(sizeof(BOOK) * total_book);
;
    for (i = 0; i < total_book; i++) {
        fscanf_s(fp, "%s", (*book_list)[i].book_name, sizeof((*book_list)[i].book_name));
        fscanf_s(fp, "%s", (*book_list)[i].auth_name, sizeof((*book_list)[i].auth_name));
        fscanf_s(fp, "%s", (*book_list)[i].publ_name, sizeof((*book_list)[i].publ_name));
        fscanf_s(fp, "%s", borrow, sizeof(borrow));
        //printf("%s %s %s %s\n", (*book_list)[i].book_name, (*book_list)[i].auth_name, (*book_list)[i].publ_name, borrow);
        //printf("%d\n", strcmp(borrow, "NO"));
        if (strcmp(borrow, "NO") == 0) (*book_list)[i].borrowed = 0;
        else if(strcmp(borrow, "YES") == 0) (*book_list)[i].borrowed = 1;
        //printf("%d", (book_list[i])->borrowed);
    }
 
    return 0;
}
