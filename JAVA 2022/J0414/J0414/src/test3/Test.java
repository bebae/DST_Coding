
//0414 #3  ����� ä��
// 10���� 4������
// ���� ���� 
// �л� N���� ���� kor, eng, mat, avg, max
// 3���� ���� 

package test3;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Jul = "��������������������������������������������������������������������������";
		int o = 0;	// ���� ����
		int n = 0;	// �л� ��
		String ch = ""; 	// while �� ����
		int[] kor_dapji = new int[10];	// ���� ������
		int[] eng_dapji = new int[10];	// ���� ������
		int[] mat_dapji = new int[10];	// ���� ������
		int[] stu_dapji = new int[10];	// �л� �����
		
		int[] stu_kor = null; 
		int[] stu_eng = null;
		int[] stu_mat = null;		
		
		// �迭 �ʱ�ȭ
		for (int i=0;i<10;i++){
			kor_dapji[i] = 0;
			eng_dapji[i] = 0;
			mat_dapji[i] = 0;
			stu_dapji[i] = 0;
		}
		
		while(true) {
			System.out.printf("\n %s \n", Jul);
			System.out.println("  0 : �л� �� �Է�");
			System.out.println("  1 : ���� ä��");
			System.out.println("  2 : ���� ä��");
			System.out.println("  3 : ���� ä��");
			System.out.println("  4 : �� ��");
			System.out.println("  5 : Max / Min");
			System.out.printf(" %s \n", Jul);
			
			System.out.printf("  �Է� : ");
			ch = sc.next();			// ������������������������������������ ���� �ֱ�
			
			if(ch.equals("0")){
				System.out.print("�л� �� : ");
				n = sc.nextInt();
				
				stu_kor = new int[n]; 		// kor �л� ����
				stu_eng = new int[n];		// eng �л� ����
				stu_mat = new int[n];		// mat �л� ����
				
				// �л� ���� �迭 �ʱ�ȭ
				for(int i=0;i<n;i++) {
					stu_kor[i] = 0;
					stu_eng[i] = 0;
					stu_mat[i] = 0;
				}
			
			} else if(ch.equals("1")) {	// ������������������������������������ ���ڿ� ��
				
				// ���� ������
				System.out.printf("\n %s \n", Jul);
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
					System.out.printf(" %2d�� ���� Jumsu = %d\n", i+1, stu_kor[i]);
				}
			} else if(ch.equals("2")) {
				
			} else if(ch.equals("3")) {
				
			} else if(ch.equals("4")) {
				System.out.println(" ���α׷��� �����մϴ�.");
				break;
			} else if(ch.equals("5")){
				int max = 0;
				int min = 100;
				int hap = 0;
				int ave = 0;
				
				// �л� ���� 0���̶�� ���� X
				if(n == 0) {
					System.out.println(" �л� �� �� 0�� �Դϴ�. �л� ���� �Է����ּ���");
					continue;
				}
				
				// kor  max min
				for(int i=0;i<n;i++) {
					hap += stu_kor[i];
					if(max < stu_kor[i])
						max = stu_kor[i];
					if(min > stu_kor[i])
						min = stu_kor[i];
				}
				ave = hap/n;
				System.out.printf("\n %s \n", Jul);
				System.out.printf("  Max :%3d ", max);
				System.out.printf(" Min :%3d ", min);
				System.out.printf(" Ave :%3d ", ave);
				System.out.printf("\n %s \n", Jul);
			
			} else {
				continue;
			}
		} // while��
		sc.close();		// ��ĳ�� ����
	} // Main

	

}








