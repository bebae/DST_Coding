//0512 #2
//���� ��, �װ���, ���۸�
//�������� ������� ��Ƽ�(�޼ҵ�) bank interface
package test2;
interface Flying
{
	public void fly();
	public void land();
	public void take_off();
}

class Bird implements Flying {
	public void fly() {
		System.out.println("���� ����");
	}
	public void land() {
		System.out.println("���� ������ �����ߴ�");	
	}
	public void take_off() {
		System.out.println("���� �������� ���ư���");
		
	}
}

class Airplane implements Flying {
	public void fly() {
		System.out.println("����Ⱑ ����");
	}
	public void land() {
		System.out.println("����Ⱑ ���׿� �����ߴ�");	
	}
	public void take_off() {
		System.out.println("����Ⱑ ���׿��� �̷��ߴ�");
	}
}

class Superman implements Flying {
	public void fly() {
		System.out.println("���۸��� ����");
	}
	public void land() {
		System.out.println("���۸��� ���� �����ߴ�");	
	}
	public void take_off() {
		System.out.println("���۸��� ����");
	}
	public void attack() {
		System.out.println("���۸��� �����Ѵ�");	
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
		System.out.println("��������������������������������������������");
		
		asiana.take_off();
		asiana.fly();
		asiana.land();
		System.out.println("��������������������������������������������");
		
		superman.take_off();
		superman.fly();
		((Superman) superman).attack();
		superman.fly();
		superman.land();
	}
}
