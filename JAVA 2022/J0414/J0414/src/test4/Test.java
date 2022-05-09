
//0414 #4  ����� ä��
// 10���� 4������
// ���� ���� 
// �л� N���� ���� kor, eng, mat, avg, max
// 3���� ���� 
// Class

package test4;
import java.util.Scanner;

public class Test {
	Scanner sc = new Scanner(System.in);
	
	// �ʵ�
	private static int[] stu_kor; 
	private static int[] stu_eng;
	private static int[] stu_mat;		
	static int n = 0;			// �л� ��
	private static String Jul = "��������������������������������������������������������������������������";
	
	// ��ü ���� �ʱ�ȭ
	public Test() {		// ��� ���� �ʱ�ȭ
		stu_kor = null; 
		stu_eng = null;
		stu_mat = null;	
	
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
	} // Test
	
	
	public void t_find_Max(int[] stu_kor) {
		int max = 0;
		int min = 100;
		int hap = 0;
		int ave = 0;
		
		// �л� ���� 0���̶�� ���� X
		if(n == 0) {
			System.out.println(" �л� �� �� 0�� �Դϴ�. �л� ���� �Է����ּ���");
			
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
	}
	// �޼ҵ� = ���� ����ϴ� ��
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ch = ""; 	// while �� ����
		
		Test t = new Test();
		Kor k = new Kor();
		
		while(true) {
			System.out.printf("\n %s \n", Jul);
			System.out.println("  1 : ���� ä��");
			System.out.println("  2 : ���� ä��");
			System.out.println("  3 : ���� ä��");
			System.out.println("  4 : Max / Min / Ave");
			System.out.println("  5 : �� ��");
			System.out.printf(" %s \n", Jul);
			
			System.out.printf("  �Է� : ");
			ch = sc.next();			// ������������������������������������ ���� �ֱ�
			
			if(ch.equals("1")) {	// ������������������������������������ ���ڿ� ��
				stu_kor = k.t_kor_check(n);		// kor_check�� �л� ���� �Ѱ��ְ� ���� �迭���� �ٽ� �Ѱܹ���
			} else if(ch.equals("2")) {
				
			} else if(ch.equals("3")) {
				
			} else if(ch.equals("4")) {
				t.t_find_Max(stu_kor);
				break;
			} else if(ch.equals("5")){
				System.out.println(" ���α׷��� �����մϴ�.");				
			} else {
				continue;
			}
		} // while��
		sc.close();		// ��ĳ�� ����
	} // Main

	

}








