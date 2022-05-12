package test_4;

public class Car {
	
	int speed=0;
	String color=null;
	
	public Car() {
		color = "white";
		speed = 0;
	}
	public void mave_fw() {
		// x,y location(로케이션) conteol
	}
	public void move_bw() {
		// x,y location(로케이션) conteol
	}
	public void speed_up() {
		speed+=10;
		display();
	}
	public void speed_down() {
		speed-=10;
		display();
	}
	public void stop() {
		speed=0;
		display();
	}
	public void display() {
		System.out.println("speed:"+speed);
	}
	
	public static void main(String[] args) {
		Car avante = new Car();		//아반떼 500
		avante.full_option();
		
		avante.speed_up();avante.speed_up();avante.speed_up();
		avante.stop();
	}

}
