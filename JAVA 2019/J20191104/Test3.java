package test2;

import java.util.*;

class VendingMachine {

	String coin;
	String inputNum;
	String inputNumc;
	String inputNumb;
	String inputNumHC;
	String inputNumIC;
	String inputNumSD;
	String inputNumS;
	int input;
	int money;

	Scanner scan = new Scanner(System.in);


	void menuSel(int money) {

		System.out.println("���� ���Ǳ� �ܾ� : " + money + "��");
		System.out.println("������������������������������������������������������������");
		if(money >= 500) {
			System.out.println("Ŀ�ǿ� ������� ������ �ڰ��� �ֱ���.");
			System.out.println("1. Ŀ��\n2. �����\n3. ������");
			System.out.println("������������������������������������������������������������");
			System.out.print("��ȣ�� �����ϼ��� : ");
			inputNum = scan.next();
		} 
		else if(money >=300) {
			System.out.println("Ŀ�ǳ� �弼��.");
			System.out.println("1. Ŀ��\n1. Ŀ��\n3. ó������");
			System.out.println("������������������������������������������������������������");
			System.out.print("��ȣ�� �����ϼ��� : ");
			inputNum = scan.next();
		}
		else {
			System.out.println("�ּ� 300���� �־����. Ŀ�� ��¥�� ��ð�?? ��??");
			System.out.printf("�ܾ��� ��ȯ�մϴ�.\n ��ȯ �ݾ� :"+money);
			inputNum = "0";
		}

				
		input = Integer.parseInt(inputNum);

		switch(input) {
			case 1:
				Coffee cof = new Coffee();
				cof.menuSel(money);
				break;
			case 2:
				Beverage bev = new Beverage();	// ���� ��
				bev.menuSel(money);
				break;
				
			default :
				break;
		}

	}

	void mainMenu() {
		System.out.println("��. ���� �־��ֽ�����.");
		System.out.print("�󸶸� �����ðڽ��ϱ�? ");
		coin = scan.next();

		int money = Integer.parseInt(coin);

		this.menuSel(money);
	}
}
