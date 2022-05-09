package Exam_20191014;
import java.util.Random;
import java.util.Scanner;

public class Score {
	
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - 변수 초기화
	int[][] score = new int[3][20];
	int[] subScore = new int[3];
	int tot = 0, ave = 0;
	String grade = "";

	// - - - - - - - - - - - - - - - - - - - - - - - - - - - 점수 초기화
	public void iniScore() {
		Random random = new Random();
		
		for (int sub = 0; sub < 3; sub++ ) {
			for (int i = 0; i < 20; i++ ) {
				score[sub][i] = random.nextInt(4) + 1;
			}
		}
	}
	
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - 점수 조정
	public void editScore(int sub, int[] Ans) {
		Random random = new Random();
		int MAX = random.nextInt(11) + 10;
		for (int i = 0; i < MAX; i++ ) {
			score[sub][i] = Ans[i];
		}
	}
	
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - 점수 계산
	public void calScore(int num, int sub, int[] Ans) {
		int sum = 0;
		System.out.printf(" └ 201903%03d번 : ", num + 1);
		for (int i = 0; i < Ans.length; i++ ) {
			if ( score[sub][i] == Ans[i] ) {
				System.out.print("O ");
				sum += 1;
			} else {
				System.out.print("X ");
			}
		}
		tot += sum * 5;
		subScore[sub] = sum * 5;
		System.out.println(" " + sum * 5);
		
	}
	
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - 총 점수 계산
		public void totScore() {
			ave = tot / 3;
			if (ave > 95) {
				grade = "A+";
			} else if (ave > 90) {
				grade = "A0";
			} else if (ave > 85) {
				grade = "B+";
			} else if (ave > 80) {
				grade = "B0";
			} else if (ave > 75) {
				grade = "C+";
			} else if (ave > 70) {
				grade = "C0";
			} else {
				grade = "F";
			}
				
			
		}
	
	// - - - - - - - - - - - - - - - - - - - - - - - - - - - Main
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner s = new Scanner(System.in);
		int[][] Answer = new int[3][20];
		
		System.out.print("학생수 입력 : ");
		int num = s.nextInt();
		if (num < 1 || num > 999) return;
		Score[] func = new Score[num];
		
		// - - - - - - - - - - - - - - - - - - - - 답안 초기화
		for (int i = 0; i < Answer.length; i++ ) {
			for (int j = 0; j < Answer[i].length; j++ ) {
				Answer[i][j] = rand.nextInt(4) + 1;
			}
		}
		// idx 0 = kor
		// idx 1 = eng
		// idx 2 = mat
		
		
		// - - - - - - - - - - - - - - - - - - - - 학생 답안 초기화
		for (int i = 0; i < num; i++ ) {
			func[i] = new Score();
			func[i].iniScore();
		}
		
		// - - - - - - - - - - - - - - - - - - - - 학생 점수 조정 (높은 점수를 받도록)
		for (int sub = 0; sub < 3; sub++ ) {
			for (int i = 0; i < num; i++ ) {
				func[i].editScore(sub, Answer[sub]);
			}
		}
		
		// - - - - - - - - - - - - - - - - - - - - OX 결과 출력
		System.out.println("───────────────────────────────────────────────────────────────");
		for (int sub = 0; sub < 3; sub++ ) {
			switch (sub) {
			case 0 :
				System.out.println("[언어 영역]"); break;
			case 1 :
				System.out.println("[외국어 영역]"); break;
			case 2 :
				System.out.println("[수리 영역]"); break;
			}
			for (int i = 0; i < num; i++ ) {
				func[i].calScore(i, sub, Answer[sub]);
			}
			System.out.println("───────────────────────────────────────────────────────────────");
		}
		
		for (int i = 0; i < num; i++ ) {
			func[i].totScore();
		}
		
		int[] Max = new int[3];
		int[] Min = new int[3];
		// Max, Min 배열 각각 초기화
		for (int i = 0; i < 3; i++ ) {
			Max[i] = 0;
			Min[i] = 100;
		}
		
		for (int sub = 0; sub < 3; sub++ ) {
			for (int i = 0; i < num; i++ ) {
				if ( Max[sub] < func[i].subScore[sub] ) {
					Max[sub] = func[i].subScore[sub];
				}
				if ( Min[sub] > func[i].subScore[sub] ) {
					Min[sub] = func[i].subScore[sub];
				}
			}
		}
		
		// - - - - - - - - - - - - - - - - - - - - 총 결과
		System.out.println("       학번                        언어          외국어           수리            총합           평균           학점");
		for (int i = 0; i < num; i++ ) {
			System.out.printf("201903%03d번	", i+1);
			for (int sub = 0; sub < 3; sub++ ) {
				System.out.printf("%03d	", func[i].subScore[sub]);
			}
			System.out.printf("%03d	", func[i].tot);
			System.out.printf("%03d	", func[i].ave);
			System.out.print(func[i].grade);
			
			
			System.out.println("");
		}
		System.out.println("───────────────────────────────────────────────────────────────");
		System.out.print(" MAX (최대)	");
		for (int i = 0; i < 3; i++ ) {
			System.out.printf("%03d	", Max[i]);
		}
		System.out.print("\n MIN (최소)	");
		for (int i = 0; i < 3; i++ ) {
			System.out.printf("%03d	", Min[i]);
		}
		System.out.println("");
		System.out.println("───────────────────────────────────────────────────────────────");
		
		
	}
}
