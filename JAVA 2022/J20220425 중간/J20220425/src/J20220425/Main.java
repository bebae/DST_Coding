// �߰����

package J20220425;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Jul = "����������������������������������������������������������������������������������";

		String ch = ""; 	// while �� ����
		
//		Main m = new Main();
		sub s = new sub();
		pro p = new pro();
		hap h = new hap();
		
		while(true) {
			System.out.printf("\n %s \n", Jul);
			System.out.println("  1 : ä��");
			System.out.println("  2 : ����ó��");
			System.out.println("  3 : ���� �� ���ϱ�");
			System.out.println("  4 : �Ұ�");
			System.out.println("  5 : �� ��");
			System.out.printf(" %s \n", Jul);
			
			System.out.printf("  �Է� : ");
			ch = sc.next();			// ������������������������������������ ���� �ֱ�
			
			if(ch.equals("1")) {	// ������������������������������������ ���ڿ� ��
				s.t_kor_check();		// kor_check�� �л� ���� �Ѱ��ְ� ���� �迭���� �ٽ� �Ѱܹ���
			} else if(ch.equals("2")) {
				p.t_pro();
			} else if(ch.equals("3")) {
				h.t_hap();
			} else if(ch.equals("4")) {
			
			} else if(ch.equals("5")){
				System.out.println(" ���α׷��� �����մϴ�.");
				break;
			} else {
				continue;
			}
		} // while��
		sc.close();		// ��ĳ�� ����
	} // Main

	

}








