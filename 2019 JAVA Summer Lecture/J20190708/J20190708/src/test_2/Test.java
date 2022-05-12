package test_2;

public class Test {
	
	// member data , field
	private int a;
	private int b;
	
	// 생성자 : 객체 생성 초기화
	public Test() {
		a = 20;
		b = 10;
		
	}
	
	// method : 객체 함수
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

