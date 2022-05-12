package Vending;

import java.util.Scanner;

public class Ven_Manger extends Ven_Machine {
	
	Ven_Machine VMa = new Ven_Machine();
	
	
	
	// ─────────────────────────────────────────────────────── 메뉴 수정 처리 부분
	int Update(int num,int sel,String str) {		// ──────────────────── 메뉴 번호 / 수정할 항목 / 수정할 제목 
		Scanner sc = new Scanner(System.in);
		
		int temp1 = num-1;
		String str1;
		
		System.out.println("──────────────────────────────");
		System.out.println(str+" : "+Ven_Menu[temp1][sel]+"을 선택하셨습니다" );
		System.out.println("──────────────────────────────");
		
		if(sel == 1) {						// ───────────────── 문자열 수정은 따로
			System.out.print("제품명을 입력하세요 :");
			str1 = sc.nextLine();
			Ven_Menu[temp1][sel] = str1;
		} else {
			Ven_Menu[temp1][sel] = Integer.toString(VMa.re_input(sel,str));

		}
		return sel;
	}
	
	// ─────────────────────────────────────────────────────── 메뉴 수정 UI
	int menuUpdate(int num) {
		
		int temp1 = num-1;				// 선택한 숫자를 배열에 맞게 수정하고 임시변수에 저장 
		int sel = 0;					// 수정항목 저장 변수
		
		System.out.println("──────────────────────────────");
		System.out.printf("   "+Ven_Menu[temp1][0]+".	"+Ven_Menu[temp1][1]+""
				+ "	%4s원	%2s\n",Ven_Menu[temp1][2],Ven_Menu[temp1][3]);
		System.out.println("──────────────────────────────");
		System.out.println(" 제품번호     1.제품명	2.가격	3.재고");
		System.out.println("──────────────────────────────");
		sel = VMa.re_input(sel,"수정항목");
		
		switch(sel) {
			case 1 :
				Update(num,sel,"제품명");
				break;
			case 2 :
				Update(num,sel,"가격");
				break;
			case 3 :
				Update(num,sel,"재고");
				break;
				
			default : 
				System.out.println();
				break;
		}
		
		
		return num;
	}
	
	// ─────────────────────────────────────────────────────── 메뉴 리스트 출력
	void List() {
		System.out.println("──────────────────────────────");
		System.out.println(" 제품번호       제품명	 가격	재고");
		System.out.println("──────────────────────────────");
		for (int i=0;i<Ven_Menu.length;i++) {
			if(Ven_Menu[i][0] != null) {
				System.out.printf("   "+Ven_Menu[i][0]+".	"+Ven_Menu[i][1]+""
						+ "	%4s원	%2s\n",Ven_Menu[i][2],Ven_Menu[i][3]);
			}
		}
		System.out.println("   0.   돌아가기");
		System.out.println("──────────────────────────────");
	}
	
	// ─────────────────────────────────────────────────────── 메뉴 수정 관리
	void management(int in,String str) {
		int num=0;
		
		while(true) {
			List();
			System.out.println(str+"할 제품을 선택하세요.");
			System.out.println("──────────────────────────────");
			num = VMa.re_input(num,"제품번호");
			switch(num) {
				case 0 :
					Adm_Run();
					break;
				// ───────────────────────────────────── 0이 아닌 음료수 선택 시 
				default :
					if(in == 1) 				// 수정
						menuUpdate(num);
					else if(in == 2)			// 삭제
						Menu_del(num);
					break;
			}
		}
		
	}
	
	// ─────────────────────────────────────────────────────── 어드민 UI 부분
	void Adm_Run() {
		
 		Ven_Main vm = new Ven_Main();
 		
		int select=0;
		
		while(true) {
			System.out.println("──────────────────────────────");
			System.out.println("    1. 메뉴 수정 관리");
			System.out.println("    2. 메뉴 삭제 관리");
			System.out.println("    3. 메뉴 추가 관리");
//			System.out.println("    4. 자판기 전원");
			System.out.println("    0. 자판기 이용");
			System.out.println("──────────────────────────────");
			System.out.print("선택 : ");
			select = VMa.re_input(select, "번호");
			
			switch(select) {
				case 0 :
					VMa.Run(0);
					break;
				case 1 : 
					management(select,"수정");
					break;
				case 2 :
					management(select,"삭제");
					break;
			
				case 3 :
					Menu_add();
					break;
				default :
					System.out.println("다시 입력");
					break;
			}
		}
		
		
		
		
	}
}
