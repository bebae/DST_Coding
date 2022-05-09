package test;

import java.util.Scanner;
public class Test{
	// A B C반의 성적 처리

  public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);

	int n;	// 선택한 반의 학생 수
	int[] score = null;

	int[] class_no = new int[] {26,23,20};	// 반의 학생 수 목록
	boolean run = true;

	while(run) {
		System.out.println("-------------------");
		System.out.println("   A반 선택 (a)    ");
		System.out.println("   B반 선택 (b)    ");
		System.out.println("   C반 선택 (c)    ");
		System.out.println("      종료         ");
		System.out.println("-------------------");
		System.out.println("You select : ? ");
		String select = s.next();

		if (select.equals("a")){
			run = false;
			System.out.println("프로그램 종료");
			break;
		} else {
			switch(select){
				case "a" : n = class_no[0]; // A반 26명
					break;
				case "b" : n = class_no[1]; // B반 23명
					break;
				case "c" : n = class_no[2]; // C반 20명
					break;
				default : continue;
			}
			
			score = new int[n];
			for (int i=0;i<score.length;i++){
				score[i] = 0;
			}

			//입력
			for (int i=0;i<score.length;i++){
				score[i] = (int)(Math.random()*41)+60);	//랜덤 값
			}
			System.out.println("-------------------------------------");		
			System.out.println("  1. 합 구하기    ");		
			System.out.println("  2. 평균 구하기  ");		
			System.out.println("  3. 최대값 구하기");		
			System.out.println("  4. 최솟값 구하기");		
			System.out.println("  5. 성적 출력하기");		
			System.out.println("-------------------------------------");
			System.out.println("You select : ? ");
			String sel = s.next();		

			switch(sel){
				case 1 : // 합
					int sum = 0;
					for (int i=0;i<score.length;i++ ){
						sum += score[i];
					}
					System.out.println("sum = "+sum);
					break;
				case 2 : // 평균
					int sum = 0;
					for (int i=0;i<score.length;i++ ){
						sum += score[i];
					}
					int ave = sum/score.length;
					System.out.println("ave = "+ave);
					break;
				case 3 : // 최대값
					int max = 0;
					for (int i=0;i<score.length;i++){
						if (max < score[i])
							max = score[i]
					}
					System.out.println("max = "+max);
					break;
				case 4 : // 최솟값
					int min = 100;
					for (int i=0;i<score.length;i++){
						if (min > score[i])
							min = score[i]
					}
					System.out.println("min = "+min);
					break;
				case 5 : // 성적 출력
					for (int i=0;i<score.length;i++){
						System.out.println("학생"+i+": "+score[i]);
					}
					break;





				default : continue;
			} //whitch
		} //else
	} // while(run)
  } // main 
}
