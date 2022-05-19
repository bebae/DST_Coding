#include <stdio.h>

struct linked{
	int xx;
	int yy;
	struct linked *next;
};
struct linked *head, *p, *node, *q;
//   *head=첫번째 *p=다음데이터 *node=새로운데이터 *q=출력용포인터

void main(){
	// file 

	FILE *out;
	int x=1,y=0;

	head = p = NULL;
	out = fopen("out.txt","w");

	while(x != 0){

		printf("input x, y : ");
		scanf("%d %d",&x,&y);
		printf("========\n");
		
		node = (struct linked *)malloc(sizeof(struct linked));
		node->xx = x;			// node->xx 값에 입력값 x를 넣기
		node->yy = y;
		node->next = NULL;		// 에러 방지

		if(head == NULL){
			head = p =node;
		} else{
			p->next = node;
			p = node;
		}

		q = head;				// 출력하기 위한 준비
		while(q!=NULL){
			
			fprintf(out,"%d %d\n",q->xx,q->yy);	//데이터 출력
			q = q->next;		// 다음 데이터로 이동
		}

		
	}
	q = head;				
	while(q!=NULL){
		printf("%d + %d = %d\n",q->xx,q->yy,(q->xx+q->yy));
		q = q->next;
	}	

	fclose(out);

}
