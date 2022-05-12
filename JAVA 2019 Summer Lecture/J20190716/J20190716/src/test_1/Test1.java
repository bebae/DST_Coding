package test_1;

public class Test1 extends Test{	// 상속
	
	public Test1() {
		super(25);		// Test()
	}
	// method(메소드) overriding(오버라이딩)
	public void temp_down(int low) {
		temp = low;
	}
	public void test_up(int high) {
		temp = high;
	}
	public void display() {
		System.out.println("외부온도 : "+current_temp);
		System.out.println("aircon : "+temp);
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.temp_down();		// 상위 함수 불러오기
		t.temp_down(18);	// my method
		t.display();
	}

}
