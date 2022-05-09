//0324 #4
//국어 영어 수학 3과목/ n명 // multi class main---
package test4;

import java.util.Scanner;

public class Main {
	
	public Main() {}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Test t = new Test(s);
		Main m = new Main();
		boolean run = true;
		while(run)
		{
			System.out.println("----------------");
			System.out.println(" 1 : 성적 입력    ");
			System.out.println(" 2 : 총점        ");
			System.out.println(" 3 : 평균        ");
			System.out.println(" 4 : 출력        ");
			System.out.println(" 기타 : quit     ");
			System.out.println("----------------");
			System.out.print(">>>>>> : ");
			int choice = s.nextInt();
			if (choice == 1)        t.input_proc();
			else if (choice == 2) 	t.comp_tot();
			else if (choice == 3)   t.comp_ave();
			else if (choice == 4)   t.result();
			else
			{ run = false; break;}
		}
		s.close();
	}

}
