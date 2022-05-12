package test_3;
// Thread(쓰레드)

import java.util.ArrayList;
public class Test extends Thread{
	
	int seq=0;
	public Test(int seq) {
		this.seq=seq;
	}
	public void run() {		// 쓰레드 실행
		System.out.println(this.seq+" thread start");
		try {
			Thread.sleep(1000);		// 1초
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.seq+" thread end.");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for(int i=0;i<10;i++) {
			Thread t = new Thread(new Test(i));
			t.start();
			threads.add(t);
		}
		for(int i=0;i<10;i++) {
			Thread t = threads.get(i);
//			try {
				t.join();		// c fork join
//			} catch( ) {
				
//			}
		}
		
		System.out.println("main end");
	}
	
}
