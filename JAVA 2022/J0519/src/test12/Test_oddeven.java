// 0519 #11 -> #12
// 구간의 홀짝의 합
// 람다 rxpr 클래스 사용

package test12;

public class Test_oddeven {
// extends Thread 없어도 실행 됨 why?
// Thread에서 선언하면 없어도 괜찮지만 만약 class를 선언해서 사용할 때 상속을 받아야 하기 때문임

	public static void main(String[] args) {
		Runnable odd = () -> {
			int odd_sum = 0;
			for (int i=0;i<100;i++) {
				if (i%2 == 1) {
					odd_sum += i;
				}
			}
			System.out.println("odd sum = "+odd_sum);
		};
		Runnable even = () -> {
			int even_sum = 0;
			
			for (int i=0;i<100;i++) {
				if (i%2 == 0) {
					even_sum += i;
				} 
			}
			System.out.println("even sum = "+even_sum);
		};
		
		// 상속 선언 후 람다(Runnable)을 넘겨 줌
		Thread o = new Thread(odd);
		Thread e = new Thread(even);
		
		// 람다에서 run을 실행한다.
		o.start();
		e.start();

	}		
}













