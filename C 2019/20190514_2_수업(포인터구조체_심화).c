#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define N 10

struct linked{
	int data;
	struct linked *next;
};
struct linked *head, *p, *node, *q;
// font p :head current p :p new :node
void main(){
	//pointer test
	
	head = p = q = NULL;	// 초기화 (= int x=0;)
	
	node = (struct linked *)malloc(sizeof(struct linked));
	/* 포인터 메모리 확보
		int x=10;
		int *y;
		*y = 10	메모리를 갖고 있지 않아서 불가능
		y=(int *)malloc(sizeof(int));	y에게 메모리를 할당
		*y = 10; 메모리를 갖고 있어서 가능
	*/
	node->data = 1; 
	node->next = NULL;

	if(head == NULL){
		head = p = node;
	} else{
		p->next = node;
		p = node;
	}
	
	q = head;
	while(q != NULL){
		printf("%d -> ",q->data);
		q = q->next;

	}

	printf("\n\n");
}

