// 0519 #11 -> #12
// ������ Ȧ¦�� ��
// ���� rxpr Ŭ���� ���

package test12;

public class Test_oddeven {
// extends Thread ��� ���� �� why?
// Thread���� �����ϸ� ��� �������� ���� class�� �����ؼ� ����� �� ����� �޾ƾ� �ϱ� ������

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
		
		// ��� ���� �� ����(Runnable)�� �Ѱ� ��
		Thread o = new Thread(odd);
		Thread e = new Thread(even);
		
		// ���ٿ��� run�� �����Ѵ�.
		o.start();
		e.start();

	}		
}













