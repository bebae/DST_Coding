package Vending;
import java.io.*;
import java.util.*;

public class Ven_Machine<string> extends Ven_Main{
	


	// ���������������������������������������������������������������������������������������������� �Է� �ݺ� �Լ�
	int re_input(int in,String string){
		Scanner sc = new Scanner(System.in);
		
		while(true) {			
			System.out.print(string+"��/�� �Է��ϼ��� :");
			try {
				in = sc.nextInt();					// ���� �Է�
				break;
			} catch (InputMismatchException e) {	// ���� �̿��� ���� �Է������� ����ó�� 
				sc = new Scanner(System.in);		// catch �ȿ��� �ʱ�ȭ ���� ������ ���� Loop �߻�
				System.out.println("�߸��� �Է°� �Դϴ�.");
			}
		}
		return in;
	}
	
	void Run(int money) {
		
		int auto = 1;			// ���������������� �ڵ� ����
		
		if(auto == 1) {
			System.out.println("5000���� �ڵ����� �����մϴ�");
			money += 5000;
		} else {
		Scanner sc = new Scanner(System.in);
		// ���������������������������������������������������������������������������������������������� �Է� 
		money = re_input(money,"��");
		}
		
		Menu(money);
	}
	
	// �������������������������������������������������������������������������������������������������������������� ���� �κ�
	void Stop(int money) {
		int sel=0;
		
		System.out.println("������������������������������������������������������������");
		System.out.println(" �ܵ� : "+money);
		System.out.println("  1. �ܵ� �ֱ�   2.������");
		System.out.println("������������������������������������������������������������");
		if(re_input(sel,"��ȣ") == 1) {
			Run(money);
		} else {
			System.out.println("������������������������������������������������������������");
			System.out.println("����� �����մϴ�.");
			System.out.println("������������������������������������������������������������");
			System.exit(0);
		}
	}
	
	// �������������������������������������������������������������������������������������������������������������� �޴� ���
	int menu_set(int m) {
		int scarce=0;	// ���� ������ ��� ���� ���� ����
		
		for (int i=0;i<Ven_Menu.length;i++) {
			if(Integer.parseInt(Ven_Menu[i][2]) <= m) {
				scarce += 1;
			}
		}
		
		if(scarce > 0) {		// ��� ������ 1 �̻��� ��
			System.out.println(" ��ǰ��ȣ       ��ǰ��	 ����	���");
			System.out.println("������������������������������������������������������������");
			for (int i=0;i<Ven_Menu.length;i++) {
				if(Integer.parseInt(Ven_Menu[i][2]) <= m) {
					System.out.printf("   "+Ven_Menu[i][0]+".	"+Ven_Menu[i][1]+""
							+ "	%4s��	%2s\n",Ven_Menu[i][2],Ven_Menu[i][3]);
				}
			}
			System.out.println("   0.   ��ȯ/���");
		} else {
			System.out.println("      ���� �ݾ����� ���� ������ ��ǰ�� �����ϴ�.");
			System.out.println("	   �ܵ��� ��ȯ �մϴ�.       ");
			
		}
		return scarce;
	}
	
	// �������������������������������������������������������������������������������������������������������������� �޴� ���� �� ó�� �κ�
	int account(int num,String drink,int money) {
		int temp1 = Integer.parseInt(Ven_Menu[num-1][2]);	// ����� ����
		int temp2 = Integer.parseInt(Ven_Menu[num-1][3]);	// ��� �ӽ� ������ ����
		
		if (money < temp1) { 									// ��տ� ���� �޴� ���� ��
			System.out.println("���� �ݾ����� ���� �Ұ� ��ǰ�Դϴ�\n");			
			
		} else {												// ��Ͽ� �ִ� �޴� ���� ��
			System.out.println("������������������������������������������������������������");
			System.out.println("    "+drink+"�� �����ϼ̽��ϴ�");
			if(temp2 < 1) {				// ��� Ȯ��
				System.out.println("  ���� �� ��ǰ�� ǰ�� ���� �Դϴ�");
			} else {	
				money -= temp1;
				temp2 -= 1;				// ��� -1
				
				Ven_Menu[num-1][3] = Integer.toString(temp2);
				
				System.out.println("     ���� : "+temp1);
				System.out.println("     ��� : "+Ven_Menu[num-1][3]);
				System.out.println("     �ܾ� : "+money);
			}
			System.out.println("������������������������������������������������������������");
			System.out.println();
		}
		return money;
	}
	
	// �������������������������������������������������������������������������������������������������������� �޴� ���� �� ó��
	void Menu(int money) {
		Ven_Machine VM = new Ven_Machine();		
		Scanner sc = new Scanner(System.in);
		int sel=0;
		
		
		while(true) {
			System.out.println("������������������������������������������������������������");
			// �������������������������������������������������������������������������������������������������������� ������ �� �ִ� ���� 1���� ���� ��	
			if(menu_set(money) == 0) {				
				Stop(money);
				
			
			// �������������������������������������������������������������������������������������������������������� ������ �� �ִ� ���� 1���� ���� ��
			} else {								
				System.out.println("������������������������������������������������������������");
				
				
				// �ùٸ� ���� �Է��� ������ �ݺ�
				while(true) {			
					System.out.println("���� �ܾ� : "+money);
					// ����� ����
					System.out.print("����� ���� : ");
					
					try {
						sel = sc.nextInt();			// ���� ����
						break;
					} catch (InputMismatchException e) {	// ���� �̿��� ���� �Է������� ����ó�� 
						sc = new Scanner(System.in);		// catch �ȿ��� �ʱ�ȭ ���� ������ ���� Loop �߻�
						System.out.println("�߸��� �Է°� �Դϴ�.");
					}
				}
				switch(sel) {
					case 0 :
						Stop(money);
						break;
						// �������������������������������������������������������������������������� 0�� �ƴ� ����� ���� �� 
					default : 
						money = account(sel,Ven_Menu[sel-1][1],money);
						break;
					
				}	
				
			}
			

		}
	}
	
	
}
