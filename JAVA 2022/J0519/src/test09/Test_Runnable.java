// 0519 #9
// Runnable ���� expr = �Լ����� ������� �ʴ´�.
// before ����, ���� Ŭ����

package test09;

public class Test_Runnable extends Thread {
	// extends Thread ��� ���� �� why?
	// Thread���� �����ϸ� ��� �������� ���� class�� �����ؼ� ����� �� ����� �޾ƾ� �ϱ� ������
	
	public static void main(String[] args) {
		
		Runnable task1 = () -> {
			int x = 10;
			int y = 20;
			
			System.out.println("z = "+(x+y));
		};
		Runnable task2 = () -> {
			int x = 20;
			int y = 30;
			
			System.out.println("z = "+(x+y));
		};
		
		// ��� ���� �� ����(Runnable)�� �Ѱ� ��
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		// ���ٿ��� run�� �����Ѵ�.
		t1.start();
		t2.start();

	}	//main
}
