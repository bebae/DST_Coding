package test_2;

public class Test {
	
	// member data , field
	private int a;
	private int b;
	
	// ������ : ��ü ���� �ʱ�ȭ
	public Test() {
		a = 20;
		b = 10;
		
	}
	
	// method : ��ü �Լ�
	public int add() {
		return a+b;	
	}
	public int subtract() {
		return a-b;	
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		int x = t.add();
		System.out.println("a+b = "+x);
	
		int y = t.subtract();
		System.out.println("a-b = "+y);
	}
}

