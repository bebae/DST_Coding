package test1;

import java.util.Scanner;

public class Test_1 {

  static int money = 0;	

  private static void func2(Scanner s){
		
		int withdraw;

		while(true){
			System.out.println("<���� �ܰ�> : "+money);
			System.out.println("<��ݾ�> : ");
			withdraw = s.nextInt();
			
		
			if(withdraw < 0)
				System.out.println("�Է��� �� �ִ� ������ ������ϴ�.\n �ٽ��Է����ּ���.");
			else if(withdraw > money)
				System.out.println("��ݾ��� �ܰ� �Ѿ���ϴ�.\n �ٽ��Է����ּ���");
			else break;
		}

		money -= withdraw;
		System.out.println("<�����ܰ�> : "+money);
  }

  private static void func1(Scanner s){

		int deposit;

		while(true){
			System.out.println("<���ݾ�> : ");
			deposit = s.nextInt();

			if(deposit < 0)
				System.out.println("�Է��� �� �ִ� ������ ������ϴ�.\n �ٽ��Է����ּ���.");
			else break;
		}
		money += deposit;	
		System.out.println("<�����ܰ�> : "+money);
  }


  public static void main(String[] args){
	
	boolean run = true;		//���� ����
	Scanner s = new Scanner(System.in);

	

	while(run){
		System.out.println("��������������������������������������������������������������");
		System.out.println("  1.���� | 2.��� | 3.�ܰ� | 4.���� ");
		System.out.println("��������������������������������������������������������������");
		System.out.println("<����> : ");
		int sel = s.nextInt();

		switch(sel){
			case 1 : func1(s);
					break;
			case 2 : func2(s);
					break;
			case 3 :
					System.out.println("<�����ܰ�> : "+money);
					break;
			case 4 : run = false;
					System.out.println("���α׷� ����");
					break;
			default : continue;
			
		} // switch
	} // while

  } //main
} //class
