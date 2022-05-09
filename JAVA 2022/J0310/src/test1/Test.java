//0310 #1 3명성적 = 중간+기말+리포트+출석
package test1;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int mid, fin, rpt, chul; //지역변수
		
		Scanner s = new Scanner(System.in); //스캐너 객체 생성

		System.out.println("순번 중간 기말 리포트 출석 총점");
		System.out.println("---------------------------");
		
		for (int i=0; i<3; i++)
		{
			//input 
			// 1) mid = 30; fin = 40; rpt = 20; chul = 10;
			// 2) (int) :cast (00 00 00 00) 00 00 00 00 ex) 1,000,000,000
			mid = (int)(Math.random()*31);
			fin = (int)(Math.random()*41);
			rpt = (int)(Math.random()*21);
			chul = (int)(Math.random()*11);
			//3) 키보드 입력
			//System.out.print("mid 0 ~30 :?");
			//mid = s.nextInt();
			//System.out.print("fin 0 ~40 :?");
			//fin = s.nextInt();
			//System.out.print("rpt 0 ~20 :?");
			//rpt = s.nextInt();
			//System.out.print("chul 0 ~10 :?");
			//chul = s.nextInt();
			
			//processing
			int tot = mid + fin + rpt + chul;
			if (chul <=0 ) tot =0; //결F
			
			//output
			System.out.printf("%3d",i);
			System.out.printf("%4d",mid);
			System.out.printf("%4d",fin);
			System.out.printf(" %4d",rpt);
			System.out.printf("%4d",chul);
			System.out.printf(" %4d",tot);
			System.out.println("\n-------------------------");
		}
	}
}
