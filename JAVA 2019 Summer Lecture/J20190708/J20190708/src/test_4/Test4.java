package test_4;
	// ����ó�� mid,finrpt,chul
import java.util.Scanner;
	
public class Test4 {
	//member data  field
	int mid, fin, rpt, chul;
	int tot;
	String hak;
	
	public Test4() {	// ������
	// public Test(mid)

	Scanner s = new Scanner(System.in);

	
	System.out.print("mid : ");
	this.mid = s.nextInt();				// scanf("",&) include stdio.h
	
	System.out.print("fin : ");
	this.fin = s.nextInt();
	
	System.out.print("rpt : ");
	this.rpt = s.nextInt();
	
	System.out.print("chul : ");
	this.chul = s.nextInt();
	}
	
	// member �żҵ�/function(��)
	public void hap() {
		this.tot = this.mid+this.fin+this.rpt+this.chul;
		
		if (this.tot>90) this.hak="A";
		else if (tot>80) this.hak="B";
		else if (tot>70) this.hak="C";
		else this.hak="F";
	
		System.out.println("�� = "+this.tot+" ��� = "+this.hak);
	}
	
	public static void main(String[] args) {
	
		Test4 one = new Test4();		// ������ �ʱ�ȭ
		one.hap();						// 
		
		Test4 two = new Test4();
		two.hap();
		
		
		
		
		
			
		
	}
}
