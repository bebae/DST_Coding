// 0407 #3_1
// ���� ��÷
// �߰���翡 ���� ����
package test3;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;		// ���� ���� ����
		String jul = "����������������������������������������������������";
		
		// �������������������������������������������������� Main
		while(true) {
			System.out.println(jul);
			System.out.println("   1. ���� ��÷");
			System.out.println("   2. �ֻ��� ����");
			System.out.println("   3. ����");
			System.out.println(jul);
			System.out.print("   ��ȣ �Է� :");
			choice = sc.nextInt();
	
			if(choice == 1) {
				//���������������������������������������������������� ����
				Luck lc = new Luck();
				int max = 0;	// ��÷ ��ȣ �� ���� ū���� ��÷���� �޼ҵ忡�� ��÷�� Ȯ�� �޼ҵ�� �Ѱ��ִ� ����
				lc.luck_gen();			// ��÷ ��ȣ ���� �޼ҵ�
				lc.luck_guest_check(max);	// ��÷�� Ȯ�� �޼ҵ�
			} else if(choice == 2) {
				//���������������������������������������������������� �ֻ��� 
				Dice di = new Dice();
				di.di_gen();
				di.di_win_check();
			} else {
				System.out.println("�ý����� �����մϴ�.\n");
				break;
			}
		} //while
	}	//main
}
