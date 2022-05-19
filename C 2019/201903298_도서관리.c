#include <stdio.h>
#include <string.h>		// strtok �Լ��� ����� ��� ����
#include<process.h>		// exit �Լ�
#define _CRT_SECURE_NO_WARNINGS
#define N 10


struct book{
	int number;			//  ��Ϲ�ȣ
	char *tit[30];		//	å ����
	char *name[10];		//	����
	char *chu[10];		//	���ǻ�
	int year;			//	���࿬��
	char *conent[50];	//	å ���
	int num;			//  å �Ǽ�

	struct book *next;
};
struct book b[N], *head,*p,*node,*q;
//   *head=ù��° *p=���������� *node=���ο���� *q=��¿�������


void book_list();
void book_search();
void result1();
void result2();

void result1(){			// å �԰�	========== case 1
	FILE *book;
	char buf[200];
	int i;
	int count=0;									// ���� �԰��� å�� ������ ���� ���������� �ϱ� ���� ���� ��
	int len=0;										// �ǽð��ɷ� ���۱��̸� ����ش�
	int select = 0;									// �ű� �԰�� ���� �԰� �� ���� ����
	int num=0,n=0,plus_n=0;						// å�� ��ȣ,å�� �Ǽ�, �԰�� å�� �Ǽ�


	book = fopen("book.txt","r");
	
	// ������ ���� �ִ밪
	while( fgets(buf, sizeof(buf), book)){			// ������ �� ���� ������ ��� �� ��ŭ�� ���� ���
		len  = strlen(buf);							// buf�� ���̼��� ����
		if(len==0)									// ���� ���� 0�̸� �극��ũ
		  break;	
		count++;									// ���μ� ����
		buf[0]= '\0';								// ���� �ʱ�ȭ	
	}												// ���ϳ����� �� ���� Ȯ��. �����ʹ� ���������� ����
	fseek(book, 0L,SEEK_SET);						// �����͸� ó������ ����
	fclose(book);

		printf("������������������������������\n");
		printf("��     1. �ű� �԰�         ��\n");
		printf("��     2. ���� �԰�         ��\n");
		printf("������������������������������\n");
		printf(" ��ȣ�� �Է��ϼ��� : ");
		scanf("%d",&select);

	if (select == 1){		// �ű� �԰� ���� ��

		book = fopen("book.txt","a");				// ���� ���� �����ʹ� �������� ������ ���	

		printf("������������������������������\n");
		printf("��        �ű� �԰�         ��\n");
		printf("��  �Է��� �����ϰڽ��ϴ�!  ��\n");
		printf("������������������������������\n");
		// �԰� �Է�
		
		i = count;
		printf("����   : ");
		scanf("%s",&b[i].tit);
		printf("����   : ");
		scanf("%s",&b[i].name);
		printf("���ǻ� : ");
		scanf("%s",&b[i].chu);
		printf("����   : ");
		scanf("%d",&b[i].year);
		printf("���   : ");
		scanf("%s",&b[i].conent);
		printf("�Ǽ�   : ");
		scanf("%d",&b[i].num);
		
		
		
		fgets(buf,sizeof(buf),book);

		b[i].number = count+1;	
		fprintf(book,"%d %s %s %s %d %s %d\n",b[i].number,b[i].tit,b[i].name,b[i].chu,b[i].year,b[i].conent,b[i].num);

		fclose(book);
	}						// select 1 if �ݱ�

	if(select == 2){		// ���� �԰� ���� ��

		book = fopen("book.txt","r");

		printf("\n");
		for(i=0;i<count;i++){							// å ����� ��ȣ�� ���� ���
		
			b[i].number = i+1;
			fscanf(book,"%d %s %s %s %d %s %d",&b[i].number,b[i].tit,b[i].name,b[i].chu,&b[i].year,b[i].conent,&b[i].num);
			fgets(buf,sizeof(buf),book);

			
			printf("�� ��ȣ : %3d ��  ���� : %8s  ��  �Ǽ� : %3d  ��\n",b[i].number,&b[i].tit,b[i].num);
		}
		fclose(book);


		while(1){
			printf("\n�԰��� å�� ��ȣ�� �Է����ּ��� : ");
			scanf("%d",&n);
			if(n > count) {	// ��ο� �ִ� ��ȣ���� Ȯ��
					printf("��Ͽ� ���� ��ȣ �Դϴ�. �ٽ� �����ϼ���\n");
			} else break;
		}
		printf("�԰��� å�� �Ǽ��� �Է����ּ��� : ");
		scanf("%d",&num);
		
		fopen("book.txt","w");

		fseek(book, 0L,SEEK_SET);							// �����͸� ó������ ����. ó������ 0���� = ������ ���ۺκ� 
		fgets(buf,sizeof(buf),book);

		for(i=0;i<count;i++){								
			if((i+1) == n){				// ��Ͽ��� ������ ��ȣ���
				plus_n = b[i].num;							// ������ �԰�� å�� �Ǽ� ������ ���� ����
				b[i].num = b[i].num+num;					// �Է��� �Ǽ� ��ŭ ���ϱ�

				fprintf(book,"%d %s %s %s %d %s %d\n",i+1,b[i].tit,b[i].name,b[i].chu,b[i].year,b[i].conent,b[i].num);	
				printf("���� å�� �Ǽ� : %3d \n",b[i].num);
				
			} else {				// ������ ��ȣ�� �ƴ϶��
				fprintf(book,"%d %s %s %s %d %s %d\n",i+1,b[i].tit,b[i].name,b[i].chu,b[i].year,b[i].conent,b[i].num);
			}
		}													// ����� ��� for�� �ݱ�
		fclose(book);
	}						// select 2 if �ݱ�
		printf("������������������������������\n");
		printf("��  �Է��� �Ϸ�Ǿ����ϴ�!  ��\n");
		printf("������������������������������\n");

}
void result2(){				// å ��� ============ case 2
	FILE *book;
	char buf[200];
	int i,j;
	int len=0,count=0;								// ���� ���� �ִ밪 ���� �� �ʿ��� ����
	int num=0,n=0,minus_n=0;						// å�� ��ȣ,å�� �Ǽ�, ���� å�� �Ǽ�
	
	book = fopen("book.txt","r");

	// ������ ���� �ִ밪
	while( fgets(buf, sizeof(buf), book)){			// ������ �� ���� ������ ��� �� ��ŭ�� ���� ���
		len  = strlen(buf);							// buf�� ���̼��� ����
		if(len==0)									// ���� ���� 0�̸� �극��ũ
		  break;	
		count++;									// ���μ� ����
		buf[0]= '\0';								// ���� �ʱ�ȭ
	}
	fseek(book, 0L,SEEK_SET);						// �����͸� ó������ ����

	// å ��Ͽ��� ��ȣ�� ���� ǥ���� �� ��ȣ ���� �� ����� �Ǽ� �Է��Ͽ� ���� �Ǽ����� ����

	printf("\n");
	for(i=0;i<count;i++){							// å ����� ��ȣ�� ���� ���
	
		b[i].number = i+1;
		fscanf(book,"%d %s %s %s %d %s %d",&b[i].number,b[i].tit,b[i].name,b[i].chu,&b[i].year,b[i].conent,&b[i].num);
		fgets(buf,sizeof(buf),book);

		
		printf("�� ��ȣ : %3d ��  ���� : %8s  ��  �Ǽ� : %3d  ��\n",b[i].number,&b[i].tit,b[i].num);
	}

	fclose(book);

	printf("\n");
	while(1){
		printf("����� å�� ��ȣ�� �Է����ּ��� : ");
		scanf("%d",&n);
		if(n > count) {	// ��ο� �ִ� ��ȣ���� Ȯ��
				printf("��Ͽ� ���� ��ȣ �Դϴ�. �ٽ� �����ϼ���\n");
		} else break;
	}
	printf("����� å�� �Ǽ��� �Է����ּ��� : ");
	scanf("%d",&num);
	
	fopen("book.txt","w");

	fseek(book, 0L,SEEK_SET);							// �����͸� ó������ ����. ó������ 0���� = ������ ���ۺκ� 
	fgets(buf,sizeof(buf),book);

	for(i=0;i<count;i++){								
		if((i+1) == n){				// ��Ͽ��� ������ ��ȣ���
			minus_n = b[i].num;							// ������ ���� å�� �Ǽ� ������ ���� ����
			b[i].num = b[i].num-num;					// �Է��� �Ǽ� ��ŭ ����

			if(b[i].num <= 0){							// �Ǽ��� 0 ���ϰ� �Ǹ� ��� �������� ����
				printf("å�� ��� ��� �Ǿ����ϴ�!\n");
				printf("���� å�� �Ǽ� : %3d\n",minus_n);
			} else {									// �Ǽ��� 0 ���ϰ� �ƴ϶�� ��� ����
				fprintf(book,"%d %s %s %s %d %s %d\n",i+1,b[i].tit,b[i].name,b[i].chu,b[i].year,b[i].conent,b[i].num);	
				printf("���� å�� �Ǽ� : %3d \n",b[i].num);
			}
		} else {				// ������ ��ȣ�� �ƴ϶��
			fprintf(book,"%d %s %s %s %d %s %d\n",i+1,b[i].tit,b[i].name,b[i].chu,b[i].year,b[i].conent,b[i].num);
		}
		
	}													// ����� ��� for�� �ݱ�

	printf("������������������������������\n");
	printf("��  ������ �Ϸ�Ǿ����ϴ�!  ��\n");
	printf("������������������������������\n");


	fclose(book);
	
}

void book_search(){				// å �˻�	============ case 4
	 FILE *book;
	 char buffer[300],word[20];
	 int count=0;										// ���� ��

	 printf("������������������������������\n");
	 printf("�˻��� �ܾ� : ");
	 scanf("%s", word);
	 printf("������������������������������\n");

	 book = fopen("book.txt","r");
	 if( book==NULL){
		printf("File open error \n");
		exit(1);
	 }

	
	 while( fgets(buffer, 300, book)){
	  count++;										// ���μ�
	  if(strstr(buffer,word))							//���ڿ� ã���ִ� �Լ�
	   printf(" %d��° %s��(��) �˻�! \n",count,word);
	  else
	   printf(" %d��° �˻���� ���� \n",count);
	 }
	 fclose(book);
	 printf("������������������������������\n");
	 printf("������������������������������\n");
	 printf("��  �˻��� �Ϸ�Ǿ����ϴ�!  ��\n");
	 printf("������������������������������\n");

}

														// ��� ���
void book_list(){
	FILE *book;
	int i;
	char buf[200];										// �� ���� �����ϴ� ���ڿ�
	int len;											// �ǽð��ɷ� ���۱��̸� ����ش�
	char *token = NULL;									// �˻��� ����ϸ�, ���� �����
//	char str[150];										//���ۿ��� �Ѱܹ��� ���� ������ ����	
	int count = 0;										// ���μ��� ���� �ִ� ����
	

	book = fopen("book.txt","r");						// ���� ����
	
	if(book == NULL){									// ���� ���� Ȯ��
		printf("FILE OPEN ERROR!!\n\n");
		exit(1);
	} else {
		printf("���� ����\n");
	}
	 
	// ������ ���� �ִ밪
	 while( fgets(buf, sizeof(buf), book)){			// ������ �� ���� ������ ��� �� ��ŭ�� ���� ���
		len  = strlen(buf);							// buf�� ���̼��� ����
		if(len==0)									// ���� ���� 0�̸� �극��ũ
		  break;	
		count++;									// ���μ� ����
		buf[0]= '\0';								// ���� �ʱ�ȭ
	}												// ���ϳ����� �� ���� Ȯ��. �����ʹ� ���������� ����
	fseek(book, 0L,SEEK_SET);						// �����͸� ó������ ����. ó������ 0���� = ������ ���ۺκ� 


	printf("������������������������������\n");

	for(i=0;i<count;i++){
		
		fscanf(book,"%d %s %s %s %d %s %d",&b[i].number,b[i].tit,b[i].name,b[i].chu,&b[i].year,b[i].conent,&b[i].num);

		fgets(buf,sizeof(buf),book);

		// ��� �����
		printf("��ȣ   : %d \n",b[i].number);
		printf("����   : %s \n",b[i].tit);
		printf("����   : %s \n",b[i].name);
		printf("���ǻ� : %s \n",b[i].chu);
		printf("����   : %d \n",b[i].year);
		printf("���   : %s \n",b[i].conent);
		printf("�Ǽ�   : %d \n",b[i].num);
	printf("������������������������������\n");
		buf[i]= '\0';	

	}												// ��� for �� �ݱ�

	fclose(book);										// ���� �ݱ�
}

void main(){

	int x=-1;											// ���ð��� �����ϴ� ����


	head = p = NULL;


	while(x!=5){
			// ��� ���
		printf("\n������������������������������\n");
		printf("    �������� ���α׷� \n");
		printf("     1. å �԰�\n");
		printf("     2. å ���\n");
		printf("     3. ��� ���\n");
		printf("     4. ���� �˻�\n");
		printf("     5. ����\n");
		printf("������������������������������\n");
		printf("�޴� ���� : ");
		scanf("%d",&x);

		switch(x){
			case 1:										//�԰�
				result1();		
				break;
			case 2:										//���
				result2();
				break;
			case 3:										//���
				book_list();	
				break;
			case 4:										//�˻�
				book_search();
				break;
			case 5:
				printf("������������������������������\n");
				printf("��      ����Ǿ����ϴ�.     ��\n");
				printf("������������������������������\n");
				break;
			default:
				printf("����ġ ���� error�� �߻��߽��ϴ�\n");
				break;
		};

	}
	

	printf("\n");
}
/* 
			�Ұ���
	
	�ϴ� 
	�ð��� ��� �� �ߴٴ� �� ������ ���� �ʰ��� ���α׷��Ӵ� �׻� �ð��� �ƹ��� �־ ������ �����̴ϱ��
	������ �ð� �ȿ� ���� �� �� �ִ� �ּ��� ���Ͽ����� ���� �ƽ����� �����ϴ�

	�����Ϳ� ���Ͽ� �𸣴� �κ��� ���Ƽ� �����ʹ� �ᱹ �����Ű�� ���Ͽ��� 
	����� �� �迭�� �߰� �κ��� �����Ǿ����� �迭�� ������ ä��� ������ ���� �ʱ�ȭ �Ϸ��� �ߴµ� �� �ɷ��� �����Ͽ� ���� ���ϰ�
	�ϸ鼭 �𸣴� �κ��� ���Ƽ� �ڵ忡 ���ʿ��� �κ��� �������� ������ �κ��� ���� �־ ������� �ƽ����ϴ�
	
	

	������ ģ������ 
	�а����� C�� ���� �� �ϴ� �����̰� ������ �����̴� �����ͷ� �ڵ��� �Ͽ��⿡ �������� ������ ���� �� ������ ������ �κп��� �����Ͽ����ϴ�.
	�����̴� �� �о� ���� �� i=10�� �����Ͽ� �������� �������� ������ ���� ���� ���� ��� �����־����ϴ�.

	�� ������ ���� ���Ͽ� ���ؼ� ���� �˰� �Ǿ��� ������ ���� ����� �׷����� ������ �ذ��ϴ� ���� �˾ҽ��ϴ�.
	���� ������ ������ ���� �����͸� �˰� �����Ϳ� ���� �����Ͽ� ������ �� �ҽ��� �����Ű���� ����ϰڽ��ϴ�.

	���ڶ� �� �о��ּż� �����մϴ�.
	
	2019/06/14  ���α׷� ���� 1�г� 1�б� ���� ����
*/