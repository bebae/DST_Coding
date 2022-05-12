package test_1;
// 쿠쿠 기본세팅, 예약, tel

public class Test {

	int current_temp=0;		// 현재온도
	int temp=0;				// 적정 온드
	public void temp_up() {
		temp++;
	}
	public void temp_down() {
		temp--;
	}
	public int get() { 
		return 28;
	}
	public Test() {
		current_temp = get();
		temp = current_temp;
	}
	public Test(int t) {	// construction(컨스트럭션) overloading(오버리딩)
		// 공장 setting  현재 온도 28 / display
		current_temp = t;		//sensor(센서) read(불러오기)
		temp = current_temp;
		
	}
	
}
