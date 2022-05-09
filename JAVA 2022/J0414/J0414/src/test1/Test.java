
//0414 #1  답안지 채점
// 10문항 4지선다
// 정답 직접 입력
package test1;

public class Test {
	public static void main(String[] args) {
		
		String Jul = "────────────────────────────────────";
		
		// 국어 정답지
		int[] kor_dapji = new int[] {1,2,3,4,1,2,3,4,1,2};
		
		System.out.print(" 국어정답 ");
		for(int i=0;i<10;i++) {
			System.out.printf("%2d ", kor_dapji[i]);
		}
		
		// 학생 N명
		for(int j=0;j<3;j++) {
			// 학생 답안지
			int[] stu_dapji = new int[10];
			
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
			int o = 0; 	// 맞은 갯수
			for(int i=0;i<10;i++) {
				if(kor_dapji[i] == stu_dapji[i]) {
					o++;
					System.out.print(" O ");
				} else {
					System.out.print(" X ");
				}
			}
			System.out.printf("\n %s\n", Jul);
			System.out.printf(" %d번 Jumsu = %d", j+1, o*10);
		} // 학생 N명 for
	} // Main
		
}
