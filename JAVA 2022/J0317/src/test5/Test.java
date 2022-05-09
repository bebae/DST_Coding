//0317 #5 사칙연산 class  array
package test5;
import java.util.Scanner;

public class Test {
	// 필드 멤버변수
	private int[] a;
	private int[] b;
	// 생성자
	public Test() {
		a = new int[3];
		b = new int[3];
	}
	//public void ab(int i) {
		
	//}
	// 메소드 멤버함수
	public int job(int i, String op) {
		a[i] = (int)(Math.random()* 101);
		b[i] = (int)(Math.random()* 101);
		if (op == "+")       return a[i] + b[i];
		else if (op == "-")  return a[i] - b[i];
		else if (op == "*")  return a[i] * b[i];
		else if (op  == "/") return a[i] / b[i];
		else return 0;
	}
	public void display(int i, String op, int c) {
		System.out.println(a[i] + op + b[i] + "=" + c);
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
	        		c=t.job(i,"+");
	        		t.display(i,"+", c);
	        	}
	        else if (choice == 2)
	        	for (int i=0; i<3; i++) {
	        		c=t.job(i,"-");
	        		t.display(i,"-", c);
	        	}
	        else if (choice == 3)
	        	for (int i=0; i<3; i++) { 
	        		c=t.job(i,"*");
	        		t.display(i,"*", c);
	        	}
	        else if (choice == 4)
	        	for (int i=0; i<3; i++) {
	        		c=t.job(i,"/");
	        		t.display(i,"/", c);
	        	}
	        else if (choice == 5) {
	        	run = false; break;
	        }
	        else
	        	System.out.println("input error!! including 1~4");
		}
	}
}

