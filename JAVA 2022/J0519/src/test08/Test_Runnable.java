// 0519 #8
// Runnable ���� expr = �Լ����� ������� �ʴ´�.
// before ����, ���� Ŭ����

package test08;

class Task1 extends Thread {	// Thread�� ��ӹް�
	public void run() {
		int x = 10;
		int y = 20;
		
		System.out.println("z = "+(x+y));
	}
}
class Task2 extends Thread {	// Thread�� ��ӹް�
	public void run() {
		int x = 20;
		int y = 30;
		
		System.out.println("z = "+(x+y));
	}
}

public class Test_Runnable{
	
	public static void main(String[] args) {
		
		// Ŭ���� ���� ��
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		
		// Ŭ�������� run�� �����Ѵ�.
		t1.start();
		t2.start();

	}	//main
}
