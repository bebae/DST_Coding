package test_4;

public class Test extends Thread{

	public void run() {
		System.out.println("test");
	}
	
	public static void main(String[] args) {
		Runnable r1 = new MyRunnable1();
		Runnable r2 = new MyRunnable2();
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(r2);
		t2.start();
	}

}

class MyRunnable1 implements Runnable{
	public void run() {
		System.out.println("MyRunnable1 start");
	}
}
class MyRunnable2 implements Runnable{
	public void run() {
		System.out.println("MyRunnable2 start");
	}
}