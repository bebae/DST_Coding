
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

struct sexual{
		int num;
		int kor;
		int mat;
		int eng;
		int sum;
		int ave;
		int rank;
};
void result1(){			// ���� ���ϱ�
	
	struct sexual s1[3] = { 0,};
	int i,j;
	int selet=0;
	char gra[5];

	srand(time(NULL));


	
	for(;;){
		printf("��������������������������������������������������\n");
		printf("��                 �л� ����ó��                ��\n");
		printf("��������������������������������������������������\n");


		for(i=0;i<3;i++){


			s1[i].kor = (rand() % 50)+50;
			s1[i].mat = (rand() % 50)+50;
			s1[i].eng = (rand() % 50)+50;
			
			s1[i].sum = s1[i].kor+s1[i].mat+s1[i].eng;
			s1[i].ave = s1[i].sum/3;
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
		
		}
		// ���� �ʱ�ȭ
		for(i=0;i<3;i++){
			s1[i].rank=0;		
		}
		
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				if(s1[i].sum < s1[j].sum){
					s1[i].rank++;
				}
			}
			s1[i].rank++;		// 0�̹Ƿ� +1
		}
		
		
		printf("��������������������������������������������������������\n");
		printf("��                         �հ�                       ��\n");
		printf("��������������������������������������������������������\n");
		printf("��  �л�    kor   mat   eng   ����   ���  ����  ���� ��\n");
		printf("��������������������������������������������������������\n");

		for(i=0;i<3;i++){
			printf("��  %3d  ",i+1);
			printf("  %4d  %4d  %4d",s1[i].kor,s1[i].mat,s1[i].eng);
			printf("   %4d   %4d  %3c  %4d  ��\n",s1[i].sum,s1[i].ave,gra[i],s1[i].rank);
		}

		printf("��������������������������������������������������������\n");

		printf("������������������������������������\n");
		printf("��       ����ϽÁٽ��ϱ�?        ��\n");
		printf("��         1.��� 2.����          ��\n");
		printf("������������������������������������\n");
		scanf("%d",&selet);
		
		if(selet==2) break;
	}
}

void result2(){			// Ȧ���� ��
	int i;
	int x,y;
	int num,sum=0;
	int selet=0;

	srand(time(NULL));
	
	
	for(;;){
		x = (rand() % 100)+1;
		y = (rand() % 100)+1;

		sum = 0;

		printf("��������������������������\n");
		printf("      X : %d   Y : %d     \n",x,y);
		printf("��������������������������\n");

		if(x>=y){
			num = y;

			for(i=0;i<x;i++){	
				if(num % 2 != 0){
					sum+=num;
				}
				num++;
			}
		} else {
			num = x;

			for(i=0;i<y;i++){	
				if(num % 2 != 0){
					sum+=num;
				}
				num++;
			}
		}

		printf("��������������������������\n");
		printf("     X ~ Y �� �� : %4d    \n",sum);
		printf("��������������������������\n");
		
		printf("��������������������������\n");
		printf("��   ����ϽÁٽ��ϱ�?  ��\n");
		printf("��     1.��� 2.����    ��\n");
		printf("��������������������������\n");
		scanf("%d",&selet);
		
		if(selet==2) break;
	}
}

void result3(){			// 10���� ����
	int i;
	int selet=0;
	int num[10]={ 0,};
	int max=-1000,min=1000;
	int ave,sum=0;
	int chr,chr_min=100;		//��� ���簪
	int max_n,min_n,chr_n;		// ���� ��ġ
	
	srand(time(NULL));
	
	for(;;){
		max_n = 0;
		min_n = 0;
		chr_n = 0;
		sum = 0;

		printf("������������������������������������\n");
		printf("��        10���� ����(1~100)      �� \n");
		printf("������������������������������������\n");
		
		printf("����������������������������������������\n");
		for(i=0;i<10;i++){
			num[i] = (rand() % 100)+1;
			
			printf(" %d ",num[i]);

			if(num[i]>max){
				max=num[i];
				max_n = i+1;
			}
			if(num[i]<min){
				min=num[i];
				min_n = i+1;
			}
			sum += num[i];
		}
		ave = sum/10;
		
		for(i=0;i<10;i++){

			if(num[i]<=ave){
				chr = ave-num[i];
			}else if(num[i]>ave){
				chr = num[i]-ave;
			}
			if(chr<chr_min){
				chr_min = chr;
				chr_n = i+1;
			}
		}
		for(i=0;i<10;i++){
			ave = num[chr_n-1];
		
		}

		printf("\n����������������������������������������\n");
		
		printf("������������������������������������\n");
		printf("��      �ִ밪  �ּҰ�  ��հ�    ��\n");
		printf("��       %4d    %4d    %4d     ��\n",max,min,ave);
		printf("�� ��ġ  %4d    %4d    %4d     ��\n",max_n,min_n,chr_n);
		printf("������������������������������������\n");

			
		printf("������������������������������������\n");
		printf("��        �����ϽÁٽ��ϱ�?       ��\n");
		printf("��            1.����              ��\n");
		printf("������������������������������������\n");
		scanf("%d",&selet);
		
		if(selet==1) break;
		else break;
	}
}


void main(){
	int x=-1;
	
	while(x!=4){

		printf("������������������������������������\n");
		printf("��          Muen                  ��\n");
		printf("��  1. �������ϱ�                 ��\n");
		printf("��  2. X~Y���� Ȧ���� ��          ��\n");
		printf("��  3. 10�������� �ִ�/�ּ�/���  ��\n");
		printf("��  4. ����                       ��\n");
		printf("������������������������������������\n");

		scanf("%d",&x);

		
		switch(x){
			case 4:
				printf("          ������������\n");
				printf("          ��  ����  ��\n");
				printf("          ������������\n");
				break;
			case 1:		// ����ó��
				result1();
				break;
			case 2:		// �ֻ�������
				result2();
				break;
			case 3:		// ��Ģ����
				result3();
				break;
			case 5:		// �޴� �ٽú���
				break;
			default:
				printf("ERROR\n");
				break;
		};
	}

}
// ������_201903298