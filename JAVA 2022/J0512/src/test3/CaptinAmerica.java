//0512 #3
// Hero
package test3;

public class CaptinAmerica {

private int hp = Hero.MAX_HP;
	
	public void attack() {
		System.out.println("���и� ���� �����Ѵ�.");
	}
	
	public void heal(int portion) {
		hp += portion;
		if (hp >= Hero.MAX_HP)
			hp = Hero.MAX_HP;
		System.out.println("ĸƾ�Ƹ޸�ī�� ü���� " + portion +"��ŭ ȸ���� �߽��ϴ�.");
	}
	
	public void muster() {
		System.out.println("����� ���Ḧ �����Ѵ�.");
	}	
	public void hit(int damage) {
		System.out.println("ĸƾ�Ƹ޸�ī�� "+damage+"��ŭ�� �������� �Ծ���ϴ�.");
	}

}
