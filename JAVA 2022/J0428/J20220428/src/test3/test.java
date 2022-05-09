// 0428 #3
// 다중 클래스
// 세탁기

package test3;

interface washing{
	public void startButton();
	public void pauseButton();
	public void stopButton();
	public void changeCource(int course);
}

interface dry{
	public void drying();
}

interface styler{		// 의류의 구김을 펴주고 냄새를 빼주고 살균을 하는 의류를 관리하는 가전제품
	public void styling();
}

// implements 임플리먼트는 다중 상속이 가능하다
class LGwm implements washing, dry, styler{
	public void startButton() {
		System.out.println("Start Wasing");
	}
	public void pauseButton() {
		System.out.println("Pause Wasing");
	}
	public void stopButton() {
		System.out.println("Stop Wasing");
	}
	public void changeCource(int course) {
		System.out.println("Wasing Course Change");
		switch(course) {
			case 1 : System.out.println("세탁 강");	
				break;
			case 2 : System.out.println("세탁 중");
				break;
			case 3 : System.out.println("세탁 약");
				break;
			case 4 : System.out.println("울 코스");	
				break;
			default : System.out.println("Error");
				break;
		}
	}		// changeCource 코스 변경
	public void drying() {
		System.out.println("Drying");		
	}
	// 오버라이딩
	public void drying(String x) {
		System.out.println(x+" Drying");
	}
	public void styling() {
		System.out.println("Stlyer begin");
	}
}

public class test {
	
	public static void main(String[] args) {
		LGwm lg = new LGwm();
		lg.startButton();
		lg.pauseButton();
		lg.changeCource(1);
		lg.stopButton();
		
		LGwm trom = new LGwm();
		trom.drying();
		trom.drying("wool");
		
		LGwm stylerX = new LGwm();
		stylerX.styling();
		
	}
	
}




















