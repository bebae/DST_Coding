//0512 #2
//날기 새, 항공기, 슈퍼맨
//공통적인 기능으로 모아서(메소드) bank interface
package test2;
interface Flying
{
	public void fly();
	public void land();
	public void take_off();
}

class Bird implements Flying {
	public void fly() {
		System.out.println("새가 난다");
	}
	public void land() {
		System.out.println("새가 나무에 도착했다");	
	}
	public void take_off() {
		System.out.println("새가 나무에서 날아갔다");
		
	}
}

class Airplane implements Flying {
	public void fly() {
		System.out.println("비행기가 난다");
	}
	public void land() {
		System.out.println("비행기가 공항에 도착했다");	
	}
	public void take_off() {
		System.out.println("비행기가 공항에서 이륙했다");
	}
}

class Superman implements Flying {
	public void fly() {
		System.out.println("슈퍼맨이 난다");
	}
	public void land() {
		System.out.println("슈퍼맨이 땅에 도착했다");	
	}
	public void take_off() {
		System.out.println("슈퍼맨이 떴다");
	}
	public void attack() {
		System.out.println("슈퍼맨이 공격한다");	
	}
}

public class FlyTest {

	public static void main(String[] args) {
	
		Flying bird = new Bird();
		Flying asiana = new Airplane();
		Flying superman = new Superman();
		
		bird.fly();
		bird.land();
		bird.take_off();
		bird.fly();
		System.out.println("──────────────────────");
		
		asiana.take_off();
		asiana.fly();
		asiana.land();
		System.out.println("──────────────────────");
		
		superman.take_off();
		superman.fly();
		((Superman) superman).attack();
		superman.fly();
		superman.land();
	}
}
