// 0428 #1
// ���� Ŭ����

package test1;

class Human{
	String name;	// �����̸�
	int age;		// ����
	
	public void print_Info() {
		System.out.println("���� : "+name+"\n���� : "+age);
	}
	
}
class Employee extends Human {		// ������ Ŭ������ �޸��� ��� ����
	public Employee() {
		name = "����";
		age = 40;
	}
	
	// ��� ���� ���� ���� = �޼ҵ� �������� = �޼ҵ� �������̵�
	public void print_Info() {
		System.out.println("����� : "+name+"\n���� : "+age);
	}
}

class Alba extends Human {
	public Alba() {
		name = "�˹�";
		age = 20;
	}
	// �������̵�
	public void print_Info() {
		System.out.println("�˹� : "+name+"\n���� : "+age);
	}
	
}

public class test {
	
	public static void main(String[] args) {
		
		Employee em = new Employee();
		Alba al = new Alba();
		
		em.print_Info();
		al.print_Info();
		
		
		
		
	} // main
}
