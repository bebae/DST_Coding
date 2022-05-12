package testing_1;

public class ThreadMultiNoSleepDemo {
	public static void main(String[] args) {
		Runnable task1 = ()->{		// 20미만 짝수 출력
			for(int i=0;i<20;i++) {
				if(i%2==0) System.out.println(i+" ");
			}
		};
		
		Runnable task2 = ()->{		// 20미만 짝수 출력
			for(int i=0;i<20;i++) {
				if(i%2!=0) System.out.println(i+" ");
			}
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
	}
}
