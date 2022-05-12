//0512 #3
// Hero
package test3;

public class CaptinAmerica {

private int hp = Hero.MAX_HP;
	
	public void attack() {
		System.out.println("방패를 던져 공격한다.");
	}
	
	public void heal(int portion) {
		hp += portion;
		if (hp >= Hero.MAX_HP)
			hp = Hero.MAX_HP;
		System.out.println("캡틴아메리카가 체력을 " + portion +"만큼 회복을 했습니다.");
	}
	
	public void muster() {
		System.out.println("어벤져스 동료를 소집한다.");
	}	
	public void hit(int damage) {
		System.out.println("캡틴아메리카가 "+damage+"만큼의 데미지를 입어습니다.");
	}

}
