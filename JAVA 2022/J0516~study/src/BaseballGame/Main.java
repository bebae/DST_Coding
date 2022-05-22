/* 20220516 �������̴�.
 * �߱����� �����Դϴ�.
*/
package BaseballGame;
import java.util.Scanner;

class tool {
	// ���ڿ��� �ް� ���ڸ� �ִ��� false/true ���� �����ݴϴ�.
	public boolean str_check(String str) {
        boolean isNumeric =  str.matches("[+-]?\\d*(\\.\\d+)?");
        return isNumeric;
	}
		
}

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	private static int[] key_num = new int[5];				// ���� ���ڰ� ����� �迭
	private static boolean overlep_check = false;			// �Է°��� �ߺ� üũ ����
	
	// �ʵ�  �ʱ�ȭ
	public Main() {
		for(int i=0;i<5;i++)
			key_num[i] = -1;
	}
	
	// ���� �迭�� ���� ���ڸ� �ߺ����� �������� �����մϴ�.
	public void random_num_make(int N) {
		int size = N;
		for(int i=0;i<size;i++) {
			while(true) {
				overlep_check = false;
				key_num[i] = (int)(Math.random()*10);			// 0~9���� �������� �迭�� �����մϴ�.
				for(int j=0;j<size;j++) {						// �̹� ����� ���䰪�� ���մϴ�.
					if(i != j && key_num[i] == key_num[j]) {	// �ڱ��ڽ��� �����ϰ� ���� ���ٸ� �ٽ� �����մϴ�.	
						overlep_check = true;
						break;
					}
				}
				if (overlep_check == false)					// �ߺ��� ���ٸ� while���� �������� �����ڸ����� ���մϴ�.
					break;
			}	// while 
		}
	} 	// random_num_make
	
	// N�ڸ��� ������ �߱������Դϴ�.
	public void playgame(int N,int R) {
		int size = N;						// ������ ũ��
		int round = R;						// ���� ���� 
		int answer = 0;						// �Է��ϴ� ���ڸ� ������ �迭�� �ִ� ����
		String s_answer = "";				// �Է��ϴ� ���ڸ� ���ڷ� �޴� ���ڿ�
		int count_strike = 0;				// ��Ʈ����ũ ���庯��
		int count_ball = 0;					// �� ���庯��
		int i = 0;							// for���� ������ ������ ������ ���ߴٸ�?
		
		tool to = new tool();				// �ߺ� üũ �Լ��� �ִ� Ŭ���� ����
		
// ���������������������������������������������������������������� ���� ���� ��ŭ�� �ݺ��մϴ�. ����������������������������������������������������������������
		for(i=1;i<=round;i++) {
			count_strike = 0;
			count_ball = 0;
			while (true) {
				// ���������������������������������������������������������������� �Է� �κ� ����������������������������������������������������������������
				System.out.print(i+"ȸ���Դϴ�. max("+round+") "+size+"�ڸ��� ���ڸ� �Է����ּ��� : ");
				s_answer = sc.next();
				//	int(answer)�� �Է¹��� �� 0���� �����ϴ� ��� �ý����� �ν��� �� 0�� �ν����� ���ϴ� ������ ���� ���ڿ��� �ް� int�� ��ȯ�� �� ���� ó�� ��Ű��� ��
		
				// �������������� �Է°� ��ȿ �˻� �� ��ɾ��� ��ɾ� ���� ��������������
				if (s_answer.equals("exit")) {		// exit�� �Է��ϸ� �޴��� �������ɴϴ�.
					i = round;
					break;
				} else if(s_answer.length() != size) {			// �Է°��� ���� �ڸ����� ���� ������ �ٽ� �Է� �޽��ϴ�.
					System.out.println("�Է� �ڸ����� ���� �ʽ��ϴ�.");
					continue;
				} else if(to.str_check(s_answer) == false) {	// �Է°��� ���ڷθ� �̷������ �ʾҴٸ� �ٽ� �Է� �޽��ϴ�.
					System.out.println("���ڷθ� �Է����ּ���.");
					continue;
				}
				answer =  Integer.parseInt(s_answer);
				
				/* ó���� �õ��ߴ� ���
				 *  �Է¹��� ������ ���̸�ŭ �迭�� ����� 1�ڸ��� ������ �ӽ� �迭�� �����Ͽ� ���� �迭�� ���մϴ�.
				 * int[] temp = new int[((int)Math.log10(answer)+1)];
				 * temp �迭�� �����ϰ� �� ũ�⸦ ���� answer�� ũ�⸸ŭ �����մϴ�.
				 * System.out.println(""+((int)Math.log10(answer)+1));
				*/
				
				// ���������������������������������������������������������������� ó�� �κ� ����������������������������������������������������������������
				int[] temp = new int[size];			// ���� ũ�⸸ŭ�� �迭 ����
				
				for(int j=temp.length-1;j>=0;j--) {	// j�� temp �迭�� ũ�⿡�� 0���� Ŭ �������� �ݺ��Ѵ�. 
					temp[j] = answer % 10;			// temp �迭�� �ڿ������� �Է¹��� ���ڸ� 10���� ���� �������� �ִ´�.
					answer /= 10;					// 10���� ������ 10�� �ڸ����� 1�� �ڸ��� �ǵ��� ��
				}
				
				// �� ���� 0�� �� ����ó��
				if (s_answer.indexOf("0") == 0) {	// indexOf = s_answer�� 0�̶�� ���ڿ��� ��ġ�� ��ȯ�ϰ� == 0�� ù��°�� 0�̶�� �̶�� ��
					temp[0] = 0;
				}
				
				overlep_check = false;				// �ߺ�üũ �ʱ�ȭ
				outerLoop :							// �������� �������� ����	/ C����� goto����� ���� ��������� �ʴ´�.
				// �Է°��� �ߺ��� ���ڰ� �ִ��� �˻��ϰ� �ߺ��� �ִٸ� �ٽ� �Է� �޽��ϴ�.
				for(int j=0;j<temp.length;j++) {
					for(int k=0;k<temp.length;k++) {
						if(j != k) {				// �ڱ��ڽ��� �����մϴ�.
							if(temp[k]==temp[j]) {
								System.out.println("�Է°��� �ߺ��� �ֽ��ϴ�. �ٽ��Է����ּ���.");
								overlep_check = true;
								break outerLoop;	// outerLoop ���� ���������ϴ�.
							}
						}
					}
				}
				
				//�Է°��� ���䰪�� ��
				if (overlep_check == false) {				// �ߺ��� �ƴ϶�� ����
					for (int j=0;j<temp.length;j++) {		// �ڸ�����ŭ �ݺ�
						if (temp[j] == key_num[j]) {
							count_strike++;
						} else {
							for (int k=0;k<temp.length;k++) {
								// �ڱ��ڽ��� �ƴϸ鼭 �ٸ� �ڸ����� ���� ���ڰ� �ִ��� üũ
								if (j != k && temp[k] == key_num[j]) {
									count_ball++;
								}
							}
						}
					}
									
					// ���������������������������������������������������������������� ��� �κ� ����������������������������������������������������������������
					System.out.print(" �� ");
					for (int j=0;j<temp.length;j++) {
						System.out.print(temp[j]+"");
					}
					System.out.print("= ");
					if (count_strike != 0) {
						System.out.print(count_strike+"S");
					} 
					if (count_ball != 0) {
						System.out.print(count_ball+"B");
					}
					if (count_ball == 0 && count_strike == 0) {
						System.out.print("OUT!");
					}
					System.out.println(" ��");
					break;					// while���� �������� ���尡 �����մϴ�.
				}
						
			} 	// �Է°��� ���� �ùٸ����� while
			if (count_strike == size) {
				System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
				System.out.println("  �����Դϴ�!!!");
				System.out.println("  "+i+"ȸ������ Ȩ���� �ƽ��ϴ�!");
				System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
				break;
			}
		}	// ���� for��
		if (i > round) {
			System.out.println(" ���尡 ���� ������ ������ ���ϼ̽��ϴ�.");
			System.out.println(" ���� ���ӿ� �����ּ���!");
			System.out.print(" ������ �� ");
			// ���� Ȯ��
			for (int j=0;j<size;j++) 
				System.out.print(key_num[j]+" ");
			System.out.println("�� �����ϴ�!");
		}
		
			
		
	}

	public static void main(String[] args) {
			
		int chice = 0;			// ���� ����
		int N = 0;				// ������ �ڸ���
		int round = 0;			// ���ߴ� ���� ȸ��/���� �� �� �ִ� ��ȸ
		
		Main ma = new Main();	// �ڱ��ڽ� ����
		
		while(true) {
			System.out.println(" ����������������������������������");
			System.out.println("     �� �� �� �� ");
			System.out.println(" ����������������������������������");
			System.out.println("     1.   3�ڸ� ");
			System.out.println("     2.   4�ڸ� ");
			System.out.println("     3.   5�ڸ� ");
			System.out.println("     0.   ���ᡡ ");
			System.out.println(" ����������������������������������");
			System.out.print("�����ϼ��� : ");
			chice = sc.nextInt();
			if (chice >= 1 && chice <=9) {
				if (chice == 0) {
					System.out.println("�ý����� �����մϴ�.");
					break;
				}
				if (chice == 1) {
					N = 3;
					round = 9;
				} else if (chice == 2) {
					N = 4;
					round = 16;
				} else if (chice == 3) {
					N = 5;
					round = 30;
				}
				ma.random_num_make(N);
				ma.playgame(N,round);
				
			} else {
				System.out.println("�Է°��� ��Ȯ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");	// �Է°��� ���� �ʴٸ� �ٽ� �Է��� �޽��ϴ�.
			} // �Է°� if
		}	// while		
	}	// main

}
