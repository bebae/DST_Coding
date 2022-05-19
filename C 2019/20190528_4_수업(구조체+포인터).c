#include <stdio.h>

struct fruit{
	char title[20];
	int value;
	int num;
	struct fruit *next;
};
struct fruit *f,*head,*p,*n;

void main(){
	
	int choice;
	char name;
	int val, count;

	head = p = NULL;

	while(1){
		printf("──────────\n");
		printf("  과일가게\n");
		printf(" 1. 주문\n");
		printf(" 2. 팔기\n");
		printf(" 3. 리스트\n");
		printf(" 4. 종료\n");
		printf("──────────\n");
		printf(" menu select : ");
		scanf("%d",&choice);

		switch(choice){
			case 1:
				printf("──────────\n");
				printf("  주문 단계\n");
				printf(" 1. 과일이름 :");
				scanf("%s",&name);
				printf(" 2. 갯수 :");
				scanf("%d",&val);
				printf(" 3. 단가 :");
				scanf("%d",&count);

				printf("──────────\n");
				n = (struct fruit *)malloc(sizeof(struct fruit));
				n->title = name;
				n->value = val;
				n->num = count;		// 갯수는 지정
				n->next = NULL;

				if(head==NULL){
					head = p = n;
				}else{
					p->next = n;
					p = n;
				}

				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				
				break;
		}

	}
	

}
