//0310 #2 3���� = �߰�+�⸻+����Ʈ+�⼮
package test2;
import java.util.Scanner;

public class Test {
//�ʵ�/�������
	private int mid;
	private int fin;
	private int rpt;
	private int chul; 
//������ : ��ü �����ϰ� �ʱ�ȭ
	public Test()
	{
		this.mid = (int)(Math.random()*31);
		this.fin = (int)(Math.random()*41);
		this.rpt = (int)(Math.random()*21);
		this.chul = (int)(Math.random()*11);
	}
//�޼ҵ�/����Լ�
	public int proc()
	{
	// tot local var.
		int tot = this.mid + this.fin + this.rpt + this.chul;
		if (this.chul <=0 ) tot =0; //��F
        return tot;
	}
	
	public void output(int i, int tot)
	{
		//output
		System.out.printf("%3d",i);
		System.out.printf("%4d",mid);
		System.out.printf("%4d",fin);
		System.out.printf(" %4d",rpt);
		System.out.printf("%4d",chul);
		System.out.printf(" %4d",tot);
		System.out.println("\n-------------------------");
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); //��ĳ�� ��ü ����

		System.out.println("���� �߰� �⸻ ����Ʈ �⼮ ����");
		System.out.println("---------------------------");
		
		for (int i=0; i<3; i++)
		{
			Test t = new Test();
			int tot = t.proc();
			t.output(i,tot);
		}
	}
}