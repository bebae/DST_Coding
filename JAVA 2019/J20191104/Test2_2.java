package test2;


import java.util.*;

class Beverage extends VendingMachine {

	VendingMachine vm = new VendingMachine();
	
	Scanner scanc = new Scanner(System.in);
	
	
	public void menu(int x) {
		
	}
	
	// Overriding
	void menuSel(int moneyc) {
		System.out.println("������������������������������������������������������������");
		System.out.println("���� ���Ǳ� �ܾ� :	" + moneyc + "��");
		System.out.println("1. ���̴�		500\n2. ��ī�ݶ�	500\n3. ���		500\n4. ��������Ʈ	500\n5. ��������");
		System.out.println("������������������������������������������������������������");
		System.out.print("��ȣ�� �����ϼ��� : ");

		vm.inputNumc = scanc.next();

		int inputc = Integer.parseInt(vm.inputNumc);

		if(moneyc < 500 ) {
			System.out.println("�ܾ��� �����մϴ�");
			System.out.printf("�ܾ��� ��ȯ�մϴ�.\n ��ȯ �ݾ� :"+moneyc);
		} else {
			switch(inputc) {	
				case 1:
						moneyc -= 500;
						System.out.println("���̴� 500\n ���� �ܾ� : "+moneyc+"��");
						menuSel(moneyc);
						break;
				case 2:
						moneyc -= 500;
						System.out.println("��ī�ݶ� 500\n ���� �ܾ� : "+moneyc+"��");
						menuSel(moneyc);
						break;
					
				case 3:
						moneyc -= 500;
						System.out.println("��� 500\n ���� �ܾ� : "+moneyc+"��");
						menuSel(moneyc);
						break;
					
				case 4:
						moneyc -= 500;
						System.out.println("��������Ʈ 500\n ���� �ܾ� : "+moneyc+"��");
						menuSel(moneyc);
						break;
					
				default :
					vm.menuSel(moneyc);
					break;
			}
		}

	}
}
