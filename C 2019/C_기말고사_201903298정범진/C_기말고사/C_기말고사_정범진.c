
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

struct sexual{
		int num;
		int os;
		int db;
		int ca;
		int ic;
		int sys;
		int sum;
		int ave;
		int rank;

};
struct sexual *s,*head,*p,*node,*q;


void result1(){			// ���� ���ϱ�
	
	struct sexual s1[3] = { 0,};	// ����ü �ʱ�ȭ
	int i,j;
	int selet=0;		// �޴� ���� ����
	char gra[5];
	int num=0;			// �л� ��
	FILE *in,*out;			// ����
	char yn[10];
	int pass[3]={ 1,};	// ���� ����
	char *np = "NonPass", *yp = "Pass";

	srand(time(NULL));
	head = p = NULL;

	
	
	printf("�л� ���� �Է��ϼ��� : ");
	scanf("%d",&num);

	in = fopen("in.txt","r");	// ���� �о����
	out = fopen("out.txt","w+");	// ���� ����
	
	for(;;){
		printf("��������������������������������������������������������\n");
		printf("��                    �л� ����ó��                   ��\n");
		printf("��������������������������������������������������������\n");

		
		for(i=0;i<num;i++){
			pass[i]=1;		// ���� �ʱ�ȭ
		

		// ������ ����
			s1[i].os = (rand() % 50)+50;
			s1[i].db = (rand() % 50)+50;
			s1[i].ca = (rand() % 50)+50;
			s1[i].ic = (rand() % 50)+50;
			s1[i].sys = (rand() % 50)+50;
		
			s1[i].sum = s1[i].os+s1[i].db+s1[i].ca+s1[i].ic+s1[i].sys;
			s1[i].ave = s1[i].sum/5;
			if(s1[i].ave >= 90){
				gra[i] = 'A';
			}else if(s1[i].ave  >= 80){
				gra[i] = 'B';
			}else if(s1[i].ave  >= 70){
				gra[i] = 'C';
			}else if(s1[i].ave  >= 60){
				gra[i] = 'D';
			}else {
				gra[i] = 'F';
			}

					// ��� ����
//			printf("������������������������������������������\n");
			if(s1[i].os<60){
//				printf("OS �̴�\n");
				pass[i]=0;
			}
			if(s1[i].db<60){
//				printf("DB �̴�\n");
				pass[i]=0;
			}
			if(s1[i].ca<60){
//				printf("CA �̴�\n");
				pass[i]=0;
			}
			if(s1[i].ic<60){
//				printf("IC �̴�\n");
				pass[i]=0;
			}
			if(s1[i].sys<60){
//				printf("SYS �̴�\n");
				pass[i]=0;
			}
//			printf("������������������������������������������\n");
			
		}	// ��� FOR �ݱ�

		// ���� �ʱ�ȭ
		for(i=0;i<num;i++){
			s1[i].rank=0;		
		}
		
		for(i=0;i<num;i++){
			for(j=0;j<num;j++){
				if(s1[i].sum < s1[j].sum){
					s1[i].rank++;
				}
			}
			s1[i].rank++;		// 0�̹Ƿ� +1
		}
		
		
		printf("����������������������������������������������������������������������\n");
		printf("��                                �հ�                              ��\n");
		printf("����������������������������������������������������������������������\n");
		printf("��   os    db    ca    ic   sys  ����   ���  ����   Pass/Non  Drop ��\n");
		printf("����������������������������������������������������������������������\n");

		for(i=0;i<num;i++){
			printf("��");
			printf(" %4d  %4d  %4d  %4d  %4d",s1[i].os,s1[i].db,s1[i].ca,s1[i].ic,s1[i].sys);
			printf("  %4d   %4d  %4d ",s1[i].sum,s1[i].ave,s1[i].rank);

			fprintf(out," %4d  %4d  %4d  %4d  %4d",s1[i].os,s1[i].db,s1[i].ca,s1[i].ic,s1[i].sys);
			fprintf(out,"  %4d   %4d  %4d ",s1[i].sum,s1[i].ave,s1[i].rank);

			if(s1[i].ave>=60){
				printf("%9s ",yp);
				fprintf(out,"%9s ",yp);
			} else{
				printf("%9s ",np);
				fprintf(out,"%9s ",np);
			}

			if(pass[i]==1){
				yn[i] = 'N';
				printf(" %3c ",yn[i]);
				fprintf(out," %3c ",yn[i]);
			} else{
				yn[i] = 'Y';
				printf(" %3c ",yn[i]);
				fprintf(out," %3c ",yn[i]);
			}
			printf("  ��\n");
			fprintf(out,"\n");
		}

		printf("����������������������������������������������������������������������\n");

		printf("������������������������������������\n");
		printf("��       ����ϽÁٽ��ϱ�?        ��\n");
		printf("��         1.��� 2.�޴�          ��\n");
		printf("������������������������������������\n");
		scanf("%d",&selet);
		
		if(selet==2){
			fclose(in);			//	in ���� �ݱ�
			fclose(out);		//	out ���� �ݱ�		
			break;
		}
	}	// ���� for

	fclose(in);			//	in ���� �ݱ�
	fclose(out);		//	out ���� �ݱ�
}


void result2(){			// 10���� ����
	int i,j;
	int selet=0;
	int num[10]={ 0,};
	int max=-1000,min=1000;		// �ּڰ�/�ִ밪
	int ave,sum=0;
	int chr,chr_min=100;		//��� ���簪
	int tmp;					// ���Ľ� �ʿ亯��
	int *p;				// ������

	srand(time(NULL));
	p = &num[0];		// ������ �ʱ�ȭ

	
	for(;;){

		sum = 0;

		printf("����������������������������������������������\n");
		printf("��            10���� ����(1~100)            �� \n");
		printf("����������������������������������������������\n");
		printf("����������������������������������������������\n");
		printf("��                  ������                  ��\n");
		printf("����������������������������������������������\n");
		printf("�� ");
		for(i=0;i<10;i++){		// �ִ밪/�ּҰ�
			num[i] = (rand() % 100)+1;		//������ ������ �迭�� ����
			
			
			printf(" %3d",*(p+i));

			if(*(p+i)>max){
				max=*(p+i);
			}
			if(num[i]<min){
				min=*(p+i);
			}
			sum += *(p+i);
		}
		ave = sum/10;
		
		printf(" ��\n");

		for(i=0;i<10;i++){	// ����
			for(j=0;j<10;j++){
				if(num[i] > num[j]){	// ��������
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		

		printf("����������������������������������������������\n");
		
		printf("����������������������������������������������\n");
		printf("��          �ִ밪  �ּҰ�  ��հ�          ��\n");
		printf("��           %4d   %4d    %4d            ��\n",max,min,ave);
		printf("����������������������������������������������\n");

		printf("����������������������������������������������\n");
		printf("��                  ������                  ��\n");
		printf("����������������������������������������������\n");
		printf("�� ");
		for(i=0;i<10;i++){
			printf(" %3d",*(p+i));
		}
		printf(" ��\n");
		printf("����������������������������������������������\n");

			
		printf("������������������������������������\n");
		printf("��       �޴��� ���ðڽ��ϱ�?     ��\n");
		printf("��            1.�޴�              ��\n");
		printf("������������������������������������\n");
		scanf("%d",&selet);
		
		if(selet==1) break;
		else break;
	}
}
void result3(){
	printf(" ���α׷����� �⸻��縦 �ϸ鼭...\n\n");
	printf(" �ƽ��� ��\n");
	printf(" 1. �ϴ� �����͸� ��Ȯ�ϰ� �������� ���ؼ� 1�������� �������� �� �Ͽ���\n 2�� �������� ���� ���ʸ� ���� �� �ƽ����ϴ�.\n\n");
	printf(" 2. ������ �о���� �͵� ���� ���ؿ� �ð��� �����Ͽ� �����Ű�� �� �Ͽ����ϴ�.\n\n");
	printf("==========����==========\n\n");
	printf(" ������ �߾��� �ҽ��� ���ļ� ����Ͽ����� ���� �����Ϳ� ����ü, \n\n������ ��Ȯ�� �������� ���� ���¶� �����Ű�� ���� �� \n\n");
	printf("������ �ƽ��� �⸻��簡 �������� ����ؼ� �����Ͽ� �����Ͽ� \n\n�� ������ ����� ���� ���� �����ϰڽ��ϴ�!\n\n");
}


void main(){
	int x=-1;
	
	while(x!=4){

		printf("������������������������������������\n");
		printf("��          Muen                  ��\n");
		printf("��  1. �������ϱ�                 ��\n");
		printf("��  2. 10���� �������� ����       ��\n");
		printf("��  3. �������� ��                ��\n");
		printf("��  4. ����                       ��\n");
		printf("������������������������������������\n");

		scanf("%d",&x);

		
		switch(x){
			case 4:
				printf("          ������������\n");
				printf("          ��  ����  ��\n");
				printf("          ������������\n");
				break;
			case 1:		// �������ϱ�
				result1();
				break;
			case 2:		// 10�� ����
				result2();
				break;
			case 3:
				result3();
				break;
			default:
				printf("ERROR\n");
				break;
		};
	}

}
// ������_201903298