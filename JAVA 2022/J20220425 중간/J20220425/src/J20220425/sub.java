package J20220425;

import java.util.Scanner;

public class sub {
	
	public void t_kor_check() {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		System.out.print("�л� �� : ");
		n = sc.nextInt();
		
		int[] sub_dap1 = new int[10];	
		int[] sub_dap2 = new int[10];
		int[] sub_dap3 = new int[10];
		
		int[] stu_dap1 = new int[10];
		int[] stu_dap2 = new int[10];
		int[] stu_dap3 = new int[10];
	
		
		int[] stu_ox1 = new int[n]; 	// ����1 ���� ����
		int[] stu_ox2 = new int[n];
		int[] stu_ox3 = new int[n];
		
		int o = 0;	// ���� ����
		String Jul = "����������������������������������������������������������������������������������";
		
		// �迭 �ʱ�ȭ
		for (int i=0;i<10;i++){
			sub_dap1[i] = 0;
			sub_dap2[i] = 0;
			sub_dap3[i] = 0;
			stu_dap1[i] = 0;
			stu_dap2[i] = 0;
			stu_dap3[i] = 0;
		}
		
		// ����1 ������
		System.out.printf("\n %s \n", Jul);
		System.out.print(" ����1 ");
		for(int i=0;i<10;i++) {
			// ����1 ���� ���� ����
			sub_dap1[i] = (int)(Math.random()*4+1);
			System.out.printf("%2d ", sub_dap1[i]);
		}
		// ����2 ������
		System.out.print("\n ����2 ");
		for(int i=0;i<10;i++) {
			// ����2 ���� ���� ����
			sub_dap2[i] = (int)(Math.random()*4+1);
			System.out.printf("%2d ", sub_dap2[i]);
		}	
		// ����3 ������
	
		System.out.print("\n ����3 ");
		for(int i=0;i<10;i++) {
			// ����3 ���� ���� ����
			sub_dap3[i] = (int)(Math.random()*4+1);
			System.out.printf("%2d ", sub_dap3[i]);
		}
		
		
		
		System.out.printf("\n %s\n", Jul);
		// �л� N��
		for(int j=0;j<n;j++) {
			
			// �л� ���� �� ����
			for(int i=0;i<10;i++) {
				stu_dap1[i] = (int)(Math.random()*4+1);
				stu_dap2[i] = (int)(Math.random()*4+1);
				stu_dap3[i] = (int)(Math.random()*4+1);
			}
			
			// ����
			System.out.printf("\n %s\n", Jul);
			System.out.printf(" �л�%d \n", j+1);
			o = 0; 	// ���� ���� �ʱ�ȭ
			System.out.printf(" ����1 ");
			for(int i=0;i<10;i++) {
				if(sub_dap1[i] == stu_dap1[i]) {
					o++;
					System.out.print(" O ");
				} else {
					System.out.print(" X ");
				}
				stu_ox1[j] = o*10;
			}	
			System.out.printf(" %3d�� ", stu_ox1[j]);
			
			o = 0; 	// ���� ���� �ʱ�ȭ
			System.out.printf("\n ����2 ");
			for(int i=0;i<10;i++) {
				if(sub_dap2[i] == stu_dap2[i]) {
					o++;
					System.out.print(" O ");
				} else {
					System.out.print(" X ");
				}
				stu_ox2[j] = o*10;
			}	
			System.out.printf(" %3d�� ", stu_ox2[j]);
			
			o = 0; 	// ���� ���� �ʱ�ȭ
			System.out.printf("\n ����3 ");
			for(int i=0;i<10;i++) {
				if(sub_dap3[i] == stu_dap3[i]) {
					o++;
					System.out.print(" O ");
				} else {
					System.out.print(" X ");
				}
				stu_ox3[j] = o*10;
			}	
			System.out.printf(" %3d�� ", stu_ox3[j]);

		} // �л� N�� for
		System.out.printf("\n %s\n", Jul);
		System.out.println(" ����  ����1  ����2  ����3");
		System.out.printf(" %s\n", Jul);
		for(int i=0;i<n;i++) {
			System.out.printf(" �л�%d %3d   %3d   %3d\n", i+1, stu_ox1[i], stu_ox2[i], stu_ox3[i]);
		}	
		System.out.printf(" %s\n", Jul);
	}	// kor_check
}















