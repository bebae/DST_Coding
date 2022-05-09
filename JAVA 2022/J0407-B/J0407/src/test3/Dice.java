// 0407 #3_3
// �ֻ��� ����
// �߰���翡 ���� ����
package test3;
// �� ���� 3���� 3���� �ֻ��� �� ��
public class Dice {
	private int[] p;
	
	// ������
	public Dice(){	
		p = new int[3];
	}
	
	// �ֻ����� 3�� ������ ���� �迭�� ����
	public void di_gen() {
		
		int dice1 = 0; 
		int dice2 = 0;
		int dice3 = 0;
		int dice = 0;		// 3���� �ֻ��� �� ���� ����
		
		// �ֻ����� 3�� ������ ���� �迭�� ����
		for(int i=0;i<p.length;i++) { 
			dice1 = (int)(Math.random()*6+1);
			dice2 = (int)(Math.random()*6+1);
			dice3 = (int)(Math.random()*6+1);	
			dice = dice1+dice2+dice3;
			p[i] = dice;
		}
	}
	
	/*
	 * ���� ���� ����� �������� ���
	 * ���� ��� ������ ó�� try catch
	 * 
	 */
	
	
	// ���� ���� ������ ��
	public void di_win_check() {
		int max = 0;		// 3�� �� ���� ���� ��
		int pos = 0;		// ���� ���� ���� ���� ����� ã�� �迭
		
		// ���� ���� ������ ��
		for(int i=0;i<p.length;i++) {
			if(max<p[i]) {
				max = p[i];
				pos = i;
			}
		}
		// 3���� �ֻ��� �� ���
		for(int i=0;i<p.length;i++) {
			System.out.printf(" %d���� ��: %5d\n", i+1, p[i]);
		}
		System.out.printf(" Winner %d�� ��: %2d\n",pos+1,max);
	}
	
	
}
