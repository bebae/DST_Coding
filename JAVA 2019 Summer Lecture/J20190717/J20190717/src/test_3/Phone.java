package test_3;

public interface Phone {
	abstract public void send_call();
	abstract public void recieve_call();
}

interface sms {
	abstract public void send_sms();
	abstract public void recieve_sms();
}

interface audio {
	abstract public void play();
	abstract public void stop();
}