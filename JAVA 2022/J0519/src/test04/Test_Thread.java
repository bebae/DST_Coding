// 0519 #4

/* 동작하고 있는 프로그램을 프로세스(Process)라고 한다.
 * 보통 한 개의 프로세스는 한 가지의 일을 하지만,
 * 쓰레드를 이용하면 한 프로세스 내에서 두 가지 또는 
 * 그 이상의 일을 동시에 할 수 있다.
 */
package test04;

// Thread를 상속 받아 옴
public class Test_Thread extends Thread {
	
	// 생성자
	// 메소드
	
	// Thread 를 상속하면 run 메서드를 구현해야 한다.
	public void run() {
		System.out.println("thred start");
	}
	public static void main(String[] args) {
		Test_Thread t = new Test_Thread();
		t.start();	// start()로 쓰레드를 실행한다.
	}
}
