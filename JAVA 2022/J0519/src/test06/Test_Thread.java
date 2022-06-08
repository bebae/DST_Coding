// 0519 #6
// Thread 

package test06;

import test06.Test_Thread;

public class Test_Thread extends Thread{

	private int thread_id = 0;
	
	public Test_Thread(int i) {
		this.thread_id = i;
		
	}
	
	// Thread �� ����ϸ� run �޼��带 �����ؾ� �Ѵ�.
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(this.thread_id+" Thread Start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		Test_Thread t1 = new Test_Thread(1);
		Test_Thread t2 = new Test_Thread(2);
		
		t1.start();
		t2.start();

		System.out.println("Main End");

	}

}
