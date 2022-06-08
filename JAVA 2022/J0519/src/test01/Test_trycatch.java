// J0519 #1
/* �������� try~catch
 * app => ���ͷ�Ʈ -> ó�� ���α׷�
 * Ű������ ���� ��罺ũ��
 * ���۸� �ۼ��� ���� => fifo=���Լ��� �ý���, ����� spooling
 * generic type error <String> T
 * divide by zero 3/0 �� �� ���� 
 */ 

package test01;
import java.util.Scanner;

public class Test_trycatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x=0, y=0;
		int z=0;
		
		x = (int)(Math.random()*100);
		y = (int)(Math.random()*100);

		if (y==0) {
			System.out.println("0�� �ƴ� ������� �Է� : ");
			y = sc.nextInt();
		}
		if (y==0) {
			System.out.println("divide by zero error!");
		} else {
			try {								// ���� �߻� �ڵ�
				z = x/y;
				System.out.println("X / Y = "+z);
			} catch(ArithmeticException e) {	// ���� �߻� �� ó���Ǵ� �ڵ�
				z = -1;
				System.out.println(e.getMessage());
			} finally {							// �׻� ó���Ǵ� �ڵ�
				System.out.println("Error Processed");
			}
		}
		
			
		
	}

}
