package exam_3;
import java.util.Scanner;
public class Test1 {

	String[] name = new String[10];
	String[] tel = new String[13];
	String[] adr = new String[10];

	private int n=0;
	private int sel=0;
	private int sel2=0;

	Scanner s = new Scanner(System.in);
	
	public Test1(){
		// �⺻ ����
		name[0] = "��μ�";
		tel[0] = "010-1111-1111";
		adr[0] = "����";
		name[1] = "�ڹ���";
		tel[1] = "010-1004-1004";
		adr[1] = "����";
		
		put();
		
	}
	public void put(){
	
		n=0;
		// ��� �ִ밪
		for(int i=0;i<10;i++){
			if(name[i]!=null&&tel[i]!=null&&adr[i]!=null)
				n++;
		}
		System.out.println("N "+n);
				
	}
	public void list(){
		
		// ��� ���
		System.out.println("��� ����");
		System.out.println("1. ���");
		System.out.println("2. �߰�");
		System.out.println("3. ����");
		System.out.print("��ȣ ���� : ");
		sel =  s.nextInt();

		list_sw(sel);

	}
	public void list_sw(int a){
		// ��� ���ý�
		switch(sel) {
			case 1 : 
				for (int i=0;i<n;i++){
					if(name[i]!=null&&tel[i]!=null&&adr[i]!=null)
					System.out.printf("No.%d  �̸� :%3s   ��ȭ��ȣ :%s  �ּ� :%4s\n",i+1,name[i],tel[i],adr[i]);
				}
				break;
			case 2 : 
				sw2_list();
				break;
			case 3 :
				sw3_del();
				break;

				default : System.out.println("REEOE");
		}
		list();
	}

	public void sw2_list(){
		
		int i = n;
		System.out.print("�̸� : ");
		name[i] = s.next();
		System.out.print("��ȭ��ȣ : ");
		tel[i] = s.next();
		System.out.print("�ּ� : ");
		adr[i] = s.next();
	
		put();
		list();
	}
	public void sw3_del(){
		
		for (int i=0;i<n;i++){
			if(name[i]!=null||tel[i]!=null||adr[i]!=null)
			System.out.printf("No.%d �̸� : %3s ��ȭ��ȣ : %s �ּ� : %4s\n",i+1,name[i],tel[i],adr[i]);
		}
		System.out.print("������ ��ȣ : ");
		int sel2 = s.nextInt();
		
		for (int i=0;i<n;i++){
			if(sel2 == i+1){
				name[i]=null;
				tel[i]=null;
				adr[i]=null;
			}
		}
		put();
	}

	public static void main(String[] args) {
		
		Test1 t = new Test1();
	//	Test[] t = new Test[10];
		t.list();

			
	}

}

