// 중간고사

package J20220425;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Jul = "─────────────────────────────────────────";

		String ch = ""; 	// while 문 선택
		
//		Main m = new Main();
		sub s = new sub();
		pro p = new pro();
		hap h = new hap();
		
		while(true) {
			System.out.printf("\n %s \n", Jul);
			System.out.println("  1 : 채점");
			System.out.println("  2 : 성적처리");
			System.out.println("  3 : 구간 합 구하기");
			System.out.println("  4 : 소감");
			System.out.println("  5 : 종 료");
			System.out.printf(" %s \n", Jul);
			
			System.out.printf("  입력 : ");
			ch = sc.next();			// ────────────────── 문자 넣기
			
			if(ch.equals("1")) {	// ────────────────── 문자열 비교
				s.t_kor_check();		// kor_check에 학생 수를 넘겨주고 계산된 배열값을 다시 넘겨받음
			} else if(ch.equals("2")) {
				p.t_pro();
			} else if(ch.equals("3")) {
				h.t_hap();
			} else if(ch.equals("4")) {
			
			} else if(ch.equals("5")){
				System.out.println(" 프로그램을 종료합니다.");
				break;
			} else {
				continue;
			}
		} // while문
		sc.close();		// 스캐너 종료
	} // Main

	

}








