// 0519 #5
/* 동작하고 있는 프로그램을 프로세스(Process)라고 한다. 
 * 보통 한 개의 프로세스는 한 가지의 일을 하지만,
 * 쓰레드를 이용하면 한 프로세스 내에서 두 가지 또는 
 * 그 이상의 일을 동시에 할 수 있다.
 */ 

package test05;

//Thread를 상속 받아 옴
public class Test_Thread extends Thread{
	
	private int num = 0;
	
	public Test_Thread(int num) {
		this.num = num;
		
	}
	
	// Thread 를 상속하면 run 메서드를 구현해야 한다.
	public void run() {
		System.out.println(this.num+" Thread Start");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		for (int i=0;i<10;i++) {
			Test_Thread t = new Test_Thread(i);
			t.start();	// start()로 쓰레드를 실행한다.
		}
		System.out.println("Main End");
	}
	
	/*
	 * 0번 쓰레드부터 9번 쓰레드까지 순서대로 실행이 되지 않고 
	 * 그 순서가 일정치 않은 것을 보면 쓰레드는 순서에 상관없이 동시에 
	 * 실행된다는 사실을 알 수 있다. 
	 * 더욱 재밌는 사실은 쓰레드가 종료되기 전에 
	 * main 메소드가 종료되었다는 사실이다. 
	 * main 메소드 종료 시 "main end."라는 문자열이 출력되는데 
	 * 위 결과를 보면 중간쯤에 출력되어 있다. * 
	 */
}















