//0317 #2 ��Ģ���� class 
package test2;
import java.util.Scanner;

public class Test {
	// �ʵ� �������
	int a,b;
	// ������
	public Test() {
		a = b = 10;
	}
	// �޼ҵ� ����Լ�
	
	public void sachick() {
		Scanner s = new Scanner(System.in);
		int c;
		System.out.print("1:+  2:-  3:*  4:/   ?:");
		int choice = s.nextInt();
        
		if (choice == 1) {
			c= a + b;
			System.out.println(a + "+" + b + "=" + c);
			System.out.printf("%d+%d=%d\n",a,b,c);
		} else if (choice == 2) {
			;
		} else if (choice == 3) {
			c = a * b;
			System.out.println(a + "*" + b + "=" + c);
			System.out.printf("%d*%d=%d\n",a,b,c);	
		} else if (choice == 4) {
			c = a / b;
			System.out.println(a + "/" + b + "=" + c);
			System.out.printf("%d/%d=%d\n",a,b,c);
		} else
			System.out.println("input error!!");		
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.sachick();			
	}
}