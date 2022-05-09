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

		System.out.println("현재 자판기 잔액 : " + money + "원");
		System.out.println("──────────────────────────────");
		if(money >= 500) {
			System.out.println("커피와 음료수를 고를만한 자격이 있군요.");
			System.out.println("1. 커피\n2. 음료수\n3. 끝내기");
			System.out.println("──────────────────────────────");
			System.out.print("번호를 선택하세요 : ");
			inputNum = scan.next();
		} 
		else if(money >=300) {
			System.out.println("커피나 드세요.");
			System.out.println("1. 커피\n1. 커피\n3. 처음으로");
			System.out.println("──────────────────────────────");
			System.out.print("번호를 선택하세요 : ");
			inputNum = scan.next();
		}
		else {
			System.out.println("최소 300원은 넣어야죠. 커피 꽁짜로 드시게?? 응??");
			System.out.printf("잔액을 반환합니다.\n 반환 금액 :"+money);
			inputNum = "0";
		}

				
		input = Integer.parseInt(inputNum);

		switch(input) {
			case 1:
				Coffee cof = new Coffee();
				cof.menuSel(money);
				break;
			case 2:
				Beverage bev = new Beverage();	// 마실 것
				bev.menuSel(money);
				break;
				
			default :
				break;
		}

	}

	void mainMenu() {
		System.out.println("자. 돈을 넣어주시지요.");
		System.out.print("얼마를 넣으시겠습니까? ");
		coin = scan.next();

		int money = Integer.parseInt(coin);

		this.menuSel(money);
	}
}
