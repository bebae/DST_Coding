//0317 #4 ��Ģ���� class 
package test4;
import java.util.Scanner;

public class Test {
	// �ʵ� �������
	private int a,b;
	// ������
	public Test() {
	
	}
	public void ab() {
		a = (int)(Math.random()* 101);
		b = (int)(Math.random()* 101);
	}
	// �޼ҵ� ����Լ�
	public int job(String op) {
		ab();
		if (op == "+")       return a + b;
		else if (op == "-")  return a - b;
		else if (op == "*")  return a * b;
		else if (op  == "/") return a / b;
		else return 0;
	}
	public void display(String op, int c) {
		System.out.println(a + op + b + "=" + c);
		//System.out.printf("%d+%d=%d\n",a,b,c);
	}
	
	public static void main(String[] args) {
		int c;
		Test t = new Test();
		Scanner s = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.print("1:+  2:-  3:*  4:/  5:exit  ?:");
			int choice = s.nextInt();
	        if (choice == 1) 
	        	for (int i=0; i<3; i++) {
	        		c=t.job("+");
	        		t.display("+", c);
	        	}
	        else if (choice == 2)
	        	for (int i=0; i<3; i++) {
	        		c=t.job("-");
	        		t.display("-", c);
	        	}
	        else if (choice == 3)
	        	for (int i=0; i<3; i++) { 
	        		c=t.job("*");
	        		t.display("*", c);
	        	}
	        else if (choice == 4)
	        	for (int i=0; i<3; i++) {
	        		c=t.job("/");
	        		t.display("/", c);
	        	}
	        else if (choice == 5) {
	        	run = false; break;
	        }
	        else
	        	System.out.println("input error!! including 1~4");
		}
	}
}
