// #2  
#include <stdio.h>

struct linked{
	char name[10];
	int os;
	int db;
	int ic;
	int sys;
	int ca;
	int tot;
	struct linked *next;
};
struct linked *head, *p, *node, *q;
//   *head=첫번째 *p=다음데이터 *node=새로운데이터 *q=출력용포인터

void main(){

	FILE *out;
	int x=1,y=0;
	int ok=1;
	char name[10];
	int os,db,ic,sys,ca;

	head = p = NULL;
	out = fopen("out.txt","w");

	while(ok == 1){

		printf("name  os  db  ic sys  ca\n");
		scanf("%5s %d %d %d %d %d",&name,&os,&db,&ic,&sys,&ca);
		printf("========\n");
		
		node = (struct linked *)malloc(sizeof(struct linked));
		node->os = os;			// node->xx 값에 입력값 x를 넣기
		node->db = db;
		node->ic = ic;
		node->sys = sys;
		node->ca = ca;
		node->tot = node->os+node->db+node->ic+node->sys+node->ca;
		node->next = NULL;		// 에러 방지

		if(head == NULL){
			head = p =node;
		} else{
			p->next = node;
			p = node;
		}
		///////////////////////////////////////////// 미완성
	}
	q = head;				
	while(q!=NULL){
		printf("%5s %d %d %d %d %d\n",q->name,q->os,q->db,q->ic,q->sys,q->ca);
		q = q->next;
	}	

	fclose(out);

}
