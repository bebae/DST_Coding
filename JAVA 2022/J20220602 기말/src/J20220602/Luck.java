
package J20220602;
import java.util.Scanner;

public class Luck extends Thread {

	private int[] luck_no;	// ��÷ ��ȣ �迭
	private int count;	// ��ǰ ���� 
	private int guest_num;	// �� ��
	
	// ������
	public Luck() {
		Scanner sc = new Scanner(System.in);
		count = 0;
		guest_num = 0;
		
		// ��ǰ�� ���� �Է�
		System.out.print("��ǰ���� �Է� : ");
		count = sc.nextInt();			// ��ǰ ���� ����
		luck_no = new int[count];		// ������ŭ �迭
		
	}
		// ��÷ ��ȣ ���� �޼ҵ�
	public void run() {
		int max = 0;		// ��÷ ���� �� ���� ū ��
		int lotto = 0;		// ���� ��ȣ
		boolean ok = false;	// ��÷ ����
		guest_num = 0;		// �� ��
		
		// ��ǰ ������ŭ ��÷���� ����
		System.out.print("��÷ ��ȣ : ");
		for(int i=0;i<luck_no.length;i++) {
			luck_no[i] = (int)(Math.random()*100+1);
			if(max < luck_no[i]) max = luck_no[i];	//��÷ ���� �� ���� ū ���� ����
			System.out.printf("%d, ", luck_no[i]);
		}
		System.out.println("");	
		

	// ��÷�� üũ
		// ��÷
		while(true) {
			guest_num++;						// �� ����
			lotto = 0;							// ��ȣ �ʱ�ȭ
			lotto = (int)(Math.random()*100+1);	// ��ȣ �̱�
			
			// ���� ��ȣ ��÷Ȯ��
			ok = false;							//���� ��÷ ���θ� �ʱ�ȭ
			for(int i=0;i<luck_no.length;i++) {
				if(lotto == luck_no[i]) {		//��÷
					count--;					//��ǰ ���� ����
					ok = true;					//�� ���� ��÷���� ����
					luck_no[i]=0;				//�̹� ��÷�� ��ȣ�� ������
					break;
				}
			}
			if(ok == false){					
				System.out.printf(" %3d�� �մ��� ���� ��ȸ��\n", guest_num);
			}else if (ok == true) {
				if(lotto == max) {
					System.out.println("����������������������������������������������������������������������������������������");
					System.out.printf(" %3d�� �մԲ��� �ڵ��� ��÷! ��÷��ȣ:%d \n", guest_num, lotto);
					System.out.println("����������������������������������������������������������������������������������������");
					break;
				} else {
					System.out.printf(" %3d�� �մԲ��� ��ǰ�ǿ� ��÷�Ǽ̽��ϴ�.\n", guest_num);
				}
			}
		}	//while	
	}

	public int getwinner() {
		return this.guest_num;	
	}
	

	
}
