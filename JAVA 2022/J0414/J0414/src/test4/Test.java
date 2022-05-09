
//0414 #4  답안지 채점
// 10문항 4지선다
// 정답 랜덤 
// 학생 N명의 대한 kor, eng, mat, avg, max
// 3과목에 대한 
// Class

package test4;
import java.util.Scanner;

public class Test {
	Scanner sc = new Scanner(System.in);
	
	// 필드
	private static int[] stu_kor; 
	private static int[] stu_eng;
	private static int[] stu_mat;		
	static int n = 0;			// 학생 수
	private static String Jul = "─────────────────────────────────────";
	
	// 객체 생성 초기화
	public Test() {		// 멤버 변수 초기화
		stu_kor = null; 
		stu_eng = null;
		stu_mat = null;	
	
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
	} // Test
	
	
	public void t_find_Max(int[] stu_kor) {
		int max = 0;
		int min = 100;
		int hap = 0;
		int ave = 0;
		
		// 학생 수가 0명이라면 실행 X
		if(n == 0) {
			System.out.println(" 학생 수 가 0명 입니다. 학생 수를 입력해주세요");
			
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
	}
	// 메소드 = 자주 사용하는 것
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ch = ""; 	// while 문 선택
		
		Test t = new Test();
		Kor k = new Kor();
		
		while(true) {
			System.out.printf("\n %s \n", Jul);
			System.out.println("  1 : 국어 채점");
			System.out.println("  2 : 영어 채점");
			System.out.println("  3 : 수학 채점");
			System.out.println("  4 : Max / Min / Ave");
			System.out.println("  5 : 종 료");
			System.out.printf(" %s \n", Jul);
			
			System.out.printf("  입력 : ");
			ch = sc.next();			// ────────────────── 문자 넣기
			
			if(ch.equals("1")) {	// ────────────────── 문자열 비교
				stu_kor = k.t_kor_check(n);		// kor_check에 학생 수를 넘겨주고 계산된 배열값을 다시 넘겨받음
			} else if(ch.equals("2")) {
				
			} else if(ch.equals("3")) {
				
			} else if(ch.equals("4")) {
				t.t_find_Max(stu_kor);
				break;
			} else if(ch.equals("5")){
				System.out.println(" 프로그램을 종료합니다.");				
			} else {
				continue;
			}
		} // while문
		sc.close();		// 스캐너 종료
	} // Main

	

}








