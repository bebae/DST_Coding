package test2;


import java.util.*;

class Beverage extends VendingMachine {

	VendingMachine vm = new VendingMachine();
	
	Scanner scanc = new Scanner(System.in);
	
	
	public void menu(int x) {
		
	}
	
	// Overriding
	void menuSel(int moneyc) {
		System.out.println("──────────────────────────────");
		System.out.println("현재 자판기 잔액 :	" + moneyc + "원");
		System.out.println("1. 사이다		500\n2. 코카콜라	500\n3. 펩시		500\n4. 스프라이트	500\n5. 이전으로");
		System.out.println("──────────────────────────────");
		System.out.print("번호를 선택하세요 : ");

		vm.inputNumc = scanc.next();

		int inputc = Integer.parseInt(vm.inputNumc);

		if(moneyc < 500 ) {
			System.out.println("잔액이 부족합니다");
			System.out.printf("잔액을 반환합니다.\n 반환 금액 :"+moneyc);
		} else {
			switch(inputc) {	
				case 1:
						moneyc -= 500;
						System.out.println("사이다 500\n 남은 잔액 : "+moneyc+"원");
						menuSel(moneyc);
						break;
				case 2:
						moneyc -= 500;
						System.out.println("코카콜라 500\n 남은 잔액 : "+moneyc+"원");
						menuSel(moneyc);
						break;
					
				case 3:
						moneyc -= 500;
						System.out.println("펩시 500\n 남은 잔액 : "+moneyc+"원");
						menuSel(moneyc);
						break;
					
				case 4:
						moneyc -= 500;
						System.out.println("스프라이트 500\n 남은 잔액 : "+moneyc+"원");
						menuSel(moneyc);
						break;
					
				default :
					vm.menuSel(moneyc);
					break;
			}
		}

	}
}
