package exam_2;
import java.util.Scanner;
public class Test1 {

	public Test1(){
		String[] name = new String[10];
		String[] tel = new String[13];
		String[] adr = new String[10];
		int sel2=0,n=0;
		
		Scanner s = new Scanner(System.in);
		
		// �⺻ ����
		name[0] = "��μ�";
		tel[0] = "010-1111-1111";
		adr[0] = "����";
		name[1] = "�ڹ���";
		tel[1] = "010-1004-1004";
		adr[1] = "����";
		
		// ��� ���
		System.out.println("��� ����");
		System.out.println("1. ���");
		System.out.println("2. �߰�");
		System.out.println("3. ����");
		System.out.print("��ȣ ���� : ");
		int sel =  s.nextInt();

		// ��� �ִ밪
		for(int i=0;i<10;i++){
			if(name[i]!=null||tel[i]!=null||adr[i]!=null)
				n++;
		}

		
		// ��� ���ý�
		switch(sel) {
			case 1 : 
				for (int i=0;i<n;i++){
					System.out.printf("No.%d �̸� : %4s\n��ȭ��ȣ : %s\n�ּ� : %4s\n",i+1,name[i],tel[i],adr[i]);
				}
				break;
			case 2 : 
				do {
					int i = n+1;
					System.out.println("�̸� :");
					name[i] = s.next();
					System.out.println("��ȭ��ȣ : ");
					tel[i] = s.next();
					System.out.println("�ּ� : ");
					adr[i] = s.next();
					
					System.out.println("�Է� ���? Yes:1 No:2");
					sel2 = s.nextInt();
					
					i++;
				}while(sel2==1);
				break;
			case 3 :
				for (int i=0;i<n;i++){
					System.out.printf("No.%d �̸� : %4s\n��ȭ��ȣ : %s\n�ּ� : %4s\n",i+1,name[i],tel[i],adr[i]);
				}
				System.out.print("������ ��ȣ : ");
				sel2 = s.nextInt();
				
				for (int i=0;i<n;i++){
					if(sel2 == i){
						name[i]=null;
						tel[i]=null;
						adr[i]=null;
					}
				}
				break;

				default : System.out.println("REEOE");
		}
	}

	public static void main(String[] args) {
		
		new Test1();


			
	}

}

