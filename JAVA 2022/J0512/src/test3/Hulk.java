package test3;

public class Hulk implements Hero{
	
	private int hp = Hero.MAX_HP;
	
	public void attack() {
		System.out.println("���� ���̴� ��� ���� ���� �����Ѵ�");
	}
	
	public void heal(int portion)
	{
		hp += portion;
		if (hp >= Hero.MAX_HP)
			hp = Hero.MAX_HP;
		System.out.println("��ũ�� ü���� " + portion +
				"��ŭ ȸ���� �߽��ϴ�");
	}
	
	public void sound()
	{
		System.out.println("ũ�ƾƾƾ�");
	}
	
	public void jump()
	{
		System.out.println("��ũ�� ���� �����մϴ�");
	}
	public void hit(int damage) {
		System.out.println("��ũ�� "+damage+"��ŭ�� �������� �Ծ���ϴ�.");
	}
}

