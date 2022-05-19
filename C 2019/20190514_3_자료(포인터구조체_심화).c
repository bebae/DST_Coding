#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <malloc.h>

struct pt{
	int data;
	struct pt *link;
};
struct pt *p, *r, *head;

void main(){
	int i;
	struct pt *n = NULL;	

	srand(time(NULL));

	head = p = NULL;
	for(i=0;i<5;i++){
		n = (struct pt *)malloc(sizeof(struct pt));

		n->data = rand()%100 +1;
		n->link = NULL;

		if(head==NULL){
			head = n;
			p = n;
		} else{
			p->link = n;
			p = n;
		}
	}

	r = head;
	while(r != NULL){
		printf(" %d ->",r->data);
		r = r -> link;
	}
	
	printf("\n\n");
}
