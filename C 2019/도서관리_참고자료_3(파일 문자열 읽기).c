#include <stdio.h>

 

int main(void){
     int state;
     char a;

 

     //데이터를 읽기위한 스트림 생성
     FILE* fp = fopen("D:\\mystory.txt", "rt");
     /* fopen함수는 오류발생시 NULL을 리턴하므로
     파일 개방 중 오류발생시 프로그램을 종료 */
     if (fp == NULL){
          printf("스트림 생성시 오류발생");
          return 1;
     }

 

     /* 파일에 얼마의 데이터가 있는지 모른다고 가정
     무한루프를 돌면서 계속 데이터를 출력
     파일에 끝에 도달하면 feof함수에 의해 반복문 탈출 */
     while (1){
          if (feof(fp) != 0){
               printf("파일의 끝에 도달했습니다.\n");
               break;
          }

 

          //한글자씩 꺼내서 출력
          a = fgetc(fp);
          printf("%c", a);
     }

 

     /* fclose함수는 종료시 오류가 발생하면
     0이 아닌 다른값을 리턴하므로 비정상 종료로 판단되면
     안내후 프로그램을 종료 */
     state = fclose(fp);
     if (state != 0){
          printf("스트림 제거시 오류발생");
          return 1;
     }

     return 0;
}

