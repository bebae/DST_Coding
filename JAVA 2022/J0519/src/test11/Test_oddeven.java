// 0519 #10 -> #11
// ������ Ȧ¦�� ��
// ���� Ŭ���� ���

package test11;

class Odd extends Thread {
	public void run() {
		int odd_sum = 0;
		for (int i=0;i<100;i++) {
			if (i%2 == 1) {
				odd_sum += i;
			}
		}
		System.out.println("odd sum = "+odd_sum);
	}
}

class Even extends Thread {
	public void run() {
		int even_sum = 0;
		
		for (int i=0;i<100;i++) {
			if (i%2 == 0) {
				even_sum += i;
			} 
		}
		System.out.println("even sum = "+even_sum);
	}
}
public class Test_oddeven {
	public static void main(String[] args) {
		
		Odd odd = new Odd();
		Even even = new Even();
		
		odd.start();
		even.start();
	}		
}













