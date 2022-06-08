// J0519 #3

package test03;
import java.util.Scanner;

class CheckAgeException extends Exception {
	// ���� �޼��� ����
	public CheckAgeException() {
		super("���̰� ��ȿ���� �ʽ��ϴ�.");
	}
}

public class Test_Thread {
	
	// ���ο��� ȣ���� ��� static�� �ٿ��� ��
	public static int CheckAge() throws CheckAgeException{
		Scanner sc = new Scanner(System.in);
		int age = 0;
		
		System.out.println("���̸� �Է� : ");
		age = sc.nextInt();
		if (age < 0) {
			throw new CheckAgeException();
		}
		return age;
	}
	
	public static void main(String[] args) throws CheckAgeException {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		
		if (age < 0) {
			// ���� ���� �߻�
			// �ַ� while�� if�� �Ἥ ó��
		}
		
		try {
			age = CheckAge();
			System.out.println("age = "+age);
		} catch (CheckAgeException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
