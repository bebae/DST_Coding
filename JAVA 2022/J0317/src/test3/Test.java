//0317 #3 ��Ģ���� class 
package test3;
import java.util.Scanner;

public class Test {
	// �ʵ� �������
	int a,b;
	// ������
	//static int job1_n = 3;
	public Test() {
		//a = (int)(Math.random()* 101);
		//b = (int)(Math.random()* 101);
	}
	public void ab() {
		a = (int)(Math.random()* 101);
		b = (int)(Math.random()* 101);
	}
	// �޼ҵ� ����Լ�
	public void job1() {
		ab();
		int c= a + b;
		//System.out.println(a + "+" + b + "=" + c);
		System.out.printf("%d+%d=%d\n",a,b,c);
	}
	public void job2() {		
		;
	}
	public void job3() {
		ab();
		int c = a * b;
		//System.out.println(a + "*" + b + "=" + c);
		System.out.printf("%d*%d=%d\n",a,b,c);	
	} 
	public void job4() {
		ab();
		int c = a / b;
		//System.out.println(a + "/" + b + "=" + c);
		System.out.printf("%d/%d=%d\n",a,b,c);
	} 
	public static void main(String[] args) {
		Test t = new Test();
		Scanner s = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.print("1:+  2:-  3:*  4:/  5:exit  ?:");
			int choice = s.nextInt();
	        if (choice == 1) 
	        	for (int i=0; i<3; i++) t.job1();
	        else if (choice == 2)
	        	for (int i=0; i<3; i++) t.job2();
	        else if (choice == 3)
	        	for (int i=0; i<3; i++) t.job3();
	        else if (choice == 4)
	        	for (int i=0; i<3; i++) t.job4();
	        else if (choice == 5) {
	        	run = false; break;
	        }
	        else
	        	System.out.println("input error!! including 1~4");
		}
	}
}