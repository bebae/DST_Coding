//0310 #3 3���� = �߰�+�⸻+����Ʈ+�⼮
package test3;
import java.util.Scanner;

public class Test {
//�ʵ�/�������
	private int mid;
	private int fin;
	private int rpt;
	private int chul; 
	
//������ : ��ü �����ϰ� �ʱ�ȭ
	public Test() {}
	
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

	public int proc()
	{
	// tot local var.
		int tot = this.mid + this.fin + this.rpt + this.chul;
		if (this.chul <=0 ) tot =0; //��F
        return tot;
	}
	
	public String grade(int tot) 
	{ // ���� ���� ���ϴ� ���
		String hakjum; //��������
		if (tot >= 95) hakjum = "A+";
		else if (tot >= 90) hakjum = "A0";
		else if (tot >= 85) hakjum = "B+";
		else if (tot >= 80) hakjum = "B0";
		else if (tot >= 75) hakjum = "C+";
		else if (tot >= 70) hakjum = "C0";
		else
			hakjum = "F";
	    return hakjum;
	}
	public void output(int i, int tot, String hakjum)
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

		int tot;
		String hakjum;
		Scanner s = new Scanner(System.in); //��ĳ�� ��ü ����

		Test t = new Test();
		t.title();	
		for (int i=0; i<3; i++)
		{
			t.input();               //�Էµ���Ÿ ����
			tot = t.proc();          //���� ���
			hakjum = t.grade(tot);   //���� ���
			t.output(i,tot, hakjum); //��� ���
		}
	}
}