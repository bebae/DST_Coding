// 0519 #4

/* �����ϰ� �ִ� ���α׷��� ���μ���(Process)��� �Ѵ�.
 * ���� �� ���� ���μ����� �� ������ ���� ������,
 * �����带 �̿��ϸ� �� ���μ��� ������ �� ���� �Ǵ� 
 * �� �̻��� ���� ���ÿ� �� �� �ִ�.
 */
package test04;

// Thread�� ��� �޾� ��
public class Test_Thread extends Thread {
	
	// ������
	// �޼ҵ�
	
	// Thread �� ����ϸ� run �޼��带 �����ؾ� �Ѵ�.
	public void run() {
		System.out.println("thred start");
	}
	public static void main(String[] args) {
		Test_Thread t = new Test_Thread();
		t.start();	// start()�� �����带 �����Ѵ�.
	}
}
