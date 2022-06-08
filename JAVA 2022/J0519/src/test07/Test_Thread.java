// 0519 #7
// Thread 

//Runnable 람다 expr / 함수명을 사용하지 않는다.

package test07;
public class Test_Thread extends Thread{

	// Thread 를 상속하면 run 메서드를 구현해야 한다.
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
