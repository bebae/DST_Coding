package test_3;

public class SmartPhone implements Phone,sms,audio{
	public void send_call() 
	{System.out.println("hp send call");}
	public void recieve_call() 
	{System.out.println("hp receive call");}
	public void send_sms() 
	{System.out.println("hp send sms");}
	public void recieve_sms() 
	{System.out.println("hp receive sms");}
	public void play() 
	{System.out.println("hp aubio play");}
	public void stop() 
	{System.out.println("hp aubio stop");}
}
