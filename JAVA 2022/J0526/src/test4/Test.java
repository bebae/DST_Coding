// 0526 #4 
// ũ��Ƽ�� ���� (�Ӱ� ����)
// Thread, lambda
package test4;

class Sales {
	
	// critical sec. �Ӱ� ����
	private int count = 0;
	
	// �޼ҵ� ��ü���� ��ȣ���� 
	synchronized public void buy() {
		// �׸񿡼� ��ȣ����
		synchronized(this) {count++;}
	}

	public void sell() {
		synchronized(this) {count--;}	
	}
	public int getCount(){
		return this.count;
	}
	
}

public class Test {

	static Sales sa = new Sales();
	public static void main(String[] args) {
		
		Runnable task1 =() ->{
			for (int i=0; i<1000; i++) {
				sa.buy();
			}
		};
		Runnable task2 =() ->{
			for (int i=0; i<1000; i++) {
				sa.sell();
			}
		};
		
		Thread t1 = new Thread(task1);
		t1.start();
		
		Thread t2 = new Thread(task2);
		t2.start();
		
		
		// try/catch �� �� �� try�� ���� ���๮�� ���ļ� ���� ��Ȯ�� ������ ������ �� �� ���⶧���� try/catch�� 1���� ���� �� �����̴�.
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("count = "+sa.getCount());
	}

}
