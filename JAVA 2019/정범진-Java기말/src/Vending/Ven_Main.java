package Vending;
import java.io.*;
import java.util.*;


public class Ven_Main  {
	
	 static String[][] Ven_Menu = new String[][] {
			{"1","칠성사이다","1100","2"},
			{"2","펩시","900","3"},
			{"3","트로피카나","1000","4"},
			{"4","웰치스","1100","5"},
			{"5","스프라이트","1000","6"},
			{"6","밀키스","1000","7"},
			{"7","옥수수수염차","700","8"},
			{"8","핫초코","500","9"}
		}; 
	
	// ─────────────────────────────────────────────────────── 메뉴 추가 함수
	void Menu_add() {
		Scanner sc = new Scanner(System.in);
		Ven_Machine VMa = new Ven_Machine();
		
		int i;
		String name="";
		int price = 0;
		int amount = 0;
		
		System.out.println("──────────────────────────────");
		System.out.println("제품명	 가격	재고");
		System.out.println("──────────────────────────────");
		System.out.print("제품명을 입력하세요 :");
		name = sc.nextLine();
		price = VMa.re_input(price,"가격");
		amount = VMa.re_input(amount,"재고");
		
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
	
	// ─────────────────────────────────────────────────────── 메뉴 삭제 함수
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
		
		// ────────────────────────────────── 메뉴 지정

		
		System.out.println("──────────────────────────────");
		System.out.println("    1. 자판기 이용");
		System.out.println("    2. 자판기 관리");
		System.out.println("──────────────────────────────");
		
		select = VM.re_input(select,"값");
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
