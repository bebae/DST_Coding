
//0414 #1  ����� ä��
// 10���� 4������
// ���� ���� �Է�
package test1;

public class Test {
	public static void main(String[] args) {
		
		String Jul = "������������������������������������������������������������������������";
		
		// ���� ������
		int[] kor_dapji = new int[] {1,2,3,4,1,2,3,4,1,2};
		
		System.out.print(" �������� ");
		for(int i=0;i<10;i++) {
			System.out.printf("%2d ", kor_dapji[i]);
		}
		
		// �л� N��
		for(int j=0;j<3;j++) {
			// �л� �����
			int[] stu_dapji = new int[10];
			
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
			int o = 0; 	// ���� ����
			for(int i=0;i<10;i++) {
				if(kor_dapji[i] == stu_dapji[i]) {
					o++;
					System.out.print(" O ");
				} else {
					System.out.print(" X ");
				}
			}
			System.out.printf("\n %s\n", Jul);
			System.out.printf(" %d�� Jumsu = %d", j+1, o*10);
		} // �л� N�� for
	} // Main
		
}
