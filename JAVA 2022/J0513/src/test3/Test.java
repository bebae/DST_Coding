// 0513 #3
// �ܺο��� ���� �� ������ �ʿ��ѿ� trycatch�� ����Ѵ�.
// ������ ���� ������ ���α׷� �� ���� �ſ� �۾������� 

package test3;
import java.util.Scanner;

class CheckAgeException extends Exception{
	public CheckAgeException() {
		super ("���̰� ��ȿ���� �ʽ��ϴ�.");
//super Ű����� �θ� Ŭ�����κ��� ��ӹ��� �ʵ峪 �޼ҵ带 �ڽ� Ŭ�������� �����ϴ� �� ����ϴ� ���� �����Դϴ�.
	}
}

public class Test {
	static Scanner sc = new Scanner(System.in);
	
	public static int checkAge() throws CheckAgeException{
		int age = 0;
		
		age = sc.nextInt();
		if (age < 0 || age > 500) throw new CheckAgeException();
		// ������ �´ٸ� Check Ŭ���� ����
		
		return age;
	}
	public static void main(String[] args) {
		int age = 0;
		
		System.out.print("���̸� �Է� : ");
	//	age = sc.nextInt();
		try {
			age = checkAge();
			System.out.println("age : "+age);
		} catch (CheckAgeException e) {
			System.out.println(e.getMessage());
			// getMessage() = �ý��� ��ü �����޽����� ����� 
		}
		
	}
}














