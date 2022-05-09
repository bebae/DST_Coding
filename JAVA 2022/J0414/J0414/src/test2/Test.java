
//0414 #2  답안지 채점
// 10문항 4지선다
// 정답 직접 입력
// 학생 N명의 대한 kor 점수

package test2;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Jul = "─────────────────────────────────────";
		int o = 0;
		int[] kor_dapji = new int[10];	// 국어 정답지
		int[] stu_dapji = new int[10];	// 학생 답안지
		
		
		// 배열 초기화
		for (int i=0;i<10;i++){
			kor_dapji[i] = 0;
			stu_dapji[i] = 0;
		}
		
		System.out.print("학생 수 : ");
		int n = sc.nextInt();
		
		int[] stu_kor = new int[n]; 	// 학생 점수
		// 학생 점수 배열 초기화
		for(int i=0;i<n;i++) {
			stu_kor[i] = 0;
		}
		
		
		// 국어 정답지
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
			System.out.printf(" %2d번 Jumsu = %d\n", i+1, stu_kor[i]);
		}
	} // Main
		
}
