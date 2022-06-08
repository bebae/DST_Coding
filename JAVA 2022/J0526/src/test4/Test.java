// 0526 #4 
// 크리티컬 섹션 (임계 구역)
// Thread, lambda
package test4;

class Sales {
	
	// critical sec. 임계 구역
	private int count = 0;
	
	// 메소드 자체에서 상호배제 
	synchronized public void buy() {
		// 항목에서 상호배제
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
		
		
		// try/catch 를 쓸 때 try에 여러 실행문을 합쳐서 쓰면 정확히 오류가 났는지 알 수 없기때문에 try/catch는 1개씩 쓰는 게 정석이다.
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
