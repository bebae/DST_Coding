// 0526 #2
// 홀수 짝수 쓰레드 조인
// runnable을 쓰면 변수를 인식하지 못하여서 필드 변수로 선언함
// main이 먼저 끝나 tot_sum의 값이 0이고 쓰레드인 even_sum과 odd_sum이 나중에 끝남
// 해결방법 Thread 동기 -> join(끝날 때까지 기다림)을 해줘야함
// 쓰레드 조인을 쓰면 다시 Error로 try/catch 
package test2;

public class Test {

	static int odd_sum = 0;
	static int even_sum = 0;
	
	public static void main(String[] args) {
		
		
		Runnable task1 = () ->{
			for (int i=0;i<100;i++) {
				if (i%2==1) odd_sum += i;
			}
			System.out.printf("odd sum = %d\n", odd_sum);
		};
		
		Runnable task2 = () ->{
			for (int i=0;i<100;i++) {
				if (i%2==0) even_sum += i;
			}
			System.out.printf("even sum = %d\n", even_sum);
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		// Thread join = 쓰레드가 끝날 때까지 기다림
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int tot_sum = odd_sum + even_sum;
		System.out.printf("tot_sum =  %d\n", tot_sum);
		
		// main인 먼저 끝나서 tot_sum이 먼저 끝나고 나중에 Thread가 실행된다.
		// 결과값 : tot_sum = 0; 후 even sum = 2450; odd sum = 2500;이 된다
	}

}
