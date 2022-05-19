// #3  
#include <stdio.h>

struct linked{
	char name[10];
	int xx;
	struct linked *next;
};
struct linked *head, *p, *node, *q;
//   *head=첫번째 *p=다음데이터 *node=새로운데이터 *q=출력용포인터

void main(){

	FILE *out;
	int x=1,y=0;
	int ok=1;

	head = p = NULL;
	out = fopen("out.txt","w");

	while(ok == 1){

		printf("x : ");
		scanf("%d",&x);
		printf("========\n");
		
		if(x==0){
			ok = 0;
			break;
		}
		node = (struct linked *)malloc(sizeof(struct linked));
		node->xx = x;			// node->xx 값에 입력값 x를 넣기
		
		node->next = NULL;		// 에러 방지

		if(head == NULL){
			head = p =node;
		} else{
			if(q->xx < node->xx){	// 포인터 정렬(어려움) 교수님 설명하다 말음
				head = node;
				head->next = q;
			}else{
				q = q->next;
				p->next = node;
				p = node;
			}
		}
	}
	q = head;				
	while(q!=NULL){
		printf("%d\n",q->xx);
		q = q->next;
	}	

	fclose(out);

}
