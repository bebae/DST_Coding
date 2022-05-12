//0512 #3
//hero
package test3;

public class Main {

	public static void main(String[] args) {
		
		Hulk hulk = new Hulk();
		CaptinAmerica cap = new CaptinAmerica();
		
		hulk.attack();
        hulk.heal(10);
        hulk.sound();
        hulk.hit(20);
        hulk.jump();
        hulk.attack();
        System.out.println("式式式式式式式式式式式式式式式式式式式式式式式式式式");
        
        cap.attack();
        cap.heal(10);
        cap.attack();
        cap.hit(15);
        cap.muster();
        cap.hit(20);
        cap.attack();
	}

}
