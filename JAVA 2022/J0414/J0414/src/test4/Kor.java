package test4;

public class Kor {
	
	// 1�ܰ�. ���� ����
	// 2�ܰ�. ä��
	// 3�ܰ�. ä�� ���
	
	public int[] t_kor_check(int n) {
		int[] kor_dapji = new int[10];	// ���� ������
		int[] stu_dapji = new int[10];	// �л� �����
		int[] stu_kor = new int[n]; 		// kor �л� ����
		
		int o = 0;	// ���� ����
		String Jul = "��������������������������������������������������������������������������";
		
		// �迭 �ʱ�ȭ
		for (int i=0;i<10;i++){
			kor_dapji[i] = 0;
			stu_dapji[i] = 0;
		}
		
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
		System.out.printf(" %s\n", Jul);
		return stu_kor;
	}	// kor_check
}
