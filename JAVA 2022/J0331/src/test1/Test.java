// 0331 #1 name mid fin rpt chul class
package test1;

public class Test {

	public static void main(String[] args) {
	
		String[] f_name = {"��","��","��","��","��","Ȳ","��","��"};
		String[] m_name = {"��","��","��","��","��","��","��","��"};
		String[] l_name = {"��","ö","��","��","��","��","��","��"};
		String name;
		int mid, fin, rpt, chul;
		
		name = f_name[(int)(Math.random()*7)] + m_name[(int)(Math.random()*7)]
               + l_name[(int)(Math.random()*7)];
		mid = (int)(Math.random()*30+1);
		fin = (int)(Math.random()*40+1);
		rpt = (int)(Math.random()*20+1);
		chul =(int)(Math.random()*10+1);
		int tot = mid + fin + rpt + chul;
		
		System.out.println("����  �߰� �⸻ ���� �⼮ ����");
		System.out.println("------------------------");
		System.out.printf("%3s %2d  %2d  %2d  %2d  %3d",name,mid,fin,rpt,chul,tot);
	}
}
