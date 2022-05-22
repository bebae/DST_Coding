/* 20220516 파일입이다.
 * 야구게임 구현입니다.
*/
package BaseballGame;
import java.util.Scanner;

class tool {
	// 문자열을 받고 숫자만 있는지 false/true 값을 돌려줍니다.
	public boolean str_check(String str) {
        boolean isNumeric =  str.matches("[+-]?\\d*(\\.\\d+)?");
        return isNumeric;
	}
		
}

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	private static int[] key_num = new int[5];				// 정답 숫자가 저장될 배열
	private static boolean overlep_check = false;			// 입력값의 중복 체크 변수
	
	// 필드  초기화
	public Main() {
		for(int i=0;i<5;i++)
			key_num[i] = -1;
	}
	
	// 정답 배열에 정답 숫자를 중복없이 랜덤으로 저장합니다.
	public void random_num_make(int N) {
		int size = N;
		for(int i=0;i<size;i++) {
			while(true) {
				overlep_check = false;
				key_num[i] = (int)(Math.random()*10);			// 0~9에서 랜덤값을 배열에 저장합니다.
				for(int j=0;j<size;j++) {						// 이미 저장된 정답값과 비교합니다.
					if(i != j && key_num[i] == key_num[j]) {	// 자기자신을 제외하고 값이 같다면 다시 실행합니다.	
						overlep_check = true;
						break;
					}
				}
				if (overlep_check == false)					// 중복이 없다면 while문을 빠져나가 다음자릿수를 정합니다.
					break;
			}	// while 
		}
	} 	// random_num_make
	
	// N자리가 정답인 야구게임입니다.
	public void playgame(int N,int R) {
		int size = N;						// 정답의 크기
		int round = R;						// 허용된 라운드 
		int answer = 0;						// 입력하는 숫자를 나누어 배열에 넣는 변수
		String s_answer = "";				// 입력하는 숫자를 문자로 받는 문자열
		int count_strike = 0;				// 스트라이크 저장변수
		int count_ball = 0;					// 볼 저장변수
		int i = 0;							// for문이 끝났을 때까지 맞추지 못했다면?
		
		tool to = new tool();				// 중복 체크 함수가 있는 클래스 선언
		
// ──────────────────────────────── 허용된 라운드 만큼만 반복합니다. ────────────────────────────────
		for(i=1;i<=round;i++) {
			count_strike = 0;
			count_ball = 0;
			while (true) {
				// ──────────────────────────────── 입력 부분 ────────────────────────────────
				System.out.print(i+"회차입니다. max("+round+") "+size+"자리의 숫자를 입력해주세요 : ");
				s_answer = sc.next();
				//	int(answer)로 입력받을 때 0으로 시작하는 경우 시스템이 인식할 때 0을 인식하지 못하는 문제가 생겨 문자열로 받고 int로 변환할 때 예외 처리 시키기로 함
		
				// ─────── 입력값 유효 검사 및 명령어라면 명령어 실행 ───────
				if (s_answer.equals("exit")) {		// exit를 입력하면 메뉴로 빠져나옵니다.
					i = round;
					break;
				} else if(s_answer.length() != size) {			// 입력값이 현재 자릿수와 맞지 않으면 다시 입력 받습니다.
					System.out.println("입력 자릿수가 맞지 않습니다.");
					continue;
				} else if(to.str_check(s_answer) == false) {	// 입력값이 숫자로만 이루어지지 않았다면 다시 입력 받습니다.
					System.out.println("숫자로만 입력해주세요.");
					continue;
				}
				answer =  Integer.parseInt(s_answer);
				
				/* 처음에 시도했던 방법
				 *  입력받은 숫자의 길이만큼 배열을 만들고 1자리씩 나눠서 임시 배열에 저장하여 정답 배열과 비교합니다.
				 * int[] temp = new int[((int)Math.log10(answer)+1)];
				 * temp 배열을 선언하고 그 크기를 정수 answer에 크기만큼 선언합니다.
				 * System.out.println(""+((int)Math.log10(answer)+1));
				*/
				
				// ──────────────────────────────── 처리 부분 ────────────────────────────────
				int[] temp = new int[size];			// 받은 크기만큼의 배열 생성
				
				for(int j=temp.length-1;j>=0;j--) {	// j는 temp 배열의 크기에서 0보다 클 때까지만 반복한다. 
					temp[j] = answer % 10;			// temp 배열의 뒤에서부터 입력받음 숫자를 10으로 나눈 나머지를 넣는다.
					answer /= 10;					// 10으로 나누어 10의 자리수가 1의 자리로 되도록 함
				}
				
				// 맨 앞이 0일 때 예외처리
				if (s_answer.indexOf("0") == 0) {	// indexOf = s_answer에 0이라는 문자열의 위치를 반환하고 == 0은 첫번째에 0이라면 이라는 뜻
					temp[0] = 0;
				}
				
				overlep_check = false;				// 중복체크 초기화
				outerLoop :							// 루프문의 빠져나갈 지점	/ C언어의 goto문장과 같이 권장되지는 않는다.
				// 입력값에 중복된 숫자가 있는지 검사하고 중복이 있다면 다시 입력 받습니다.
				for(int j=0;j<temp.length;j++) {
					for(int k=0;k<temp.length;k++) {
						if(j != k) {				// 자기자신은 제외합니다.
							if(temp[k]==temp[j]) {
								System.out.println("입력값에 중복이 있습니다. 다시입력해주세요.");
								overlep_check = true;
								break outerLoop;	// outerLoop 까지 빠져나갑니다.
							}
						}
					}
				}
				
				//입력값과 정답값을 비교
				if (overlep_check == false) {				// 중복이 아니라면 실행
					for (int j=0;j<temp.length;j++) {		// 자릿수만큼 반복
						if (temp[j] == key_num[j]) {
							count_strike++;
						} else {
							for (int k=0;k<temp.length;k++) {
								// 자기자신이 아니면서 다른 자릿수에 같은 숫자가 있는지 체크
								if (j != k && temp[k] == key_num[j]) {
									count_ball++;
								}
							}
						}
					}
									
					// ──────────────────────────────── 출력 부분 ────────────────────────────────
					System.out.print(" ▶ ");
					for (int j=0;j<temp.length;j++) {
						System.out.print(temp[j]+"");
					}
					System.out.print("= ");
					if (count_strike != 0) {
						System.out.print(count_strike+"S");
					} 
					if (count_ball != 0) {
						System.out.print(count_ball+"B");
					}
					if (count_ball == 0 && count_strike == 0) {
						System.out.print("OUT!");
					}
					System.out.println(" ◀");
					break;					// while문을 빠져나가 라운드가 증가합니다.
				}
						
			} 	// 입력값에 대한 올바른값의 while
			if (count_strike == size) {
				System.out.println("★★★★★★★★★★★★★★★");
				System.out.println("  정답입니다!!!");
				System.out.println("  "+i+"회차에서 홈런을 쳤습니다!");
				System.out.println("★★★★★★★★★★★★★★★");
				break;
			}
		}	// 라운드 for문
		if (i > round) {
			System.out.println(" 라운드가 끝날 때까지 맞추지 못하셨습니다.");
			System.out.println(" 다음 게임엔 맞춰주세요!");
			System.out.print(" 정답은 ★ ");
			// 정답 확인
			for (int j=0;j<size;j++) 
				System.out.print(key_num[j]+" ");
			System.out.println("★ 였습니다!");
		}
		
			
		
	}

	public static void main(String[] args) {
			
		int chice = 0;			// 선택 변수
		int N = 0;				// 정답의 자릿수
		int round = 0;			// 맞추는 제한 회차/답을 낼 수 있는 기회
		
		Main ma = new Main();	// 자기자신 선언
		
		while(true) {
			System.out.println(" ─────────────────");
			System.out.println("     숫 자 야 구 ");
			System.out.println(" ─────────────────");
			System.out.println("     1.   3자리 ");
			System.out.println("     2.   4자리 ");
			System.out.println("     3.   5자리 ");
			System.out.println("     0.   종료　 ");
			System.out.println(" ─────────────────");
			System.out.print("선택하세요 : ");
			chice = sc.nextInt();
			if (chice >= 1 && chice <=9) {
				if (chice == 0) {
					System.out.println("시스템을 종료합니다.");
					break;
				}
				if (chice == 1) {
					N = 3;
					round = 9;
				} else if (chice == 2) {
					N = 4;
					round = 16;
				} else if (chice == 3) {
					N = 5;
					round = 30;
				}
				ma.random_num_make(N);
				ma.playgame(N,round);
				
			} else {
				System.out.println("입력값이 정확하지 않습니다. 다시 입력해주세요.");	// 입력값이 맞지 않다면 다시 입력을 받습니다.
			} // 입력값 if
		}	// while		
	}	// main

}
