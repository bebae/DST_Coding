
package J20220602;
public class Dice extends Thread {
	private int[] p;
	private int i;
	private int pos;			// ���� ���� ���� ���� ���
	
	// ������
	public Dice(){	
		p = new int[5];		// ������
		i = 0;
		pos = 0;
	}
	
	// �ֻ����� 3�� ������ ���� �迭�� ����
	public void run() {
		
		int dice1 = 0; 
		int dice2 = 0;
		int dice3 = 0;
		int dice4 = 0;
		int dice5 = 0;
		int dice_sum = 0;		// 5���� �ֻ��� �� ���� ����
		int max = 0;			// 3�� �� ���� ���� ��
		
		

		while(true) {
			for(i=0;i<p.length;i++) { 
				dice1 = (int)(Math.random()*6+1);
				dice2 = (int)(Math.random()*6+1);
				dice3 = (int)(Math.random()*6+1);
				dice4 = (int)(Math.random()*6+1);
				dice5 = (int)(Math.random()*6+1);
				dice_sum = dice1+dice2+dice3+dice4+dice5;
				p[i] = dice_sum;
				// System.out.printf(" %d���� ���: %d %d %d %d %d\n", i+1, dice1,dice2,dice3,dice4,dice5);
				// �ʹ� ���� �����
			}
			if (p[0] == 30 || p[1] == 30 || p[2] == 30 || p[3] == 30 || p[4] == 30) {
				break;							// ������ ���� ����
			}
			
		}
		
		// ���� ���� ������ ��
			for(i=0;i<p.length;i++) {
				if(max<p[i]) {
					max = p[i];
					pos = i;
				}
			}
			// 5���� �ֻ��� �� ���
			System.out.println("����������������������������������������������������������������������������������������");
			for(i=0;i<p.length;i++) {
				System.out.printf(" %d���� ��: %5d\n", i+1, p[i]);
			}
			System.out.printf("  Dice �ְ��� ����ڴ� %d�� ���Դϴ�!\n",pos+1);
			System.out.println("����������������������������������������������������������������������������������������");
	}
	
	public int get_winner() {
		return pos+1;
	}
	
	
}














