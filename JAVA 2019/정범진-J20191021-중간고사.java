package test;
import java.util.Scanner;
import java.util.Random;

public class Test {

	private static final int Scanner = 0;

	// 온도
	private static int ondo_num;
	private int power;
		

	static int[][] score = new int[3][20];
	int[] subScore = new int[3];
	private static String[] name = new String[] {"청하","소향","펑티모"};

	private int speed;
	
	public Test(){	
		this.ondo_num = 14;
		this.power = 0;
		
		this.speed = 0;
		
	}
	

	private void func3(Scanner s){
		int sel = 0;
		int speed = this.speed;
		
		while(true) {
			System.out.println("────────────────────────────────");
			System.out.println("   1. 속도 올리기	");
			System.out.println("   2. 속도 내리기	");
			System.out.println("   3. 정 지        	");
			System.out.println("   4. 자동차 제어 종료");
			System.out.println("────────────────────────────────");
			sel = s.nextInt();
			
			System.out.println(" 미구현 입니다");
			break;
		
		}
	}

	// ──────────────────────────────────────── 답안지 체점 시작
	private static void Score(Scanner s){
		
		Random r = new Random();
		int[][] Answer = new int[3][20];
		int sum=0;
		int tot=0;
		
		// ──────────────────────────────────────── 점수 초기화
		for (int sub = 0; sub < 3; sub++ ) {
			for (int i = 0; i < 20; i++ ) {
				score[sub][i] = r.nextInt(4) + 1;
			}
		}
		
		// ──────────────────────────────────────── 답안 초기화
		for (int i = 0; i < Answer.length; i++ ) {
			for (int j = 0; j < Answer[i].length; j++ ) {
				Answer[i][j] = r.nextInt(4) + 1;
			}
		}
		
		// ────────────────────────────────────────  답 맞추기
		int Max=0;
		int Min=100;
		
		System.out.println("────────────────────────────────");
		System.out.println("기본 점수 +30점");
		System.out.println("────────────────────────────────");
		
		for (int sub = 0; sub < 3; sub++ ) {
			sum = 0;
			System.out.printf("   %3s \n",name[sub]);

			for (int i = 0; i < 20; i++ ) {
				
				
				if ( score[sub][i] == Answer[sub][i] ) {
					System.out.print("O ");
					sum += 1;
				} else {
					System.out.print("X ");
				}
				
			}
			sum = (sum*5+30);
			tot += sum;
			
			if(sum > Max) {
				Max = sum;
			}
			if(sum < Min) {
				Min = sum;
			}
			
			System.out.println(" "+sum);
		}
		System.out.println("────────────────────────────────");
		System.out.println("  MAX (최대)	"+Max);
		System.out.println("  MIN (최소)	"+Min);
		System.out.println("    평균	 	"+tot/3);
	}
	// ──────────────────────────────────────── 답안지 체점 끝	
	
	// ──────────────────────────────────────── 온도 제어 시작
	private static void ondo(Scanner s){

		int power;
		int sel = 0;	//	온도조걸 선택 변수
		int ondo=0;
		int ondonum = ondo_num;

		while(true){
			sel = 0;
			System.out.println("────────────────────────────────");
			System.out.println(" 온도제어 전원");
			System.out.println(" 1. ON ");
			System.out.println(" 2. OFF ");
			System.out.println("────────────────────────────────");
			
			power = s.nextInt();

			switch(power) {
				case 1 : 
					System.out.println("온도제어의 전원을 ON 했습니다!");
					power = 1;
					break;
				case 2 : 
					System.out.println("온도제어의 전원을 OFF 했습니다!");
					power = 2;
					break;
				default : 
					System.out.println("입력할 수 있는 범위를 벗어났습니다.\n 다시입력해주세요.");
					continue;
			}
			
			// ──────────────────────────────────────── 온도 올리기/내리기
			if (power == 2) {
				System.out.println("온도제어를 종료합니다!");
				break;
			} else {
				System.out.println("전원이 ON 상태 입니다!");
				while(sel < 3) {
					System.out.println("────────────────────────────────");
					System.out.println(" 온도 조절");
					System.out.println("1. 온도 1도 올리기");
					System.out.println("2. 온도 1도 내리기");
					System.out.println("3. 온도조절 시스템 종료");
					System.out.println("────────────────────────────────");
					sel = s.nextInt();
					
					switch(sel) {
						case 1 : 
							++ondo;
							break;
						case 2 :
							--ondo;
							break;
						default :
							sel = 3;
							break;
					}
					System.out.println("────────────────────────────────");
					System.out.printf("현재 온도 : %d\n",ondonum);
					System.out.printf("사용자 지정 온도 : %d\n",ondonum+ondo);
				}
				
			} //전원 if else
		}		
	}
	// ──────────────────────────────────────── 온도 제어 끝


	public static void main(String[] args){
	
		boolean run = true;		//무한 루프
		Scanner s = new Scanner(System.in);
		int n = 0;
		int p=0;
		
		// 클래스 지정
		Test t1 = new Test();
		Test[] ta = new Test[n];

		while(run){
			System.out.println("────────────────────────────────");
			System.out.println("       1. 에어콘 온도 제어 ");
			System.out.println("       2. 학생 답안지 채점");
			System.out.println("       3. 자동차 소독 제어");
			System.out.println("       4. 종료 ");
			System.out.println("────────────────────────────────");
			System.out.println("<선택> : ");
			int sel = s.nextInt();

			switch(sel){
				case 1 : t1.ondo(s);
					break;
				case 2 : t1.Score(s);
					break;
				case 3 :
					t1.func3(s);
					break;
				case 4 : run = false;
					System.out.println("프로그램 종료");
					break;
				default : 
					System.out.println("입력할 수 있는 범위를 벗어났습니다.\n 다시입력해주세요.");
					continue;
			} // 목록 선택 switch

		} // while
		
	} //main
} //class






