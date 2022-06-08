// 0519 #5
/* �����ϰ� �ִ� ���α׷��� ���μ���(Process)��� �Ѵ�. 
 * ���� �� ���� ���μ����� �� ������ ���� ������,
 * �����带 �̿��ϸ� �� ���μ��� ������ �� ���� �Ǵ� 
 * �� �̻��� ���� ���ÿ� �� �� �ִ�.
 */ 

package test05;

//Thread�� ��� �޾� ��
public class Test_Thread extends Thread{
	
	private int num = 0;
	
	public Test_Thread(int num) {
		this.num = num;
		
	}
	
	// Thread �� ����ϸ� run �޼��带 �����ؾ� �Ѵ�.
	public void run() {
		System.out.println(this.num+" Thread Start");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		for (int i=0;i<10;i++) {
			Test_Thread t = new Test_Thread(i);
			t.start();	// start()�� �����带 �����Ѵ�.
		}
		System.out.println("Main End");
	}
	
	/*
	 * 0�� ��������� 9�� ��������� ������� ������ ���� �ʰ� 
	 * �� ������ ����ġ ���� ���� ���� ������� ������ ������� ���ÿ� 
	 * ����ȴٴ� ����� �� �� �ִ�. 
	 * ���� ��մ� ����� �����尡 ����Ǳ� ���� 
	 * main �޼ҵ尡 ����Ǿ��ٴ� ����̴�. 
	 * main �޼ҵ� ���� �� "main end."��� ���ڿ��� ��µǴµ� 
	 * �� ����� ���� �߰��뿡 ��µǾ� �ִ�. * 
	 */
}















