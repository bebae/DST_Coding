package test2;


import java.util.*;

class Coffee extends VendingMachine {

	VendingMachine vm = new VendingMachine();
	
	Scanner scanc = new Scanner(System.in);
	
	
	public void menu(int x) {
		
	}
	
	// Overriding
	void menuSel(int moneyc) {
		System.out.println("������������������������������������������������������������");
		System.out.println("���� ���Ǳ� �ܾ� :	" + moneyc + "��");
		System.out.println("1. �߰ſ� Ŀ��	300\n2. ������ Ŀ��	300\n3. �Ƹ޸�ī��	700\n4. īǪġ��	900\n5. ��������");
		System.out.println("������������������������������������������������������������");
		System.out.print("��ȣ�� �����ϼ��� : ");

		vm.inputNumc = scanc.next();

		int inputc = Integer.parseInt(vm.inputNumc);

		if(moneyc < 300 ) {
			System.out.println("�ܾ��� �����մϴ�");
			System.out.printf("�ܾ��� ��ȯ�մϴ�.\n ��ȯ �ݾ� :"+moneyc);
		} else {
			switch(inputc) {		
				case 1:
					// Ŀ�� ����ŭ ����
					moneyc -= 300;
					System.out.println("�߰ſ� Ŀ�� 300\n ���� �ܾ� : "+moneyc+"��");
					menuSel(moneyc);
					break;
				case 2:
					moneyc -= 300;
					System.out.println("������ Ŀ�� 300\n ���� �ܾ� : "+moneyc+"��");
					menuSel(moneyc);
					break;
				case 3:
					if(moneyc < 700 ) {
						System.out.println("�ܾ��� �����մϴ�");
						System.out.printf("�ܾ��� ��ȯ�մϴ�.\n ��ȯ �ݾ� :"+moneyc);
					} else {
						moneyc -= 700;
						System.out.println("�Ƹ޸�ī�� 700\n ���� �ܾ� : "+moneyc+"��");
						menuSel(moneyc);
						break;
					}
				case 4:
					if(moneyc < 900 ) {
						System.out.println("�ܾ��� �����մϴ�");
						System.out.printf("�ܾ��� ��ȯ�մϴ�.\n ��ȯ �ݾ� :"+moneyc);
					} else {
						moneyc -= 700;
						System.out.println("īǪġ�� 900\n ���� �ܾ� : "+moneyc+"��");
						menuSel(moneyc);
						break;
					}
				default :
					vm.menuSel(moneyc);
					break;
			}
		}

	}
}
