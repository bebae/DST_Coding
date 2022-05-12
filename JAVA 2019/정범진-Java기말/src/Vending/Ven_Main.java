package Vending;
import java.io.*;
import java.util.*;


public class Ven_Main  {
	
	 static String[][] Ven_Menu = new String[][] {
			{"1","ĥ�����̴�","1100","2"},
			{"2","���","900","3"},
			{"3","Ʈ����ī��","1000","4"},
			{"4","��ġ��","1100","5"},
			{"5","��������Ʈ","1000","6"},
			{"6","��Ű��","1000","7"},
			{"7","������������","700","8"},
			{"8","������","500","9"}
		}; 
	
	// �������������������������������������������������������������������������������������������������������������� �޴� �߰� �Լ�
	void Menu_add() {
		Scanner sc = new Scanner(System.in);
		Ven_Machine VMa = new Ven_Machine();
		
		int i;
		String name="";
		int price = 0;
		int amount = 0;
		
		System.out.println("������������������������������������������������������������");
		System.out.println("��ǰ��	 ����	���");
		System.out.println("������������������������������������������������������������");
		System.out.print("��ǰ���� �Է��ϼ��� :");
		name = sc.nextLine();
		price = VMa.re_input(price,"����");
		amount = VMa.re_input(amount,"���");
		
		String[][] temp = new String[Ven_Menu.length +1][4];
		for( i = 0; i < Ven_Menu.length; i++ ) {
			temp[i] = Ven_Menu[i];
		}
		temp[i][0] = (i + 1) + "";
		temp[i][1] = name;
		temp[i][2] = price + "";
		temp[i][3] = amount + "";
		Ven_Menu = temp;
	}
	
	// �������������������������������������������������������������������������������������������������������������� �޴� ���� �Լ�
	void Menu_del(int idx) {
		idx--;
		int count = 0;
		String[][] temp = new String[Ven_Menu.length -1][4];
		for( int i = 0; i < Ven_Menu.length; i++ ) {
			if(i == idx)
				continue;
			temp[count++] = Ven_Menu[i];
		}
		Ven_Menu = temp;
	}
	
	void Ven_main() {
		Ven_Machine VM = new Ven_Machine();
		Ven_Manger VMa = new Ven_Manger();
		
		int select=0;
		
		// �������������������������������������������������������������������� �޴� ����

		
		System.out.println("������������������������������������������������������������");
		System.out.println("    1. ���Ǳ� �̿�");
		System.out.println("    2. ���Ǳ� ����");
		System.out.println("������������������������������������������������������������");
		
		select = VM.re_input(select,"��");
		switch(select) {
			case 2 : VMa.Adm_Run();
				break;
			default : 
				System.out.println("");
				VM.Run(0);
		}
	}
	
	public static void main(String[] args) {
		Ven_Main VM = new Ven_Main();
		VM.Ven_main();
	}
	
}
