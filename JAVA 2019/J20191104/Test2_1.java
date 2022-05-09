package test2;


import java.util.*;

class Coffee extends VendingMachine {

	VendingMachine vm = new VendingMachine();
	
	Scanner scanc = new Scanner(System.in);
	
	
	public void menu(int x) {
		
	}
	
	// Overriding
	void menuSel(int moneyc) {
		System.out.println("──────────────────────────────");
		System.out.println("현재 자판기 잔액 :	" + moneyc + "원");
		System.out.println("1. 뜨거운 커피	300\n2. 차가운 커피	300\n3. 아메리카노	700\n4. 카푸치노	900\n5. 이전으로");
		System.out.println("──────────────────────────────");
		System.out.print("번호를 선택하세요 : ");

		vm.inputNumc = scanc.next();

		int inputc = Integer.parseInt(vm.inputNumc);

		if(moneyc < 300 ) {
			System.out.println("잔액이 부족합니다");
			System.out.printf("잔액을 반환합니다.\n 반환 금액 :"+moneyc);
		} else {
			switch(inputc) {		
				case 1:
					// 커피 값만큼 빼기
					moneyc -= 300;
					System.out.println("뜨거운 커피 300\n 남은 잔액 : "+moneyc+"원");
					menuSel(moneyc);
					break;
				case 2:
					moneyc -= 300;
					System.out.println("차가운 커피 300\n 남은 잔액 : "+moneyc+"원");
					menuSel(moneyc);
					break;
				case 3:
					if(moneyc < 700 ) {
						System.out.println("잔액이 부족합니다");
						System.out.printf("잔액을 반환합니다.\n 반환 금액 :"+moneyc);
					} else {
						moneyc -= 700;
						System.out.println("아메리카노 700\n 남은 잔액 : "+moneyc+"원");
						menuSel(moneyc);
						break;
					}
				case 4:
					if(moneyc < 900 ) {
						System.out.println("잔액이 부족합니다");
						System.out.printf("잔액을 반환합니다.\n 반환 금액 :"+moneyc);
					} else {
						moneyc -= 700;
						System.out.println("카푸치노 900\n 남은 잔액 : "+moneyc+"원");
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
