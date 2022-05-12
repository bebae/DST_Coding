package test_3;

public class InterfaceEx {
	public static void main(String[] args) {
		
		SmartTv tv = new SmartTv();
		tv.play();
		tv.stop();
		tv.send_sms();
		tv.recieve_sms();
		
		SmartPhone hp = new SmartPhone();
		hp.send_call();
		hp.recieve_call();
		hp.send_sms();
		hp.recieve_sms();
		hp.play();
		hp.stop();
	}
}
