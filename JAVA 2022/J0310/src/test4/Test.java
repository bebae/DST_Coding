//0310 #4 3���� = �߰�+�⸻+����Ʈ+�⼮
package test4;
import java.util.Scanner;

public class Test {
//�ʵ�/�������
	private int mid;
	private int fin;
	private int rpt;
	private int chul;
	private int tot;
	private String hakjum;
	
//������ : ��ü �����ϰ� �ʱ�ȭ
	public Test() 
	{
		this.mid = this.fin = this.rpt = this.chul = this.tot = 0;
		this.hakjum = "";
	}
	
	public void title() 
	{
		System.out.println("���� �߰� �⸻ ����Ʈ �⼮ ���� ����");
		System.out.println("------------------------------");
	}
	
	public void input()
	{
		this.mid = (int)(Math.random()*31);
		this.fin = (int)(Math.random()*41);
		this.rpt = (int)(Math.random()*21);
		this.chul = (int)(Math.random()*11);
	}

	public void proc()
	{
	// tot local var.
		this.tot = this.mid + this.fin + this.rpt + this.chul;
		if (this.chul <=0 ) this.tot =0; //��F
        //return tot;
	}
	
	public void grade() 
	{ // ���� ���� ���ϴ� ���
		if (tot >= 95) this.hakjum = "A+";
		else if (tot >= 90) this.hakjum = "A0";
		else if (tot >= 85) this.hakjum = "B+";
		else if (tot >= 80) this.hakjum = "B0";
		else if (tot >= 75) this.hakjum = "C+";
		else if (tot >= 70) this.hakjum = "C0";
		else
			this.hakjum = "F";
	    //return hakjum;
	}
	public void output(int i)
	{
		//output
		System.out.printf("%3d",i);
		System.out.printf("%4d",mid);
		System.out.printf("%4d",fin);
		System.out.printf(" %4d",rpt);
		System.out.printf("%4d",chul);
		System.out.printf(" %4d",tot);
		System.out.printf(" %3s",hakjum);
		System.out.println("\n-------------------------------");
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); //��ĳ�� ��ü ����

		Test t = new Test();
		t.title();	
		for (int i=0; i<3; i++)
		{
			t.input();               //�Էµ���Ÿ ����
			t.proc();          //���� ���
			t.grade();   //���� ���
			t.output(i); //��� ���
		}
	}
}