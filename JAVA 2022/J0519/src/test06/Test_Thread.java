// 0519 #6
// Thread 

package test06;

import test06.Test_Thread;

public class Test_Thread extends Thread{

	private int thread_id = 0;
	
	public Test_Thread(int i) {
		this.thread_id = i;
		
	}
	
	// Thread 를 상속하면 run 메서드를 구현해야 한다.
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
