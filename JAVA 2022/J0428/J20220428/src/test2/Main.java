//0428 #2
// ���� Ŭ����

package test2;

interface Print_Info{
	// �������� ����ϴ� ����� �������̽�(Print_info)�� ��� �����Ѵ�.
	public void print_info();
	// public void func1();
	// ������� ġ�� ���ܴ�/�Դ´�/���Ѵ� ���� ����� ���� ��� �����Ѵ�.
	
}

// interface�� ����ϱ� ���� implements ���ø���Ʈ�� ����ϰ� �ݵ�� �ȿ� �������̵� �ʿ�
public class Main implements Print_Info {
	
	private String name;
	private int age;
	
	public void print_info() {
		System.out.println("���� : "+name+"\n���� : "+age);
		
	}
	
	public static void main(String[] args) {
		
		Main ma = new Main();
		ma.print_info();
		
		
	}	// main

	
	
}
