package test;
import java.util.Scanner;

public class Test_1 {

  private static void func4(int[] scores){
		int max = 0, min = 100;
		for (int i=0;i<scores.length;i++){
			if (max < scores[i]) max = scores[i];
			if (min > scores[i]) min = scores[i];
		}
		System.out.println("max = "+max);
		System.out.println("min = "+min);

  }
  private static void func3(int[] scores){
		for (int i=0;i<scores.length;i++){
			System.out.println("score["+i+"]:"+scores[i]);
		}
  }
  private static void func2(int[] scores){
		for (int i=0;i<scores.length;i++){
			scores[i] = (int)(Math.random()*41)+60;	// 점수 입력 랜덤값 지정
		}
  }
  private static void func1(int stdent_no, int[] scores, s){	//학생 수
		System.out.println("학생 수 입력 :");
		stdent_no = s.nextInt();
		scores = new int[stdent_no];

  }

  public static void main(String[] args){
	
	boolean run = true;		//무한 루프
	int stdent_no = 0;		// 학생 수
	int[] scores = null;	// array size ??
	Scanner s = new Scanner(System.in);		// 임포트 포함
	
	while(run){
		System.out.println("-------------------------------");
		System.out.println("  1.학생수  2.점수입력  3.출석  4.분석  5.종료 ");
		System.out.println("-------------------------------");
		System.out.println("<선택> ");
		int selectNo = s.nextInt();

		switch(selectNo){
			case 1 : func1(stdent_no, scores, s);
					
					break;
			case 2 : func2(scores);
					 
					break;
			case 3 : func3(scores);
					 
					break;
			case 4 : func4(scores);
					 
					break;
			case 5 : run = false;
					System.out.println("시스템 종료");
					break;
			default : continue;
			
		} // switch

	} // while
	

  }	// main

} // class
