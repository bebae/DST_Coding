package Vending;

import java.util.Scanner;

public class Ven_Manger extends Ven_Machine {
	
	Ven_Machine VMa = new Ven_Machine();
	
	
	
	// �������������������������������������������������������������������������������������������������������������� �޴� ���� ó�� �κ�
	int Update(int num,int sel,String str) {		// ���������������������������������������� �޴� ��ȣ / ������ �׸� / ������ ���� 
		Scanner sc = new Scanner(System.in);
		
		int temp1 = num-1;
		String str1;
		
		System.out.println("������������������������������������������������������������");
		System.out.println(str+" : "+Ven_Menu[temp1][sel]+"�� �����ϼ̽��ϴ�" );
		System.out.println("������������������������������������������������������������");
		
		if(sel == 1) {						// ���������������������������������� ���ڿ� ������ ����
			System.out.print("��ǰ���� �Է��ϼ��� :");
			str1 = sc.nextLine();
			Ven_Menu[temp1][sel] = str1;
		} else {
			Ven_Menu[temp1][sel] = Integer.toString(VMa.re_input(sel,str));

		}
		return sel;
	}
	
	// �������������������������������������������������������������������������������������������������������������� �޴� ���� UI
	int menuUpdate(int num) {
		
		int temp1 = num-1;				// ������ ���ڸ� �迭�� �°� �����ϰ� �ӽú����� ���� 
		int sel = 0;					// �����׸� ���� ����
		
		System.out.println("������������������������������������������������������������");
		System.out.printf("   "+Ven_Menu[temp1][0]+".	"+Ven_Menu[temp1][1]+""
				+ "	%4s��	%2s\n",Ven_Menu[temp1][2],Ven_Menu[temp1][3]);
		System.out.println("������������������������������������������������������������");
		System.out.println(" ��ǰ��ȣ     1.��ǰ��	2.����	3.���");
		System.out.println("������������������������������������������������������������");
		sel = VMa.re_input(sel,"�����׸�");
		
		switch(sel) {
			case 1 :
				Update(num,sel,"��ǰ��");
				break;
			case 2 :
				Update(num,sel,"����");
				break;
			case 3 :
				Update(num,sel,"���");
				break;
				
			default : 
				System.out.println();
				break;
		}
		
		
		return num;
	}
	
	// �������������������������������������������������������������������������������������������������������������� �޴� ����Ʈ ���
	void List() {
		System.out.println("������������������������������������������������������������");
		System.out.println(" ��ǰ��ȣ       ��ǰ��	 ����	���");
		System.out.println("������������������������������������������������������������");
		for (int i=0;i<Ven_Menu.length;i++) {
			if(Ven_Menu[i][0] != null) {
				System.out.printf("   "+Ven_Menu[i][0]+".	"+Ven_Menu[i][1]+""
						+ "	%4s��	%2s\n",Ven_Menu[i][2],Ven_Menu[i][3]);
			}
		}
		System.out.println("   0.   ���ư���");
		System.out.println("������������������������������������������������������������");
	}
	
	// �������������������������������������������������������������������������������������������������������������� �޴� ���� ����
	void management(int in,String str) {
		int num=0;
		
		while(true) {
			List();
			System.out.println(str+"�� ��ǰ�� �����ϼ���.");
			System.out.println("������������������������������������������������������������");
			num = VMa.re_input(num,"��ǰ��ȣ");
			switch(num) {
				case 0 :
					Adm_Run();
					break;
				// �������������������������������������������������������������������������� 0�� �ƴ� ����� ���� �� 
				default :
					if(in == 1) 				// ����
						menuUpdate(num);
					else if(in == 2)			// ����
						Menu_del(num);
					break;
			}
		}
		
	}
	
	// �������������������������������������������������������������������������������������������������������������� ���� UI �κ�
	void Adm_Run() {
		
 		Ven_Main vm = new Ven_Main();
 		
		int select=0;
		
		while(true) {
			System.out.println("������������������������������������������������������������");
			System.out.println("    1. �޴� ���� ����");
			System.out.println("    2. �޴� ���� ����");
			System.out.println("    3. �޴� �߰� ����");
//			System.out.println("    4. ���Ǳ� ����");
			System.out.println("    0. ���Ǳ� �̿�");
			System.out.println("������������������������������������������������������������");
			System.out.print("���� : ");
			select = VMa.re_input(select, "��ȣ");
			
			switch(select) {
				case 0 :
					VMa.Run(0);
					break;
				case 1 : 
					management(select,"����");
					break;
				case 2 :
					management(select,"����");
					break;
			
				case 3 :
					Menu_add();
					break;
				default :
					System.out.println("�ٽ� �Է�");
					break;
			}
		}
		
		
		
		
	}
}
