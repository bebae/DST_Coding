// 0428 #3
// ���� Ŭ����
// ��Ź��

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

interface styler{		// �Ƿ��� ������ ���ְ� ������ ���ְ� ����� �ϴ� �Ƿ��� �����ϴ� ������ǰ
	public void styling();
}

// implements ���ø���Ʈ�� ���� ����� �����ϴ�
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
			case 1 : System.out.println("��Ź ��");	
				break;
			case 2 : System.out.println("��Ź ��");
				break;
			case 3 : System.out.println("��Ź ��");
				break;
			case 4 : System.out.println("�� �ڽ�");	
				break;
			default : System.out.println("Error");
				break;
		}
	}		// changeCource �ڽ� ����
	public void drying() {
		System.out.println("Drying");		
	}
	// �������̵�
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




















