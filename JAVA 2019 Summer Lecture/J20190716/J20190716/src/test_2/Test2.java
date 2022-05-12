package test_2;

public class Test2 extends Test1{
	
	public Test2() {
		super();
		display();
	}
	public void ch_up() {
		ch++;
		if(ch > 900) ch=0;
		display();
	}
	public void ch_down(){
		ch--;
		if(ch<0) ch=899;
		display();
	}
	public void vol_up() {
		vol++;
		if(vol > 10) vol=10;
		display();
	}
	public void vol_down() {
		vol--;
		if(vol <= 0) vol=0;
		display();
	}
	public void display() {
		System.out.println("ch  : "+ch);
		System.out.println("vol : "+vol);
		System.out.println("-----------");
	}
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.ch_up();t.ch_up();t.ch_up();t.ch_up();
		t.ch_down();
		t.vol_down();t.vol_down();t.vol_down();
	}
}
