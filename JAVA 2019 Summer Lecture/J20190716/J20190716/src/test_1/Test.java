package test_1;
// ���� �⺻����, ����, tel

public class Test {

	int current_temp=0;		// ����µ�
	int temp=0;				// ���� �µ�
	public void temp_up() {
		temp++;
	}
	public void temp_down() {
		temp--;
	}
	public int get() { 
		return 28;
	}
	public Test() {
		current_temp = get();
		temp = current_temp;
	}
	public Test(int t) {	// construction(����Ʈ����) overloading(��������)
		// ���� setting  ���� �µ� 28 / display
		current_temp = t;		//sensor(����) read(�ҷ�����)
		temp = current_temp;
		
	}
	
}
