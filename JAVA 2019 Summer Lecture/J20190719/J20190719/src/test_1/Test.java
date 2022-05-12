package test_1;
//mutraul exclusion	: 상호배제


class Count {
	int count=0;
	
	/*
	public void increment() {
		synchronized(this) {		// 동기화 블럭
			count++;
		}
	}
	*/
	// ↓ 같음 ↑
	synchronized public void increment() {
		count++;
	}
	
	/*
	public void decrement() {		// 동기화 블럭
		synchronized(this) {
			count--;
		}
	}
	*/
	synchronized public void decrement() {
		count--;
	}
	
	public int getCount() { return count; }
}

class MutualAccessSyncBlock {
	public static Count cnt = new Count();
	public static void main(String[] args) throws InterruptedException {
		
		Runnable task1 = () -> {
			for(int i=0;i<1000;i++) {
				cnt.increment();		// 값을 1 증가
			}
		};
	
		Runnable task2 = () -> {
			for(int i=0;i<1000;i++) {
				cnt.decrement();		// 값을 1 감소
			}
		};

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(cnt.getCount());
	}

}
