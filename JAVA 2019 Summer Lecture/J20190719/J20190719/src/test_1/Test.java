package test_1;
//mutraul exclusion	: ��ȣ����


class Count {
	int count=0;
	
	/*
	public void increment() {
		synchronized(this) {		// ����ȭ ��
			count++;
		}
	}
	*/
	// �� ���� ��
	synchronized public void increment() {
		count++;
	}
	
	/*
	public void decrement() {		// ����ȭ ��
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
				cnt.increment();		// ���� 1 ����
			}
		};
	
		Runnable task2 = () -> {
			for(int i=0;i<1000;i++) {
				cnt.decrement();		// ���� 1 ����
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
