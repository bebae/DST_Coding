//0310 #3 3명성적 = 중간+기말+리포트+출석
package test3;
import java.util.Scanner;

public class Test {
//필드/멤버변수
	private int mid;
	private int fin;
	private int rpt;
	private int chul; 
	
//생성자 : 객체 생성하고 초기화
	public Test() {}
	
	public void title() 
	{
		System.out.println("순번 중간 기말 리포트 출석 총점 학점");
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
		if (this.chul <=0 ) tot =0; //결F
        return tot;
	}
	
	public String grade(int tot) 
	{ // 모듈식 학점 구하는 기능
		String hakjum; //지역변수
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
		Scanner s = new Scanner(System.in); //스캐너 객체 생성

		Test t = new Test();
		t.title();	
		for (int i=0; i<3; i++)
		{
			t.input();               //입력데이타 생성
			tot = t.proc();          //총점 계산
			hakjum = t.grade(tot);   //학점 계산
			t.output(i,tot, hakjum); //결과 출력
		}
	}
}