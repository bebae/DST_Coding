// 0519 #8
// Runnable 람다 expr = 함수명을 사용하지 않는다.
// before 람다, 다중 클래스

package test08;

class Task1 extends Thread {	// Thread를 상속받고
	public void run() {
		int x = 10;
		int y = 20;
		
		System.out.println("z = "+(x+y));
	}
}
class Task2 extends Thread {	// Thread를 상속받고
	public void run() {
		int x = 20;
		int y = 30;
		
		System.out.println("z = "+(x+y));
	}
}

public class Test_Runnable{
	
	public static void main(String[] args) {
		
		// 클래스 선언 후
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		
		// 클래스에서 run을 실행한다.
		t1.start();
		t2.start();

	}	//main
}
