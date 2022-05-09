package test1;

import java.util.Scanner;

public class Test_1 {

  static int money = 0;	

  private static void func2(Scanner s){
		
		int withdraw;

		while(true){
			System.out.println("<현재 잔고> : "+money);
			System.out.println("<출금액> : ");
			withdraw = s.nextInt();
			
		
			if(withdraw < 0)
				System.out.println("입력할 수 있는 범위를 벗어났습니다.\n 다시입력해주세요.");
			else if(withdraw > money)
				System.out.println("출금액이 잔고를 넘어습니다.\n 다시입력헤주세요");
			else break;
		}

		money -= withdraw;
		System.out.println("<현재잔고> : "+money);
  }

  private static void func1(Scanner s){

		int deposit;

		while(true){
			System.out.println("<예금액> : ");
			deposit = s.nextInt();

			if(deposit < 0)
				System.out.println("입력할 수 있는 범위를 벗어났습니다.\n 다시입력해주세요.");
			else break;
		}
		money += deposit;	
		System.out.println("<현재잔고> : "+money);
  }


  public static void main(String[] args){
	
	boolean run = true;		//무한 루프
	Scanner s = new Scanner(System.in);

	

	while(run){
		System.out.println("───────────────────────────────");
		System.out.println("  1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
		System.out.println("───────────────────────────────");
		System.out.println("<선택> : ");
		int sel = s.nextInt();

		switch(sel){
			case 1 : func1(s);
					break;
			case 2 : func2(s);
					break;
			case 3 :
					System.out.println("<현재잔고> : "+money);
					break;
			case 4 : run = false;
					System.out.println("프로그램 종료");
					break;
			default : continue;
			
		} // switch
	} // while

  } //main
} //class
