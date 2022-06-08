package J20220602;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;		// 선택 저장 변수
		String jul = "────────────────────────────────────────────";
		
		int luck_winner = 0;		// 행운권 우승자
		int dice_winner = 0;		// 주사위 우승자
		
		
		
		// ───────────────────────── Main
		while(true) {
			System.out.println(jul);
			System.out.println("   1. 행운권 추첨과 주사위게임");
			System.out.println("   2. 개선점");
			System.out.println("   0. 종료");
			System.out.println(jul);
			System.out.print("   번호 입력 :");
			choice = sc.nextInt();
	
			if (choice >= 0 && choice <=9) {
				if(choice == 1) {
					//────────────────────────── 행운권
					Luck lu = new Luck();
					Dice di = new Dice();
					
					Thread t2 = new Thread(lu);
					Thread t1 = new Thread(di);
					
					t1.start();
					t2.start();			
					
					try {
						t2.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(" Luck 쓰레드 종료");
					
					try {
						t1.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(" Dice 쓰레드 종료");
					
					luck_winner = lu.getwinner();
					dice_winner = di.get_winner();
					
					System.out.println(jul);
					System.out.println("        ★★★모두 축하해주십시오!!★★★");
					System.out.println(" 행운권 추첨에서의 우승자는 "+luck_winner+"번 고객님 이었습니다!");					
					System.out.println(" 주사위 게임에서의 우승자는 "+dice_winner+"번 고객님 이었습니다!");
					System.out.println("        ★★★모두 축하해주십시오!!★★★");
					System.out.println(jul);
					
				} else if(choice == 2) {
					// 20220602 시점
					System.out.println(" 1. 행운권 추첨과 주사위 게임 모두 순차적으로 숫자가 \n    출력됩니다. 이러면 쓰레드 처리가 되는건지 의문점이 생깁니다.\n    행운권과 주사위는 출력값을 통해 동시에 실행을 확인되었지만,\n    그 쓰레드 내부 처리가 동시인지 확실하지 않습니다.");
					System.out.println(" 2. 주사위 게임에서 결과값을 할 때마다 나오게 하면 너무 많이 \n    출력되서 주석처리 하였고, 주사위 게임 자체의 구조를\n    다시 설계해야 더 깔끔하게 처리할 수 있을 것으로 생각됩니다.");
					
				} else if(choice == 0) {
					System.out.println("시스템을 종료합니다.\n");
					break;
				} 
			}else {
				System.out.println("입력값이 올바르지 않습니다. 다시입력해주세요.");
			}
		} //while
		
	}	//main
}







