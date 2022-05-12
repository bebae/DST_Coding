package test_4;

public class Test extends Thread{
	
	int num=0;
	public Test(int num) {
		this.num=num;
	}
	public void run() {
		System.out.println(this.num+" thread start");
		try {
			Thread.sleep(1000);		// 1√ 
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Test t = new Test(i);
			t.start();
		}
		
		System.out.println("main end");
	}
	
}
