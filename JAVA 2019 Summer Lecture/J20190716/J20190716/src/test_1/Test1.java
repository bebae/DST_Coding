package test_1;

public class Test1 extends Test{	// ���
	
	public Test1() {
		super(25);		// Test()
	}
	// method(�޼ҵ�) overriding(�������̵�)
	public void temp_down(int low) {
		temp = low;
	}
	public void test_up(int high) {
		temp = high;
	}
	public void display() {
		System.out.println("�ܺοµ� : "+current_temp);
		System.out.println("aircon : "+temp);
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.temp_down();		// ���� �Լ� �ҷ�����
		t.temp_down(18);	// my method
		t.display();
	}

}
