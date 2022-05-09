//0324 #5
//국어 영어 수학 3과목/ n명 // multi class main---
package test5;

import java.util.Scanner;

public class Main extends Test{ //상속/생성자/필드/메소드 ?????
	
	public Main(Scanner s) {
		super(s);
	}

	// redefine method overriding 아번지것을 계승발전
	public void result()
	{
		System.out.println("main result---------");
		for (int i =0; i<n; i++)
		{
			System.out.printf("kor[%d]= %d\n",i,kor[i]);
			System.out.printf("eng[%d]= %d\n",i,eng[i]);
			System.out.printf("mat[%d]= %d\n",i,mat[i]);
			System.out.printf("tot[%d]= %d\n",i,tot[i]);
			System.out.printf("ave[%d]= %d\n",i,ave[i]);
			System.out.println("");
		}
	}
			
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		//Test t = new Test(s);
		Main m = new Main(s);
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
			if (choice == 1)        m.input_proc();
			else if (choice == 2) 	m.comp_tot();
			else if (choice == 3)   m.comp_ave();
			else if (choice == 4)   m.result();
			else
			{ run = false; break;}
		}
		s.close();
	}
}
