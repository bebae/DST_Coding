
//0414 #3  답안지 채점
// 10문항 4지선다
// 정답 랜덤 
// 학생 N명의 대한 kor, eng, mat, avg, max
// 3과목에 대한 

package test3;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Jul = "─────────────────────────────────────";
		int o = 0;	// 정답 갯수
		int n = 0;	// 학생 수
		String ch = ""; 	// while 문 선택
		int[] kor_dapji = new int[10];	// 국어 정답지
		int[] eng_dapji = new int[10];	// 영어 정답지
		int[] mat_dapji = new int[10];	// 수학 정답지
		int[] stu_dapji = new int[10];	// 학생 답안지
		
		int[] stu_kor = null; 
		int[] stu_eng = null;
		int[] stu_mat = null;		
		
		// 배열 초기화
		for (int i=0;i<10;i++){
			kor_dapji[i] = 0;
			eng_dapji[i] = 0;
			mat_dapji[i] = 0;
			stu_dapji[i] = 0;
		}
		
		while(true) {
			System.out.printf("\n %s \n", Jul);
			System.out.println("  0 : 학생 수 입력");
			System.out.println("  1 : 국어 채점");
			System.out.println("  2 : 영어 채점");
			System.out.println("  3 : 수학 채점");
			System.out.println("  4 : 종 료");
			System.out.println("  5 : Max / Min");
			System.out.printf(" %s \n", Jul);
			
			System.out.printf("  입력 : ");
			ch = sc.next();			// ────────────────── 문자 넣기
			
			if(ch.equals("0")){
				System.out.print("학생 수 : ");
				n = sc.nextInt();
				
				stu_kor = new int[n]; 		// kor 학생 점수
				stu_eng = new int[n];		// eng 학생 점수
				stu_mat = new int[n];		// mat 학생 점수
				
				// 학생 점수 배열 초기화
				for(int i=0;i<n;i++) {
					stu_kor[i] = 0;
					stu_eng[i] = 0;
					stu_mat[i] = 0;
				}
			
			} else if(ch.equals("1")) {	// ────────────────── 문자열 비교
				
				// 국어 정답지
				System.out.printf("\n %s \n", Jul);
				System.out.print(" 국어정답 ");
				for(int i=0;i<10;i++) {
					// 국어 정답 랜덤 생성
					kor_dapji[i] = (int)(Math.random()*4+1);
					System.out.printf("%2d ", kor_dapji[i]);
				}
				
				// 학생 N명
				for(int j=0;j<n;j++) {
					// 시험
					System.out.printf("\n %s\n", Jul);
					System.out.printf(" %d번학생 ", j+1);
					for(int i=0;i<10;i++) {
						stu_dapji[i] = (int)(Math.random()*4+1);
						System.out.printf("%2d ", stu_dapji[i]);
					}					
					// 채첨
					System.out.printf("\n %s\n", Jul);
					System.out.print(" 답안채점 ");
					o = 0; 	// 맞은 갯수
					for(int i=0;i<10;i++) {
						if(kor_dapji[i] == stu_dapji[i]) {
							o++;
							System.out.print(" O ");
						} else {
							System.out.print(" X ");
						}
						stu_kor[j] = o*10;
					}					
				} // 학생 N명 for
				System.out.printf("\n %s\n", Jul);
				for(int i=0;i<n;i++) {
					System.out.printf(" %2d번 국어 Jumsu = %d\n", i+1, stu_kor[i]);
				}
			} else if(ch.equals("2")) {
				
			} else if(ch.equals("3")) {
				
			} else if(ch.equals("4")) {
				System.out.println(" 프로그램을 종료합니다.");
				break;
			} else if(ch.equals("5")){
				int max = 0;
				int min = 100;
				int hap = 0;
				int ave = 0;
				
				// 학생 수가 0명이라면 실행 X
				if(n == 0) {
					System.out.println(" 학생 수 가 0명 입니다. 학생 수를 입력해주세요");
					continue;
				}
				
				// kor  max min
				for(int i=0;i<n;i++) {
					hap += stu_kor[i];
					if(max < stu_kor[i])
						max = stu_kor[i];
					if(min > stu_kor[i])
						min = stu_kor[i];
				}
				ave = hap/n;
				System.out.printf("\n %s \n", Jul);
				System.out.printf("  Max :%3d ", max);
				System.out.printf(" Min :%3d ", min);
				System.out.printf(" Ave :%3d ", ave);
				System.out.printf("\n %s \n", Jul);
			
			} else {
				continue;
			}
		} // while문
		sc.close();		// 스캐너 종료
	} // Main

	

}








