//0324 #4
//���� ���� ���� 3����/ n�� // multi class main---
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
			System.out.println(" 1 : ���� �Է�    ");
			System.out.println(" 2 : ����        ");
			System.out.println(" 3 : ���        ");
			System.out.println(" 4 : ���        ");
			System.out.println(" ��Ÿ : quit     ");
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
