// 0519 #9
// Runnable 람다 expr = 함수명을 사용하지 않는다.
// before 람다, 다중 클래스

package test09;

public class Test_Runnable extends Thread {
	// extends Thread 없어도 실행 됨 why?
	// Thread에서 선언하면 없어도 괜찮지만 만약 class를 선언해서 사용할 때 상속을 받아야 하기 때문임
	
	public static void main(String[] args) {
		
		Runnable task1 = () -> {
			int x = 10;
			int y = 20;
			
			System.out.println("z = "+(x+y));
		};
		Runnable task2 = () -> {
			int x = 20;
			int y = 30;
			
			System.out.println("z = "+(x+y));
		};
		
		// 상속 선언 후 람다(Runnable)을 넘겨 줌
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		// 람다에서 run을 실행한다.
		t1.start();
		t2.start();

	}	//main
}
