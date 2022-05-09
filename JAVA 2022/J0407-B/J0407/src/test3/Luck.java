// 0407 #3_2
// ���� ��÷
// �߰���翡 ���� ����
package test3;
import java.util.Scanner;

public class Luck {

	private int[] luck_no;	// ��÷ ��ȣ �迭
	private int count;	// ��ǰ ���� 
	
	// ������
	public Luck() {
		Scanner sc = new Scanner(System.in);
		count = 0;
		
		// ��ǰ�� ���� �Է�
		System.out.print("��ǰ���� �Է� : ");
		count = sc.nextInt();			// ��ǰ ���� ����
		luck_no = new int[count];		// ������ŭ �迭
		
	}
		// ��÷ ��ȣ ���� �޼ҵ�
		public int luck_gen() {
		int max = 0;		// ��÷ ���� �� ���� ū ��
		
		/*
		 * 	��ǰ ������ŭ ��÷ ���ڸ� �������� �ִµ�
		 *	���� ��÷ ���ڰ� ���� ���� ��� �ϴ°�?
		 *	������ �亯 : 2�б� �� try catch�� �̿��Ͽ� ���� ���� �ִ� �� 
		 *	�� �� �� ���ϰ� �ִٸ� �ٽ� �����Ѵ�
		 */
		
		
		// ��ǰ ������ŭ ��÷���� ����
		for(int i=0;i<luck_no.length;i++) {
			luck_no[i] = (int)(Math.random()*100+1);
			if(max < luck_no[i]) max = luck_no[i];	//��÷ ���� �� ���� ū ���� ����
			System.out.printf("%d, ", luck_no[i]);
		}
		System.out.println("");					//�������� �ٹٲ�
		return max;
	}
		// ��÷�� üũ �޼ҵ�
		public void luck_guest_check(int max) {
			int guest_num = 0;	// �� ��
			int lotto = 0;		// ���� ��ȣ
			boolean ok = false;	// ��÷ ����
			
			// ��÷
			while(count > 0) {
				guest_num++;						// �� ����
				lotto = 0;							// ��ȣ �ʱ�ȭ
				lotto = (int)(Math.random()*100+1);	// ��ȣ �̱�
				
				// ���� ��ȣ ��÷Ȯ��
				ok = false;							//���� ��÷ ���θ� �ʱ�ȭ
				for(int i=0;i<luck_no.length;i++) {
					if(lotto == luck_no[i]) {		//��÷
						count--;					//��ǰ ���� ����
//						System.out.println(" ������������ ��÷�ƽ��ϴ�! ������������ ");
						ok = true;					//�� ���� ��÷���� ����
						luck_no[i]=0;				//�̹� ��÷�� ��ȣ�� ������
						break;
					}
				}
				if(ok == false){					// ��÷ ���ο� ���� ���� ���
					System.out.printf(" %3d�� �մ��� ���� ��ȸ��\n", guest_num);
				}else if (ok == true) {
					System.out.printf(" %3d�� �մԲ��� ��÷�Ǽ̽��ϴ�.\n", guest_num);
					if(lotto == max) {
						System.out.printf(" ������������ %d�� �ҷ��� ��÷! ������������ \n", lotto);
					} else {
						System.out.println("     ������ ��÷!   ");
					}
				}else {
					System.out.println("ERROR");
				}
			}	//while	
			System.out.println("����������������������������������������������������");
			System.out.printf(" %d���� �մ��� �湮�ϼ̽��ϴ�. \n", guest_num);
			System.out.println("����������������������������������������������������");
		}
	
	

	
}
