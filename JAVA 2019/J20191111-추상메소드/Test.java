package test;

public class Test {
	
	public static void main(String[] args) {
		// 개, 고양이  사운드
		
		Test3 dog = new Test3();
		
		// 메소드의 종류
		
		dog.eating();
		dog.sound();
		
		System.out.println("──────────────────────────");
		// ───────────────────────────────────────────
		Test2 animal = null;
		animal = new Test3();
		animal.sound();
		
		
		System.out.println("──────────────────────────");
		// ───────────────────────────────────────────		
		
		animal_sound(new Test3());
		// 오브젝트  instance
	
	
	}
	
	public static void animal_sound(Test3 animal) {
		animal.sound();
	}
	
} //class






