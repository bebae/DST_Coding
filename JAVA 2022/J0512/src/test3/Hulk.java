package test3;

public class Hulk implements Hero{
	
	private int hp = Hero.MAX_HP;
	
	public void attack() {
		System.out.println("눈에 보이는 모든 것을 던져 공격한다");
	}
	
	public void heal(int portion)
	{
		hp += portion;
		if (hp >= Hero.MAX_HP)
			hp = Hero.MAX_HP;
		System.out.println("헐크가 체력을 " + portion +
				"만큼 회복을 했습니다");
	}
	
	public void sound()
	{
		System.out.println("크아아아아");
	}
	
	public void jump()
	{
		System.out.println("헐크가 높이 점프합니다");
	}
	public void hit(int damage) {
		System.out.println("헐크가 "+damage+"만큼의 데미지를 입어습니다.");
	}
}

