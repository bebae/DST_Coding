// 0407 #3_1
// 행운권 추첨
// 중간고사에 관한 내용
package test3;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;		// 선택 저장 변수
		String jul = "──────────────────────────";
		
		// ───────────────────────── Main
		while(true) {
			System.out.println(jul);
			System.out.println("   1. 행운권 추첨");
			System.out.println("   2. 주사위 게임");
			System.out.println("   3. 종료");
			System.out.println(jul);
			System.out.print("   번호 입력 :");
			choice = sc.nextInt();
	
			if(choice == 1) {
				//────────────────────────── 행운권
				Luck lc = new Luck();
				int max = 0;	// 당첨 번호 중 가장 큰수를 당첨생성 메소드에서 당첨자 확인 메소드로 넘겨주는 변수
				lc.luck_gen();			// 당첨 번호 생성 메소드
				lc.luck_guest_check(max);	// 당첨자 확인 메소드
			} else if(choice == 2) {
				//────────────────────────── 주사위 
				Dice di = new Dice();
				di.di_gen();
				di.di_win_check();
			} else {
				System.out.println("시스템을 종료합니다.\n");
				break;
			}
		} //while
	}	//main
}
