
//0414 #2  ����� ä��
// 10���� 4������
// ���� ���� �Է�
// �л� N���� ���� kor ����

package test2;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Jul = "��������������������������������������������������������������������������";
		int o = 0;
		int[] kor_dapji = new int[10];	// ���� ������
		int[] stu_dapji = new int[10];	// �л� �����
		
		
		// �迭 �ʱ�ȭ
		for (int i=0;i<10;i++){
			kor_dapji[i] = 0;
			stu_dapji[i] = 0;
		}
		
		System.out.print("�л� �� : ");
		int n = sc.nextInt();
		
		int[] stu_kor = new int[n]; 	// �л� ����
		// �л� ���� �迭 �ʱ�ȭ
		for(int i=0;i<n;i++) {
			stu_kor[i] = 0;
		}
		
		
		// ���� ������
		System.out.print(" �������� ");
		for(int i=0;i<10;i++) {
			// ���� ���� ���� ����
			kor_dapji[i] = (int)(Math.random()*4+1);
			System.out.printf("%2d ", kor_dapji[i]);
		}
		
		
		// �л� N��
		for(int j=0;j<n;j++) {
			
			// ����
			System.out.printf("\n %s\n", Jul);
			System.out.printf(" %d���л� ", j+1);
			for(int i=0;i<10;i++) {
				stu_dapji[i] = (int)(Math.random()*4+1);
				System.out.printf("%2d ", stu_dapji[i]);
			}
			
			// ä÷
			System.out.printf("\n %s\n", Jul);
			System.out.print(" ���ä�� ");
			o = 0; 	// ���� ����
			for(int i=0;i<10;i++) {
				if(kor_dapji[i] == stu_dapji[i]) {
					o++;
					System.out.print(" O ");
				} else {
					System.out.print(" X ");
				}
				stu_kor[j] = o*10;
			}
			
		} // �л� N�� for
		System.out.printf("\n %s\n", Jul);
		for(int i=0;i<n;i++) {
			System.out.printf(" %2d�� Jumsu = %d\n", i+1, stu_kor[i]);
		}
	} // Main
		
}
