// 0519 #7
// Thread 

//Runnable ���� expr / �Լ����� ������� �ʴ´�.

package test07;
public class Test_Thread extends Thread{

	// Thread �� ����ϸ� run �޼��带 �����ؾ� �Ѵ�.
	public void run() {
		int x = 10;
		int y = 20;
		
		System.out.println("x + y = "+(x+y));
	}
	public static void main(String[] args) {
		
		Test_Thread t1 = new Test_Thread();
		
		t1.start();

		System.out.println("Main End");

	}

}
