//0324 #5
//���� ���� ���� 3����/ n�� // multi class main---
package test5;

import java.util.Scanner;

public class Main extends Test{ //���/������/�ʵ�/�޼ҵ� ?????
	
	public Main(Scanner s) {
		super(s);
	}

	// redefine method overriding �ƹ������� ��¹���
	public void result()
	{
		System.out.println("main result---------");
		for (int i =0; i<n; i++)
		{
			System.out.printf("kor[%d]= %d\n",i,kor[i]);
			System.out.printf("eng[%d]= %d\n",i,eng[i]);
			System.out.printf("mat[%d]= %d\n",i,mat[i]);
			System.out.printf("tot[%d]= %d\n",i,tot[i]);
			System.out.printf("ave[%d]= %d\n",i,ave[i]);
			System.out.println("");
		}
	}
			
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		//Test t = new Test(s);
		Main m = new Main(s);
		boolean run = true;
		while(run)
		{
			System.out.println("----------------");
			System.out.println(" 1 : ���� �Է�    ");
			System.out.println(" 2 : ����        ");
			System.out.println(" 3 : ���        ");
			System.out.println(" 4 : ���        ");
			System.out.println(" ��Ÿ : quit     ");
			System.out.println("----------------");
			System.out.print(">>>>>> : ");
			int choice = s.nextInt();
			if (choice == 1)        m.input_proc();
			else if (choice == 2) 	m.comp_tot();
			else if (choice == 3)   m.comp_ave();
			else if (choice == 4)   m.result();
			else
			{ run = false; break;}
		}
		s.close();
	}
}
