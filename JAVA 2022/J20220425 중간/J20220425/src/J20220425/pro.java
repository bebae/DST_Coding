package J20220425;

public class pro {
	
	public void t_pro() {
		
		int[][] stu = new int[3][5]; 
		/*	
		 *	stu[][0] = 학번
		 * 	stu[][1] = 중간
		 * 	stu[][2] = 기말
		 * 	stu[][3] = 과제
		 * 	stu[][4] = 출석
		 */
		int[] tot = new int[3];
		String[] A = new String[3];
		
		
		String Jul = "─────────────────────────────────────────";
		
		
		//배열 초기화
		for(int i=0;i<3;i++) {
			tot[i] = 0;
			for(int j=0;j<5;j++) {
				stu[i][j] = 0;
			}
		}
		
		for(int i=0;i<3;i++) {
			stu[i][0] = i+100;
		}
		
		for(int i=0;i<3;i++) {			
				stu[i][1] = (int)(Math.random()*30+1);
				stu[i][2] = (int)(Math.random()*40+1);
				stu[i][3] = (int)(Math.random()*20+1);
				stu[i][4] = (int)(Math.random()*10+1);
			
		}	
		
		for(int i=0;i<3;i++) {	
			tot[i] = stu[i][1] + stu[i][2] + stu[i][3] + stu[i][4];
		}
		
		for(int i=0;i<3;i++) {
			if(tot[i]>=95) {
				A[i] = "A+";
			} else if(tot[i]>90) {
				A[i] = "A0";
			} else if(tot[i]>=85) {
				A[i] = "B+";
			} else if(tot[i]>80) {
				A[i] = "B0";
			} else if(tot[i]>=75) {
				A[i] = "C+";
			}else if(tot[i]>70) {
				A[i] = "C0";
			} else if(tot[i]>=65) {
				A[i] = "D+";
			} else if(tot[i]>60) {
				A[i] = "D0";
			} else {
				A[i] = "F";
			}
		}
		
		
		
		// 출력
		System.out.printf("\n %s \n", Jul);
		System.out.println("  학번    중간  기말  리포트  출석  총점  학점");
		System.out.printf(" %s \n", Jul);
		
		for(int i=0;i<3;i++) {
			System.out.printf(" CS%d %4d %4d %5d %4d %4d ", stu[i][0],stu[i][1],stu[i][2],stu[i][3],stu[i][4],tot[i]);
			System.out.printf(" %3s \n", A[i]);
		}
		System.out.printf(" %s \n", Jul);
		
	
	} // t_pro()
}
