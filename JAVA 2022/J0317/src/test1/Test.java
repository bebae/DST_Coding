//0317 #1 ��Ģ���� 
package test1;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int a, b;
		
		Scanner s = new Scanner(System.in);
		// 1)���� 2)���� 3)Ű���� 4)����/db
		// for
		a = b = 10;
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
}