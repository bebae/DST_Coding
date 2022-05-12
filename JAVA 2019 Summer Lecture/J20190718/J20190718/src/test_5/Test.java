package test_5;

import java.util.Random;
public class Test extends Thread{

	private static final Random random = new Random();
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println("- "+threadName+" has been started");
		int delay = 1000 + random.nextInt(4000);
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("- "+threadName+" has been ended ("+delay+"mss)");
	}
	
	public static void main(String[] args) {
		// create thread objects
		Thread thread1 = new Test();
		thread1.setName("Thread #1");
		Thread thread2 = new Test();
		thread2.setName("Thread #2");
		
		// create runnble objects
		Runnable runnable1 = new MyRunnable();
		Runnable runnable2 = new MyRunnable();
		
		Thread thread3 = new Thread(runnable1);
		thread3.setName("Thread #3");
		Thread thread4 = new Thread(runnable2);
		thread4.setName("Thread #4");
		
		// start all threads
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}

class MyRunnable implements Runnable{
	private static final Random random = new Random();
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println("- "+threadName+" has been started");
		int delay = 1000+random.nextInt(4000);
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("- "+threadName+" has been ended ("+delay+"ms)");
	}
}