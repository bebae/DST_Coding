// 0526 #3
// Ȧ�� ¦�� ������ ����
// runnable�� ���� ������ �ν����� ���Ͽ��� �ʵ� ������ ������
// main�� ���� ���� tot_sum�� ���� 0�̰� �������� even_sum�� odd_sum�� ���߿� ����
// �ذ��� Thread ���� -> join(���� ������ ��ٸ�)�� �������
// ������ ������ ���� �ٽ� Error�� try/catch 
// ���� expr

package test3;


public class Test {

	static int odd_sum = 0;
	static int even_sum = 0;
		
	public static void main(String[] args) {
		
		Runnable task1 = new MyRunnble1();
		Runnable task2 = new MyRunnble2();
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		// Thread join = �����尡 ���� ������ ��ٸ�
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int tot_sum = odd_sum + even_sum;
		System.out.printf("tot_sum =  %d\n", tot_sum);
		
		// main�� ���� ������ tot_sum�� ���� ������ ���߿� Thread�� ����ȴ�.
		// ����� : tot_sum = 0; �� even sum = 2450; odd sum = 2500;�� �ȴ�
	}


}




class MyRunnble1 extends Test implements Runnable {
	public void run() {
		for (int i=0;i<100;i++) {
			if (i%2==1) odd_sum += i;
		}
		System.out.printf("odd sum = %d\n", odd_sum);
	}
}
class MyRunnble2 extends Test implements Runnable {	
	public void run() {
		for (int i=0;i<100;i++) {
			if (i%2==0) even_sum += i;
		}
		System.out.printf("even sum = %d\n", even_sum);
	}
}










