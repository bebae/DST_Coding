package Vending;
import java.io.*;
import java.util.*;

public class Ven_Machine<string> extends Ven_Main{
	


	// ─────────────────────────────────────────────── 입력 반복 함수
	int re_input(int in,String string){
		Scanner sc = new Scanner(System.in);
		
		while(true) {			
			System.out.print(string+"을/를 입력하세요 :");
			try {
				in = sc.nextInt();					// 숫자 입력
				break;
			} catch (InputMismatchException e) {	// 정수 이외의 수를 입력했을때 예외처리 
				sc = new Scanner(System.in);		// catch 안에서 초기화 하지 않으면 무한 Loop 발생
				System.out.println("잘못된 입력값 입니다.");
			}
		}
		return in;
	}
	
	void Run(int money) {
		
		int auto = 1;			// ──────── 자동 투입
		
		if(auto == 1) {
			System.out.println("5000원을 자동으로 투입합니다");
			money += 5000;
		} else {
		Scanner sc = new Scanner(System.in);
		// ─────────────────────────────────────────────── 입력 
		money = re_input(money,"돈");
		}
		
		Menu(money);
	}
	
	// ─────────────────────────────────────────────────────── 종료 부분
	void Stop(int money) {
		int sel=0;
		
		System.out.println("──────────────────────────────");
		System.out.println(" 잔돈 : "+money);
		System.out.println("  1. 잔돈 넣기   2.끝내기");
		System.out.println("──────────────────────────────");
		if(re_input(sel,"번호") == 1) {
			Run(money);
		} else {
			System.out.println("──────────────────────────────");
			System.out.println("사용을 종료합니다.");
			System.out.println("──────────────────────────────");
			System.exit(0);
		}
	}
	
	// ─────────────────────────────────────────────────────── 메뉴 출력
	int menu_set(int m) {
		int scarce=0;	// 구입 가능한 목록 갯수 저장 변수
		
		for (int i=0;i<Ven_Menu.length;i++) {
			if(Integer.parseInt(Ven_Menu[i][2]) <= m) {
				scarce += 1;
			}
		}
		
		if(scarce > 0) {		// 목록 갯수가 1 이상일 때
			System.out.println(" 제품번호       제품명	 가격	재고");
			System.out.println("──────────────────────────────");
			for (int i=0;i<Ven_Menu.length;i++) {
				if(Integer.parseInt(Ven_Menu[i][2]) <= m) {
					System.out.printf("   "+Ven_Menu[i][0]+".	"+Ven_Menu[i][1]+""
							+ "	%4s원	%2s\n",Ven_Menu[i][2],Ven_Menu[i][3]);
				}
			}
			System.out.println("   0.   반환/취소");
		} else {
			System.out.println("      현재 금액으로 구매 가능한 제품이 없습니다.");
			System.out.println("	   잔돈을 반환 합니다.       ");
			
		}
		return scarce;
	}
	
	// ─────────────────────────────────────────────────────── 메뉴 선택 시 처리 부분
	int account(int num,String drink,int money) {
		int temp1 = Integer.parseInt(Ven_Menu[num-1][2]);	// 음료수 가격
		int temp2 = Integer.parseInt(Ven_Menu[num-1][3]);	// 재고를 임시 변수에 저장
		
		if (money < temp1) { 									// 목롱에 없는 메뉴 선택 시
			System.out.println("현재 금액으론 구매 불가 상품입니다\n");			
			
		} else {												// 목록에 있는 메뉴 선택 시
			System.out.println("──────────────────────────────");
			System.out.println("    "+drink+"를 선택하셨습니다");
			if(temp2 < 1) {				// 재고 확인
				System.out.println("  현재 이 상품은 품절 상태 입니다");
			} else {	
				money -= temp1;
				temp2 -= 1;				// 재고 -1
				
				Ven_Menu[num-1][3] = Integer.toString(temp2);
				
				System.out.println("     가격 : "+temp1);
				System.out.println("     재고 : "+Ven_Menu[num-1][3]);
				System.out.println("     잔액 : "+money);
			}
			System.out.println("──────────────────────────────");
			System.out.println();
		}
		return money;
	}
	
	// ──────────────────────────────────────────────────── 메뉴 선택 후 처리
	void Menu(int money) {
		Ven_Machine VM = new Ven_Machine();		
		Scanner sc = new Scanner(System.in);
		int sel=0;
		
		
		while(true) {
			System.out.println("──────────────────────────────");
			// ──────────────────────────────────────────────────── 선택할 수 있는 것이 1개도 없을 때	
			if(menu_set(money) == 0) {				
				Stop(money);
				
			
			// ──────────────────────────────────────────────────── 선택할 수 있는 것이 1개라도 있을 떄
			} else {								
				System.out.println("──────────────────────────────");
				
				
				// 올바른 값을 입력할 때까지 반복
				while(true) {			
					System.out.println("현재 잔액 : "+money);
					// 음료수 선택
					System.out.print("음료수 선택 : ");
					
					try {
						sel = sc.nextInt();			// 음료 선택
						break;
					} catch (InputMismatchException e) {	// 정수 이외의 수를 입력했을때 예외처리 
						sc = new Scanner(System.in);		// catch 안에서 초기화 하지 않으면 무한 Loop 발생
						System.out.println("잘못된 입력값 입니다.");
					}
				}
				switch(sel) {
					case 0 :
						Stop(money);
						break;
						// ───────────────────────────────────── 0이 아닌 음료수 선택 시 
					default : 
						money = account(sel,Ven_Menu[sel-1][1],money);
						break;
					
				}	
				
			}
			

		}
	}
	
	
}
